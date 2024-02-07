package com.example.rvproject_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rvproject_2.Adapter.RvAdapter
import com.example.rvproject_2.Utils.obj
import com.example.rvproject_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var rvAdapter: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        obj.addList()

        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 3)
        binding.rv.layoutManager = layoutManager

        rvAdapter = RvAdapter(this, obj.list)
        binding.rv.adapter = rvAdapter
    }
}