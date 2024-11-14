package com.example.lab2_recyclerview;


import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private final ArrayList<Pair<Integer,String>> mDataset;
    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    @NonNull
    public MyViewHolder onCreateViewHolder (ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_linear_layout, parent, false);
        Log.d("Adapter", "OnCreateViewHolder");
        return new MyViewHolder(view);
    }
    public void onBindViewHolder(MyViewHolder vh, int position) {
        Log.d("Adapter", "OnBindViewHolder for position: " + position);
        vh.mTextView.setText(mDataset.get(position).second);
        vh.mImageView.setImageResource(mDataset.get(position).first);
    }
    // Provide a suitable constructor (depends on the kind of dataset)
    public CustomAdapter(ArrayList<Pair<Integer,String>> myDataset) {
        mDataset = myDataset;
    }
}

