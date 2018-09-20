package com.example.samsophias.tourguidapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ExpensiveFragment extends Fragment {


    final ViewGroup nullParent = null;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    View view;

    ArrayList<List> costly;

    public ExpensiveFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ExpensiveFragment newInstance(ArrayList<List> costly) {
        ExpensiveFragment fragment = new ExpensiveFragment();
        fragment.costly = costly;
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

        adapter = new CardAdapter(costly);
        recyclerView.setAdapter(adapter);
        return view;
    }


}
