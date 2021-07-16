package com.example.stickerpot.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.stickerpot.R
import com.example.stickerpot.models.StickerPack

class StickerPackRecyclerViewAdapter(private val dataset: ArrayList<StickerPack>) :
    RecyclerView.Adapter<StickerPackRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val stickerPackView: TextView = itemView.findViewById(R.id.stickerPackName)
        val stickerPackImage: ImageView = itemView.findViewById(R.id.stickerPackImage)
    }

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): StickerPackRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.sticker_pack, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        viewHolder: StickerPackRecyclerViewAdapter.ViewHolder,
        position: Int
    ) {
        val stickerPack = dataset[position]
        viewHolder.stickerPackView.text = stickerPack.packName
        viewHolder.stickerPackImage.setImageBitmap(stickerPack.image)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}