package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button b1, b2;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        recyclerView = findViewById(R.id.recview);

        ArrayList<FoodClass> foods = new ArrayList<>();
        foods.add(new FoodClass("Food 1", R.drawable.food1));
        foods.add(new FoodClass("Food 2", R.drawable.food2));
        foods.add(new FoodClass("Food 3", R.drawable.food3));
        foods.add(new FoodClass("Food 4", R.drawable.food4));
        FoodAdapter adapter = new FoodAdapter(foods, this);
        GridLayoutManager manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager new1 = new LinearLayoutManager(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.setLayoutManager(new1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.setLayoutManager(manager);
            }
        });
    }
}