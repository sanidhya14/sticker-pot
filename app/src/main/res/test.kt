package com.example.stickerpot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

class test : AppCompatActivity() {

    private val viewModel: StickerPackViewModel =
        ViewModelProvider(this).get(StickerPackViewModel::class.java)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_activity, container, false)
    }
}