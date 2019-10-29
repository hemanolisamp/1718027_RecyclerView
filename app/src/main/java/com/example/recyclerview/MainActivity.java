package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga_Abi> keluargaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_1);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(LayoutManager);
        recyclerView.setAdapter(adapter);


    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga_Abi("Muhammad Sai'in", "Abi", R.drawable.abi));
        keluargaArrayList.add(new Keluarga_Abi("Nor Cahaya", "Mamah", R.drawable.mamah));
        keluargaArrayList.add(new Keluarga_Abi("Hemanolisa Monika Putri", "Hema", R.drawable.hema));
        keluargaArrayList.add(new Keluarga_Abi("Nazwa Aula Putri", "Wawa", R.drawable.nazwa));
    }

}