package com.example.datarecieve

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val userList : ArrayList<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item,
        parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = userList[position]

        holder.location.text = currentitem.location
        holder.inTime.text = currentitem.inTime
        holder.outTime.text = currentitem.outTime
        holder.readerUID.text = currentitem.readerUID

    }

    override fun getItemCount(): Int {

        return userList.size
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val location : TextView = itemView.findViewById(R.id.loc)
        val inTime : TextView = itemView.findViewById(R.id.inti)
        val outTime : TextView = itemView.findViewById(R.id.outi)
        val readerUID : TextView = itemView.findViewById(R.id.uid)

    }

}