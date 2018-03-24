package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Monitor {
    private DataSource dataSource;
    private int dataSourceLength;
    private Timer timer;
    private TimerTask task;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.dataSourceLength = dataSource.size();
    }

    public String verifyAdd() throws InterruptedException {
        final String[] res = new String[1];
        res[0] = "";
        timer = new Timer();
        TimerTask task = new TimerTask() {
            int currentDataSourceLength = dataSource.size();
            List<String> elementsAdded;

            @Override
            public void run()
            {
                if(dataSourceLength < currentDataSourceLength){
                    res[0] = "The string(s) ";
                    elementsAdded = dataSource.subList(dataSourceLength, currentDataSourceLength);
                    for (String e : elementsAdded){
                        res[0] += e + " ";
                    }
                    res[0] += "has/have been added";
                    dataSourceLength = currentDataSourceLength;
                }
            }
        };
        timer.schedule(task, 0, 1000);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res[0];
    }
}
