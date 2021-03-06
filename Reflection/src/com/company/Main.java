package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        //callSimpleFooReflection();
        //invokeUnknownObject();
        //createObjectFromClass();
//        createObjectFromConstructor();
//        changingArraySize();
        testObjectType();
    }

    public static void callSimpleFooReflection(){
        Foo foo = new Foo();
        System.out.println(foo.getClass());
    }

    public static void invokeUnknownObject(){
        Foo f = new Foo();
        Method method ;
        try {
            method = f.getClass().getMethod("print", new Class<?>[0]);
            method.invoke(f);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void createObjectFromClass(){
        Class<?> c = null;
        try {
            c = Class.forName("com.company.Foo");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Foo f = null;
        try {
            f = (Foo) c.newInstance();
            f.print();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void createObjectFromConstructor(){
        Class<?> c = null;
        try {
            c = Class.forName("com.company.Foo");
        }
        catch (Exception e){
            e.printStackTrace();
        }


        Foo f1=null,f2=null;
        Constructor<?> constructors[];
        constructors = c.getConstructors();
        try {
            f1 = (Foo) constructors[0].newInstance();
            f2 = (Foo) constructors[1].newInstance("Hello from reflections");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        f1.print();
        f2.print();
    }

    public static void changingArraySize(){
        int[] intArray = {1,2,3,4,5};
        int[] newIntArray = (int[]) changeSizeArray(intArray, 20);
        for (int idx=0; idx<intArray.length; idx++){
            System.out.println(intArray[idx]);
        }
        System.out.println();
        for (int idx=0; idx<newIntArray.length; idx++){
            System.out.println(newIntArray[idx]);
        }
    }

    private static Object changeSizeArray(Object obj, int len) {
        Class<?> array = obj.getClass().getComponentType();
        Object newArray = Array.newInstance(array, len);
        int size = Array.getLength(obj);

        System.arraycopy(obj, 0, newArray, 0, size);
        return newArray;
    }

    private static void testObjectType(){
        Class<?> c = null;
        try {
            c = Class.forName("java.lang.Object");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Object o = null;
        try {
            o = c.newInstance();
            System.out.println("Object instance hashcode:");
            System.out.println(o.hashCode());
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Method[] methods;
        try {
            methods = c.getMethods();
            System.out.println("Object methods:");
            for (Method m : methods){
                System.out.println(m);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Field[] fields;
        try {
            fields = c.getDeclaredFields();
            System.out.println("Object fields:");
            for (Field f : fields){
                System.out.println(f);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Annotation[] annotations;
        try {
            annotations = c.getDeclaredAnnotations();
            System.out.println("Object Annotations:");
            for (Annotation a : annotations){
                System.out.println(a);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
