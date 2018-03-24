package com.company;

import MonitoringTest.MonitorTest;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        MonitorTest monitorTest = new MonitorTest();
        try {
            monitorTest.verifyAdd_AddingElement_Message();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
