package com.example.bismillah;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;


public class CartFragment extends Fragment {

    RecyclerView recyclerView;

    public CartFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        recycler_cart_adapter recycler_cart_adapter = new recycler_cart_adapter(getContext());
        recyclerView = view.findViewById(R.id.rec_cart);
        recyclerView.setAdapter(recycler_cart_adapter);



        return  view;
    }
}