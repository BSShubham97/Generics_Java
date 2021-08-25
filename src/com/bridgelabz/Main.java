package com.bridgelabz;

import com.bridgelabz.Utility.GenericClass;

public class Main extends GenericClass {


    public Main(Comparable[] inputArray) {
        super(inputArray);
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 3, 7, 8, 9};
        new GenericClass(intArray).toPrint();
        getMax(intArray);


        Double[] doubleArray = {42.5, 35.6, 72.5, 89.5, 94.3};
        new GenericClass(doubleArray).toPrint();
        getMax(doubleArray);

        String[] stringArray = {"Apple", "Banana", "Peach", "Watermelon","Zolo"};
        new GenericClass(stringArray).toPrint();
        getMax(stringArray);

    }
}
