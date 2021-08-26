package com.bridgelabz.Utility;

import java.util.ArrayList;



public class GenericClass {

    ArrayList<Integer> inputArray = new ArrayList<Integer>();


    public static <E> void toPrint(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf(" %s ", element);
        }
        System.out.println();
    }


    public static <E extends Comparable<E>> E max(E[] inputArray) {
        E max = inputArray[0]; //sets the first value in the array as the current maximum
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].compareTo(max) > 0) {
                max = inputArray[i];
            }

        }
        return max;
    }
}