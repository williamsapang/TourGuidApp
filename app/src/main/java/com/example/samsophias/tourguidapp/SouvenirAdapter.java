
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


public class SouvenirAdapter extends ArrayAdapter<List> {

    SouvenirAdapter(@NonNull Activity context, ArrayList<List> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View listItemView, @NonNull ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        List souvenirItem = getItem(position);
        TextView souvenirName = listItemView.findViewById(R.id.place_name);
        TextView souvenirDescription = listItemView.findViewById(R.id.textView2);
        ImageView souvenirImage = listItemView.findViewById(R.id.imageView2);

        assert souvenirItem != null;
        souvenirName.setText(souvenirItem.getInfo2());
        souvenirDescription.setText(souvenirItem.getInfo3());
        souvenirImage.setImageResource(souvenirItem.getInfo());

        return listItemView;
    }
}
