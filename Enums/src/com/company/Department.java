package com.company;

public enum Department {
    //Sobreescritura de HR solamente
    HR("DPTO-01"){
        public String getStringVal(){
            return "NOT ACCESIBLE";
        }
    }, OPERATIONS("OPO-02"), MARKETING("MRK-03"), LEGAL("LGL-04");
    private String stringVal;

    Department(String stringVal){
        this.stringVal = stringVal;
    }

    public String getStringVal() {
        return stringVal;
    }

    public void setStringVal(String stringVal) {
        this.stringVal = stringVal;
    }
}
