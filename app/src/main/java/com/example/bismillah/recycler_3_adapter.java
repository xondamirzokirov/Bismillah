package com.example.bismillah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recycler_3_adapter extends RecyclerView.Adapter<recycler_3_adapter.HeyViewHolder> {

    Context context;
    List<String> list;

    public recycler_3_adapter(Context context) {
        this.context = context;

    }



    @NonNull
    @Override
    public HeyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rec_3_item,parent,false);

        return new HeyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public  class HeyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        public HeyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.product_img);
        }
    }
}
