package com.example.lab2_recyclerview;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public ImageView mImageView;
    public TextView mTextView;
    public MyViewHolder(View v) {
        super(v);
        mTextView = v.findViewById(R.id.text_item);
        mImageView = v.findViewById(R.id.image_item);
    }
}

