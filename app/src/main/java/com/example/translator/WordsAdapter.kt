package com.example.translator

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordsAdapter(var context: MainActivity ): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var list:ArrayList<Data> = ArrayList()
    @SuppressLint("NotifyDataSetChanged")
    fun filterList(dataList: List<Data>){
        list.clear()
        list = dataList as ArrayList<Data>
        notifyDataSetChanged();
    }

    fun getData() = list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rw_words,parent,false)
        return WordsViewHolder(view)
    }

    class WordsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val word: TextView = view.findViewById(R.id.word)
        val desc: TextView = view.findViewById(R.id.desc)
        val layout:LinearLayout = view.findViewById(R.id.lay)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val data = list[position]
        if (holder is WordsViewHolder) {
            holder.word.text = data.word
            holder.desc.text = data.description
            holder.layout.setOnClickListener {
                context.toDataActivity(data)
            }
        }
    }

    override fun getItemCount() = list.size
}