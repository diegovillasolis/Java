package com.company;

import com.company.school.Person;
import com.company.school.Student;
import com.company.zoo.Animal;
import com.company.zoo.Cat;
import com.company.zoo.Dog;
import com.company.zoo.RedCat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T extends Comparable<T>> T maximun(T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        OldBox oldBox = new OldBox();

        oldBox.set("String");
        String myWord = (String)oldBox.get();

        Box<Integer> box = new Box<>();
        box.set(1);
        System.out.println(box.get());

        System.out.println(maximun(1,4,7));
        System.out.println(maximun(1.4,4.6,7.2));
        System.out.println(maximun("pear", "apple", "orange"));
        System.out.println(maximun(false, false, true));
        Person p1 = new Person("Pepe", 25);
        Person p2 = new Person("Pepe2", 24);
        Person p3 = new Person("Pepe3", 26);
        System.out.println(maximun(p1,p2,p3).getName());
        System.out.println(maximun(false, false, true) + " Booleans");

        List<Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<RedCat> redCatList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        LowerBoundedWildCard.addCat(animalList);
        LowerBoundedWildCard.addCat(catList);//Misma clase
//        LowerBoundedWildCard.addCat(redCatList);//not allowed
//        LowerBoundedWildCard.addCat(dogList);//not allowed

        Student student = new Student("Pepe", 23, 23.3);
        Teacher teacher = new Teacher("Lucas", 23, "Biology");
        teacher.showDetails();
    }
}
