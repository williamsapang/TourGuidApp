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

    public BudgetFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.recycle, nullParent);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        final ArrayList<List> budget = new ArrayList<>();
        budget.add(new List(R.drawable.budgetcaf1, R.string.cafe_aras, R.string.budget_desc1));
        budget.add(new List(R.drawable.budgetcaf2, R.string.cafe_kanaan, R.string.budget_desc2));
        budget.add(new List(R.drawable.budgetcaf3, R.string.rimiko_restaurant, R.string.budget_desc3));


        adapter = new CardAdapter(budget);
        recyclerView.setAdapter(adapter);
        return view;
    }
}