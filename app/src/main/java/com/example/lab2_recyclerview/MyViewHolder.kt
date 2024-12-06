package com.example.lab2_recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    var mImageView: ImageView = v.findViewById(R.id.image_item)
    var mTextView: TextView = v.findViewById(R.id.text_item)
}

