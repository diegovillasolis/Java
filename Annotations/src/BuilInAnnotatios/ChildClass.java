package BuilInAnnotatios;

import BuilInAnnotatios.ParentClass;

public class ChildClass extends ParentClass {
    @Override
    public void doSomething(){
        System.out.println("Just a method from child class");
    }

    //This method will be deprecated
    @Deprecated
    public void deprecatedMethod(){
        System.out.println("Deprecated method to be called");
    }
}
