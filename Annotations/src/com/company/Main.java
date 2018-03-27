package com.company;

import BuilInAnnotatios.ChildClass;
import CompleteCustomAnnotation.MyAnnotation;
import CompleteCustomAnnotation.MyAnnotationClass;
import ComplexAnnotation.ComplexAnnotationClass;
import ComplexAnnotation.ComplexAnnotation;
import CustomAnnotatedMethod.AnnotationMethod;
import CustomAnnotatedMethod.AnnotationMethodClass;
import InheritedAnnotation.AnnotatedSuperClass;
import InheritedAnnotation.*;
import SimpleCustomAnnotation.AnAnnotationClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        //simpleCustomAnnotationMethod();
//        completeCustomAnnotationMethod();
//        methodAnnotated();
//        checkingInheritedAnnotation();
        complexAnnotation();
    }

    @SuppressWarnings("deprecation")
    public static void callingDeprecatedMethod(){
        ChildClass childClass = new ChildClass();
        childClass.doSomething();
        childClass.deprecatedMethod();
    }

    public static void simpleCustomAnnotationMethod(){
        Class<AnAnnotationClass> object = AnAnnotationClass.class;
        Annotation[] annotations = object.getAnnotations();
        System.out.println(annotations.length);
    }

    public static void completeCustomAnnotationMethod(){
        Class<MyAnnotationClass> object = MyAnnotationClass.class;
        Annotation[] annotations = object.getAnnotations();
        for (Annotation annotation : annotations){
            System.out.println(annotation);
        }
    }

    public static void methodAnnotated(){
        Class<AnnotationMethodClass> annotationMethodClassClass = AnnotationMethodClass.class;
        Method[] methods = annotationMethodClassClass.getDeclaredMethods();
        for (Method method : methods){
            Annotation annotation = method.getAnnotation(AnnotationMethod.class);
            System.out.println(annotation);
        }
    }

    public static void checkingInheritedAnnotation(){
        if(AnnotatedSuperClass.class.isAnnotationPresent(InheritedAnnotation.class)){
            System.out.println("Inherited annotation is present");
        }
        if(AnnotatedSubClass.class.isAnnotationPresent(InheritedAnnotation.class)){
            System.out.println("Inherited annotation is present in subclass");
        }
        if(AnnotationInterface.class.isAnnotationPresent(InheritedAnnotation.class)){
            System.out.println("Inherited annotation is present in interface");
        }
        if(AnnotationImplementedClass.class.isAnnotationPresent(InheritedAnnotation.class)){
            System.out.println("#Inherited annotation is present on class (interface)");
        }
    }

    public static void complexAnnotation(){
        Class<ComplexAnnotationClass> object = ComplexAnnotationClass.class;
        Annotation[] annotations = object.getAnnotations();
        for (Annotation annotation : annotations){
            System.out.println(annotation);
        }
    }
}
