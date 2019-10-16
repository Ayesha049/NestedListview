package com.ayeshaproject.nestedlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InnerAdapter extends ArrayAdapter<Model> {
    public InnerAdapter(Context context, ArrayList<Model> Models) {
        super(context, 0, Models);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Model model = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.inner_list_item, parent, false);
        }

        TextView name = convertView.findViewById(R.id.name);
        name.setText(model.name);

        return convertView;
    }
}