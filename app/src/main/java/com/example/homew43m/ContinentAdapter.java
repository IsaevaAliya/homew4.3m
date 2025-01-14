package com.example.homew43m;



import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.homew43m.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {

    private ArrayList<String> continentList;
    private OnItemClick onItemClick;

    public ContinentAdapter(ArrayList<String> countryList, OnItemClick onClick) {
        this.continentList = countryList;
        this.onItemClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.onBind(continentList.get(position));
        holder.itemView.setOnClickListener(v -> {
            onItemClick.onItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder{

    private ItemContinentBinding binding;
    public ContinentViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void onBind(String continent){
        binding.textViewContinent.setText(continent);
    }
}