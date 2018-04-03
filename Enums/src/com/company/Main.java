package com.company;

public class Main {

    public static void main(String[] args) {
        //getValuesOfSimpleEnum();
        //enumEmployeeLevel();
        //getStatusCodeHttp();
        //enumDepartments();
        verifyEnumsWithSwitch();
    }

    private static void getStatusCodeHttp() {
        for (HttpStatusCode httpCode : HttpStatusCode.values()){
            System.out.println("Enum Constants: " + httpCode) ;
            System.out.println("Enum Values: " + httpCode.getNumVal());
        }
    }

    private static void enumEmployeeLevel() {
        Employee employee = new Employee();
        for (Employee.EnumEmployee levelEmpl : Employee.EnumEmployee.values()){
            System.out.println("Enum Constants: " + levelEmpl) ;
            System.out.println("Enum Values: " + levelEmpl.ordinal());
        }
    }

    private static void enumDepartments() {
        for (Department dptoCode: Department.values()){
            System.out.println("Enum Constants: " + dptoCode) ;
            System.out.println("Enum Values: " + dptoCode.getStringVal());
            System.out.println("Enum Ordinal: " + dptoCode.ordinal());
        }
    }

    private static void getValuesOfSimpleEnum() {
        //Department department = Department.OPERATIONS;
    }

    public static void verifyEnumsWithSwitch(){
        Department dpto = Department.HR;
        System.out.println(dpto.getStringVal());
        for (Department dpt : Department.values()){
            switch (dpt){
                case HR:
                    System.out.println("Case - HR");
                    break;
                case LEGAL:
                    System.out.println("Case - LEGAL");
                    break;
                case MARKETING:
                    System.out.println("Case - MARKETING");
                    break;
                case OPERATIONS:
                    System.out.println("Case - OPERATIONS");
                    break;
            }
        }
    }


}
