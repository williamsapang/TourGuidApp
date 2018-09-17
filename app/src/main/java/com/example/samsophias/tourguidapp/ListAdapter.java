package com.example.samsophias.tourguidapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ListAdapter extends ArrayAdapter<List> {

    ListAdapter(@NonNull Activity context, ArrayList<List> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View listItemView, @NonNull ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        List placeItem = getItem(position);
        TextView placeName = listItemView.findViewById(R.id.place_name);
        TextView placeDescription = listItemView.findViewById(R.id.textView2);
        ImageView placeImage = listItemView.findViewById(R.id.imageView2);

        assert placeItem != null;
        placeName.setText(placeItem.getInfo2());
        placeDescription.setText(placeItem.getInfo3());
        placeImage.setImageResource(placeItem.getInfo());

        return listItemView;
    }
}