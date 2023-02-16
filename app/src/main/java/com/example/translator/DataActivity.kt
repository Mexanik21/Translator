package com.example.translator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class DataActivity : AppCompatActivity() {
    lateinit var fab:FloatingActionButton
    lateinit var dialog:DeleteDataDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        initViews()
    }

    private fun initViews() {
        val myObject = intent.getSerializableExtra("data") as Data
        findViewById<TextView>(R.id.words).text = myObject.word
        findViewById<TextView>(R.id.tr).text = myObject.transcription
        findViewById<TextView>(R.id.dr).text = myObject.description
        fab = findViewById(R.id.fab2)
        dialog = DeleteDataDialog()

        fab.setOnClickListener {
            openDialog()
            dialog.getData(myObject)
        }

    }

    private fun openDialog() {
        dialog.show(supportFragmentManager,"Delete Data")
    }
    fun finishActivity(){
        finish()
    }
}