package com.ayeshaproject.nestedlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ArrayList<OuterModel> arrayOfUsers = new ArrayList<OuterModel>();

        OuterAdapter madapter = new OuterAdapter(this, arrayOfUsers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(madapter);


        ArrayList<Model> arr = new ArrayList<Model>();
        arr.add(new Model("ayesha"));
        madapter.add(new OuterModel("2/3/2014",arr));
        ArrayList<Model> arr1 = new ArrayList<Model>();
        arr1.add(new Model("hello"));

        madapter.add(new OuterModel("23/3/2014",arr1));

        ArrayList<Model> arr2 = new ArrayList<Model>();
        arr2.add(new Model("arr2"));

        madapter.add(new OuterModel("5/3/2014",arr2));
        ArrayList<Model> arr3 = new ArrayList<Model>();
        arr3.add(new Model("hello"));
        arr3.add(new Model("hello"));
        arr3.add(new Model("hello"));
        arr3.add(new Model("hello"));

        madapter.add(new OuterModel("12/3/2014",arr3));
        madapter.add(new OuterModel("12/3/2014",arr));
        madapter.add(new OuterModel("12/3/2014",arr));
        madapter.add(new OuterModel("12/3/2014",arr));
        madapter.add(new OuterModel("12/3/2014",arr));
        madapter.add(new OuterModel("12/3/2014",arr));







    }
}
