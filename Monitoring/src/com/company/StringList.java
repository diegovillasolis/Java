package com.company;

import java.util.ArrayList;

public class StringList {
    private ArrayList<String> data;

    public StringList(){
        data = new ArrayList<>();
    }

    public StringList(ArrayList<String> data){
        this.data = data;
    }

    public void addString(String element){
        data.add(element);
    }

    public int size() {
        return data.size();
    }
}
