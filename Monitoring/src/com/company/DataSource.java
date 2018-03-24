package com.company;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private ArrayList<String> data;

    public DataSource(){
        data = new ArrayList<>();
    }

    public DataSource(ArrayList<String> data){
        this.data = data;
    }

    public void add(String element){
        data.add(element);
    }

    public int size() {
        return data.size();
    }

    public List<String> subList(int currentDataSourceLength, int dataSourceLength) {
        return data.subList(currentDataSourceLength, dataSourceLength);
    }
}
