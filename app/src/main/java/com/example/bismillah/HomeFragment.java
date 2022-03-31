package com.example.bismillah;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

public class HomeFragment extends Fragment {

   RecyclerView recyclerView3;
   TextView seall;

    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rec_1);
        recyclerView3 = view.findViewById(R.id.rec_3);
        recycler_1_adapter adapter = new recycler_1_adapter(getContext());
        recycler_3_adapter recycler3Adapter = new recycler_3_adapter(getContext());
        recyclerView.setAdapter(adapter);
        recyclerView3.setAdapter(recycler3Adapter);
        seall = view.findViewById(R.id.see_all_cat);





        return view;


    }


}