package com.example.samsophias.tourguidapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class PlaceFragment extends Fragment {

    View view;
    ListAdapter listAdapter;
    ListView listView;


    public PlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.list, container, false);
        final ArrayList<List> places = new ArrayList<>();
        places.add(new List(R.drawable.kete, R.string.ke_te_kesu, R.string.kete));
        places.add(new List(R.drawable.bori, R.string.borik, R.string.boris));


        listAdapter = new com.example.samsophias.tourguidapp.ListAdapter(getActivity(),places);
        listView = (ListView) view.findViewById(R.id.place_list);
        listView.setAdapter(listAdapter);


        return view;
    }
}

