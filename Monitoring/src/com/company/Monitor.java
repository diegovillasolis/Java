package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Monitor {
    private StringList stringList;
    private int stringListLength;
    private Timer timer;
    private TimerTask task;

    public Monitor(){
        stringList = new StringList();
        stringListLength = 0;
    }

    public String verifyAdd(){
        String res;
        timer = new Timer();
        TimerTask task = new TimerTask() {
            String res;
            int stringListLengthCurrent = stringList.size();

            @Override
            public void run()
            {
                if(stringListLength!=stringListLengthCurrent){
                    res = "The string " + "hola" + " has been added";
                    stringListLength=stringListLengthCurrent;
                }
                else{
                    res = "";
                }
            }
        };
//        timer.schedule(task, 10, 1000);
//        int stringListLengthCurrent = stringList.size();
//        if(stringListLength!=stringListLengthCurrent)
//            return "The string " + "hola" + " has been added";
//        else
//            return "";
        return "";
    }
}
