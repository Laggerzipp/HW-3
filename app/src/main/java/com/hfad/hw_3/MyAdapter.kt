package com.hfad.hw_3

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hfad.hw_3.databinding.ItemLayoutBinding

class MyAdapter(val context: Context):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    val items = ArrayList<CountryItem>()

    class MyViewHolder(view: View, context: Context):RecyclerView.ViewHolder(view){
        val binding = ItemLayoutBinding.bind(view)
        fun bind(item: CountryItem, context: Context) = with(binding){
            Glide.with(context).load(item.imageUrl).into(imView);
            tvInfo.text = item.title
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.bind(items[position], context)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addItems(list: List<CountryItem>){
        items.addAll(list)
        notifyDataSetChanged()
    }
}