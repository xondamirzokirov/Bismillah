package com.example.bismillah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycler_cart_adapter extends RecyclerView.Adapter<recycler_cart_adapter.CartHolder>  {

    Context context;

    public recycler_cart_adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CartHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_cart_item,parent,false);

        return new CartHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class CartHolder extends RecyclerView.ViewHolder {
        public CartHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
