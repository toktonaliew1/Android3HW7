package com.example.android3hw7.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android3hw7.ui.adapters.Adapter
import com.example.android3hw7.model.Model
import com.example.android3hw7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAdapter()
    }

    private fun setupAdapter() {
        val list: List<Model> = arrayListOf(
            Model("Arsen"),
            Model("Aslan"),
            Model("Arzymat"),
            Model("Alexandr"),
            Model("Suhrab"),
            Model("Aman"),
        )
        adapter = Adapter(list)
        binding.recycler.adapter = adapter
    }
}