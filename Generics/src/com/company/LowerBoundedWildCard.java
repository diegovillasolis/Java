package com.company;

import com.company.zoo.Cat;
import com.company.zoo.RedCat;

import java.util.List;

public class LowerBoundedWildCard {
    public static void addCat(List<? super Cat> catList){
        catList.add(new RedCat());
    }
}
