package com.example.homeworkfive


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemview.view.*
import android.content.Context


class MyAdapter(var context: Context,var list:ArrayList<Food>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.itemView.image1.setImageResource(list[position].image)
        holder.itemView.item.text = list[position].name
        holder.itemView.image1.setOnClickListener(){
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("image", list[position].image)
            intent.putExtra("name", list[position].name)
            intent.putExtra("detail",list[position].recipe)
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
        return list.size
    }
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
