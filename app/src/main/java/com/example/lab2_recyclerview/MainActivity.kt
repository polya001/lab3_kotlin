package com.example.lab2_recyclerview

import android.os.Bundle
import android.util.Pair
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mRecyclerView = findViewById<View>(R.id.my_recycler_view) as RecyclerView
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = CustomAdapter(generateContent())
    }

    private fun generateContent(): ArrayList<Pair<Int, String>> {
       val images = arrayOf(
            R.drawable.cactus_0,
            R.drawable.cactus_1,
            R.drawable.cactus_2,
            R.drawable.cactus_3
        )

        val content = ArrayList<Pair<Int, String>>()

        for (i in 1..20) {
            content.add(Pair(images[i % 4], "Cactus number $i"))
        }
        return content
    }
}