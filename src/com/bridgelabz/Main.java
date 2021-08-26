package com.bridgelabz;

import com.bridgelabz.Utility.GenericClass;

public class Main extends GenericClass {


    public static void main(String[] args) {


        Integer[] intArray = {5, 3, 7, 8, 9 , 2};
        toPrint(intArray);
        System.out.println("MAX INPUT: "+max(intArray));


        Double[] doubleArray = {42.5, 35.6, 72.5, 89.5, 4.3};
        toPrint(doubleArray);
        System.out.println("MAX INPUT: "+max(doubleArray));

        String[] stringArray = {"Apple", "Banana", "Peach", "Watermelon","Guava"};
        toPrint(stringArray);
        System.out.println("MAX INPUT: "+max(stringArray));

    }
}
