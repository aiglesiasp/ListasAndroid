package com.aiglesiaspubill.listasandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aiglesiaspubill.listasandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createRecycler()

    }

    private fun createRecycler() {
        binding.recyckerViewItems.adapter = MainAdapter()
        binding.recyckerViewItems.layoutManager = LinearLayoutManager(this)
    }
}