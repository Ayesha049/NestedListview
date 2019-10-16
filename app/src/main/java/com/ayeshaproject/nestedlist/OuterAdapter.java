package com.ayeshaproject.nestedlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class OuterAdapter extends ArrayAdapter<OuterModel> {

    Context mcontext;

    public OuterAdapter(Context context, ArrayList<OuterModel> OuterModels) {

        super(context, 0, OuterModels);
        mcontext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        OuterModel outerModel = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.outer_list_item, parent, false);
        }

        TextView date = convertView.findViewById(R.id.date);
        date.setText(outerModel.date);

        InnerAdapter madapter = new InnerAdapter(convertView.getContext(),outerModel.arr);

        ListView listView = (ListView) convertView.findViewById(R.id.inner_list);

        listView.setAdapter(madapter);

        return convertView;
    }
}