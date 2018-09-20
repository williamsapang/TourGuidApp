package com.example.samsophias.tourguidapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BudgetFragment extends Fragment {

    final ViewGroup nullParent = null;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    View view;
    ArrayList<List> budget;

    public BudgetFragment() {
    }

    // TODO: Rename and change types and number of parameters
    public static BudgetFragment newInstance(ArrayList<List> budget) {
        BudgetFragment fragment = new BudgetFragment();
        fragment.budget = budget;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.recycle, nullParent);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);


        adapter = new CardAdapter(budget);
        recyclerView.setAdapter(adapter);
        return view;
    }
}