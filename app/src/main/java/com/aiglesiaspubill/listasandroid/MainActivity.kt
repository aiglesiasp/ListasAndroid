package com.aiglesiaspubill.listasandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aiglesiaspubill.listasandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter = MainAdapter()

    private val list = List<String>(40) {
        "Soy el elemento $it"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createRecycler()

    }

    private fun createRecycler() {
        adapter.updateList(list)
        binding.recyckerViewItems.adapter = adapter
        binding.recyckerViewItems.layoutManager = LinearLayoutManager(this)
    }
}