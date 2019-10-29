package com.example.taskrecyleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Food> foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setTitle("Home");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.rv_food);
        adapter = new FoodAdapter(foods, this);
        layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    protected void addData() {
        foods = new ArrayList<>();
        foods.add(new Food("Ayam Geprek", "Ayam geprek enak harga bersahabat", R.drawable.mina_chan, 12500));
        foods.add(new Food("Bebek Goreng", "Bebek Goreng gurih dengan sambal yang nampol", R.drawable.hello, 24000));
        foods.add(new Food("Sel Sel", "Cheese tea dengan kualitas dan rasa terbaik", R.drawable.coba, 13000));
        foods.add(new Food("Baskin Robbins", "Es krim asli Amerika dengan rasa yang mempesona", R.drawable.mina_chan, 25000));
    }
}
