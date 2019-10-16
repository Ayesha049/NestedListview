package com.ayeshaproject.nestedlist;

import java.util.ArrayList;

public class OuterModel {
    public String date;
    public ArrayList<Model> arr;


    public OuterModel(String date, ArrayList<Model> arr) {
        this.date = date;
        this.arr = arr;
    }
}
