package com.example.lab2_recyclerview

import android.util.Log
import android.util.Pair
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter
    (private val mDataset: ArrayList<Pair<Int, String>>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun getItemCount(): Int {
        return mDataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, ViewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.new_linear_layout, parent, false)
        Log.d("Adapter", "OnCreateViewHolder")
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(vh: MyViewHolder, position: Int) {
        Log.d("Adapter", "OnBindViewHolder for position: $position")
        vh.mTextView.text = mDataset[position].second
        vh.mImageView.setImageResource(mDataset[position].first)
    }
}

