package com.training.recyclerviewinkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_items.view.*

class MainAdapter(val countryList: Array<String>, val context:Context) : RecyclerView.Adapter<MainAdapter.viewHolder>(){

    class viewHolder(view: View):RecyclerView.ViewHolder(view)
    {
        val txtView = view.textName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_items,parent,false)
        return  viewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
       holder.txtView.text = countryList[position]
    }

}