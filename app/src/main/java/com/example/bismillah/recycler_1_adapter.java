package com.example.bismillah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recycler_1_adapter extends RecyclerView.Adapter<recycler_1_adapter.MyviewHolder> {
        Context context;
        List<String> list;

    public recycler_1_adapter(Context context) {
        this.context = context;
//        this.list = list;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_1_item,parent,false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
            recycler_2_adapter adapter = new recycler_2_adapter(context);
            holder.rec.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        RecyclerView rec;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            rec = itemView.findViewById(R.id.rec_2);
        }
    }
}
