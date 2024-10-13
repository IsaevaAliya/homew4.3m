package com.example.homew43m;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClick {

    ArrayList<String> continents = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ContinentAdapter adapter = new ContinentAdapter(continents, this);
        recyclerView.setAdapter(adapter);
    }
    public void data(){
        continents.add("Europe");
        continents.add("Africa");
        continents.add("Antarctica");
        continents.add("Asia");
        continents.add("North America");
        continents.add("Australia");
        continents.add("south America");
    }
    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, ActivityCountry.class);
        String continent = continents.get(position);
        intent.putExtra("continent", continent);  // "key1" — это ключ, через который мы передаем данные
        startActivity(intent);
    }
}