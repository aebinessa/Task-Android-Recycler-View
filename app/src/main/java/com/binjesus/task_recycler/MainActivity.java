package com.binjesus.task_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.binjesus.task_recycler.adapter.currencyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView currencyRecyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Currency> Currency = CurrencyRepo.getInstance().generateDummyCurrencyList();
        currencyRecyclerView = findViewById(R.id.currencyRecyclerView);
        currencyAdapter adapter = new currencyAdapter(Currency);
        currencyRecyclerView.setAdapter(adapter);
        currencyRecyclerView.setLayoutManager(new LinearLayoutManager(this));














    }
}