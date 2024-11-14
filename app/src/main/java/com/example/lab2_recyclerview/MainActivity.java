package com.example.lab2_recyclerview;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Pair;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new CustomAdapter(generateContent()));


    }

    private ArrayList<Pair<Integer,String>> generateContent() {
        //я пыталась придумать, как сделать подгрузку изображений без костыльного массива, но не придумала пока((
        Integer [] images= {R.drawable.cactus_0,R.drawable.cactus_1,R.drawable.cactus_2,R.drawable.cactus_3};

        ArrayList <Pair<Integer,String>> content = new ArrayList<Pair<Integer,String>>();

        for (int i=1; i<20; i++) {
            content.add(new Pair<>(images[i%4],"Plant number " + i));
        }
        return content;
    }

}