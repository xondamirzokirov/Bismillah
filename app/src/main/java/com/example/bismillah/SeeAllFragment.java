package com.example.bismillah;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SeeAllFragment extends Fragment {
    RecyclerView recycler_2_adapter;

    public SeeAllFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_see_all, container, false);
        recycler_2_adapter recycler2Adapter = new recycler_2_adapter(getContext());

        recycler_2_adapter.setAdapter(recycler2Adapter);






        return view;
    }
}