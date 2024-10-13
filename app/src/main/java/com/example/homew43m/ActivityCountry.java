package com.example.homew43m;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homew43m.databinding.ActivityCountryBinding;

import java.util.ArrayList;

public class ActivityCountry extends AppCompatActivity implements OnItemClick {

    ArrayList<String> continents = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        Intent intent = getIntent();
        String continent = intent.getStringExtra("continent");
        load(continent);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        ContinentAdapter adapter = new ContinentAdapter(continents, this);
        recyclerView.setAdapter(adapter);

    }

    public void load(String continent){
        if(continent.equals("Asia")){
            continents.add("Japan");
            continents.add("Tokyo");

        }
        else if(continent.equals("Africa")){
            continents.add("Tanzania");
            continents.add("Dodom");
        }
        else if(continent.equals("Australia")){
            continents.add("Sydney");
            continents.add("Canberra");
        }
        else if(continent.equals("Antarctica")){
            continents.add("Argentina");
            continents.add("Buenos Aires");
        }
        else if(continent.equals("North America")){
            continents.add("Canada");
            continents.add("Ottawa");
        }
        else if(continent.equals("South America")){
            continents.add("Bolivia");
            continents.add("Sucre");
        }

        else if(continent.equals("Europe")){
            continents.add("Spain");
            continents.add("Madrid");
        }

    }


    @Override
    public void onItemClick(int position) {

    }
}