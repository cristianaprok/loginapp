package com.example.proyecto_final;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DerrumbeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    ArrayList<Derrumbe> listDerrumbes = new ArrayList<>();

    public DerrumbeAdapter (Context ctx){
        this.context = ctx;
    }

    public void setItems(ArrayList<Derrumbe> derrumbe){
        listDerrumbes.addAll(derrumbe);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
