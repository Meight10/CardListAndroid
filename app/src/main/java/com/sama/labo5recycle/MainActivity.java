package com.sama.labo5recycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Planetas> planetList;
    RecyclerView recyclerView;
    PLanetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        planetList = fillList();

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        adapter = new PLanetAdapter(this, planetList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Planetas> fillList(){
        ArrayList<Planetas> planetas = new ArrayList<>();
        String desc = "La comercializacion inmediata de los juegos de la economia mundial es una estupenda forma de formatear la profundidad de los oceanos";

        planetas.add(new Planetas("Ella", desc, 1));
        planetas.add(new Planetas("Ella contraataca", desc, 2));
        planetas.add(new Planetas("EL retorno de ella", desc, 3));

        return planetas;
    }
}
