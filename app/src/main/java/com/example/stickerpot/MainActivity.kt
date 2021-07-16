package com.example.stickerpot

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.stickerpot.adapters.StickerPackRecyclerViewAdapter
import com.example.stickerpot.models.StickerPack


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var dataList = arrayListOf<StickerPack>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        recyclerView = findViewById(R.id.recyclerView)
        val assetManager = assets
        val imagePathList = assetManager.list("stickers")

        if (imagePathList != null) {
            for (imagePath in imagePathList) {
                dataList.add(
                    StickerPack(
                        imagePath.dropLast(4),
                        BitmapFactory.decodeStream(assetManager.open("stickers/$imagePath"))
                    )
                )
            }
        }
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = StickerPackRecyclerViewAdapter(dataList)
    }
}