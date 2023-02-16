package com.example.translator

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    lateinit var adapter: WordsAdapter
    lateinit var fab:FloatingActionButton
    lateinit var context: Context
    lateinit var dialog: SaveDataDialog
    lateinit var rv:RecyclerView
    lateinit var appDataBase: AppDataBase
    var dataList: List<Data> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        context = this
        rv = findViewById(R.id.rw)
        fab = findViewById(R.id.floatingActionButton)
        appDataBase = AppDataBase.getInstance(context)
        fab.setOnClickListener {
            openDialog()
        }
        buildRecyclerView()
    }

    private fun buildRecyclerView() {
        adapter = WordsAdapter(this)
        rv.layoutManager = GridLayoutManager(context,1)
        appDataBase.dataDao().getAllData().observe({ lifecycle }, {
            dataList = it
            adapter.filterList(dataList)
        })
        rv.adapter = adapter
    }

    private fun openDialog() {
        dialog = SaveDataDialog()
        dialog.show(supportFragmentManager,"Save Data")
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // below line is to get our inflater
        val inflater = menuInflater

        // inside inflater we are inflating our menu file.
        inflater.inflate(R.menu.menu, menu)

        // below line is to get our menu item.
        val searchItem: MenuItem = menu.findItem(R.id.search_bar)

        // getting search view of our item.
        val searchView: SearchView = searchItem.getActionView() as SearchView

        // below line is to call set on query text listener method.
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                // inside on query text change method we are
                // calling a method to filter our recycler view.
                filter(newText)
                return false
            }
        })
        return true
    }

    private fun filter(text: String) {
        // creating a new array list to filter our data.
        val filteredlist: ArrayList<Data> = ArrayList<Data>()

        dataList = appDataBase.dataDao().getAllDa()
        // running a for loop to compare elements.
        for (item in dataList) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.word.toLowerCase().contains(text.lowercase(Locale.getDefault()))) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item)
            }
        }
        if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "No Data Found..", Toast.LENGTH_SHORT).show()
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            adapter.filterList(filteredlist)
        }
    }

    fun toDataActivity(data: Data) {
        var intent = Intent(context,DataActivity::class.java)
        intent.putExtra("data", data)
        startActivity(intent)
    }
}