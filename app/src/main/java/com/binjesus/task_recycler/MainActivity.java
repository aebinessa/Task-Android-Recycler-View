package com.binjesus.task_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.binjesus.task_recycler.adapter.currencyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private ArrayList<Currency> currencyList = new ArrayList<>();

    RecyclerView currencyRecyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyRecyclerView = findViewById(R.id.currencyRecyclerView);
        currencyAdapter adapter = new currencyAdapter(currencyList);
        currencyRecyclerView.setAdapter(adapter);
        currencyRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        currencyList.add(new Currency("KWD","Kuwaiti Dinar",1));
        currencyList.add(new Currency("USD","US Dollar",0.3));
        currencyList.add(new Currency("AUS","Australian Dollar",0.2));
        currencyList.add(new Currency("JPY"," Japanese Yen",0.0021));
        currencyList.add(new Currency("SAR"," Saudi Riyal",0.082));
        currencyList.add(new Currency("QAR","Qatari Riyal",0.084));
        currencyList.add(new Currency("MXN","Mexican Peso",0.018));
        currencyList.add(new Currency("CHF","Swiss Franc",0.36));
        currencyList.add(new Currency("ZAR","South African Rand",0.016));
        currencyList.add(new Currency("MAD","Moroccan Dirham",0.031));













    }
}