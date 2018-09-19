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

    public ExpensiveFragment() {
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
        final ArrayList<List> costly = new ArrayList<>();
        costly.add(new List(R.drawable.costlycaf1, R.string.house_bistro, R.string.costly_desc1));
        costly.add(new List(R.drawable.costlycaf2, R.string.pong_buri, R.string.costly_desc2));
        costly.add(new List(R.drawable.costlycaf3, R.string.saruran, R.string.costly_desc3));
        costly.add(new List(R.drawable.costlycaf3, R.string.saruran, R.string.costly_desc3));


        adapter = new CardAdapter(costly);
        recyclerView.setAdapter(adapter);
        return view;
    }


}
