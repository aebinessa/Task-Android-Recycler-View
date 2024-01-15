package com.binjesus.task_recycler.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.binjesus.task_recycler.Currency;
import com.binjesus.task_recycler.R;

import java.util.ArrayList;

public class currencyAdapter extends RecyclerView.Adapter<currencyAdapter.ViewHolder> {
    private ArrayList<Currency> currencyList = new ArrayList<>();
    public currencyAdapter(ArrayList<Currency> currencyList) {
        this.currencyList = currencyList;
    }


    @NonNull
    @Override
    public currencyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_currency, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull currencyAdapter.ViewHolder holder, int position) {
     Currency currency = currencyList.get(position);
        holder.currencyTextView.setText(currency.getCurrencyCode());
        holder.currencyNameTextView.setText(currency.getCurrencyName());
        holder.exchangeRateTextView.setText(String.valueOf(currency.getExchangeRate()));



    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView currencyTextView;
        TextView currencyNameTextView;
        TextView exchangeRateTextView;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            currencyTextView = itemView.findViewById(R.id.currencyTextView);
            exchangeRateTextView = itemView.findViewById(R.id.exchangeRateTextView);
            currencyNameTextView = itemView.findViewById(R.id.currencyNameTextView);
        }
    }
}
