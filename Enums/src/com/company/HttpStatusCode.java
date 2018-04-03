package com.company;

public enum HttpStatusCode {
    OK(200), ACCEPTED(202), FOUND(302);
    private int numVal;
    HttpStatusCode(int numVal){
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

    public void setNumVal(int numVal) {
        this.numVal = numVal;
    }
}
