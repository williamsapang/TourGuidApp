package com.example.samsophias.tourguidapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SouvenirFragment extends Fragment {
    View view;
    android.widget.ListAdapter listAdapter;
    ListView listView;


    public SouvenirFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_souvenir, container, false);
        final ArrayList<List> souvenir = new ArrayList<>();
        souvenir.add(new List(R.drawable.souvenir1, R.string.toko_ecky, R.string.souvenir1_desc));
        souvenir.add(new List(R.drawable.souvenir2, R.string.toko_dodo, R.string.souvenir2_desc));


        listAdapter = new com.example.samsophias.tourguidapp.ListAdapter(getActivity(), souvenir);
        listView = (ListView) view.findViewById(R.id.souvenir_list);
        listView.setAdapter(listAdapter);


        return view;
    }
}
