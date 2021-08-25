package com.bridgelabz;

import com.bridgelabz.Utility.GenericClass;

public class Main extends GenericClass {


    public Main(Comparable[] inputArray) {
        super(inputArray);
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 3, 7, 8, 9};
        new GenericClass(intArray).toPrint();


        Double[] doubleArray = {42.5, 35.6, 72.5, 89.5, 94.3};
        new GenericClass(doubleArray).toPrint();


        String[] stringArray = {"Apple", "Banana", "Peach", "Watermelon"};
        new GenericClass(stringArray).toPrint();


    }
}
