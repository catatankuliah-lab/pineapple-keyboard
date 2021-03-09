package com.example.pineapplekeyboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListKeyboardAdapter(val listKeyboard: ArrayList<Keyboard>) : RecyclerView.Adapter<ListKeyboardAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_keyboard, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val keyboard = listKeyboard[position]
        Glide.with(holder.itemView.context)
            .load(keyboard.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = keyboard.name
        holder.tvDetail.text = keyboard.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listKeyboard[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listKeyboard.size
    }

//    fun setOnItemClickCallback(onItemClickCallback: ListKeyboardAdapter.OnItemClickCallback) {
//
//    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.textview_keyboard_name)
        var tvDetail: TextView = itemView.findViewById(R.id.textview_keyboard_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.image_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Keyboard)
    }

}