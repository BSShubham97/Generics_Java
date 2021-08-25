package com.bridgelabz.Utility;

public class GenericClass<E extends Comparable<E>> {
    private E[] inputArray;

    public GenericClass(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public void toPrint() {
        GenericClass.toPrint(this.inputArray);
    }

    private static <E> void toPrint(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf(" %s ", element);
        }
        System.out.println();
    }


    public static <E extends Comparable<E>> void getMax(E[] inputArray) {
        E max = null;
        for (E element : inputArray) {
            max = element;
            if (element.compareTo(max) > 0) {
                max = element;
            }
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        System.out.println(max);
    }
}

