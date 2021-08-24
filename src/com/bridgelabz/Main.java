package com.bridgelabz;

import com.bridgelabz.Utility.GenericClass;

public class Main extends GenericClass {


    public static void main(String[] args) {
        /**
         * To compute max among three Intgers
         * @param x Integer
         * @param y Integer
         * @param z Integer
         * @return max
         */
        System.out.println("Greatest: "+getMax(10,12,43));

        /**
         * To compute max among three double number
         * @param x Double
         * @param y Double
         * @param z Double
         * @return max
         */
        System.out.println("Greatest: "+getMax(87.21,32.98,63.45));

        /**
         * To compute max among three Strings i.e the String with the furthest characters
         * @param x Integer
         * @param y Integer
         * @param z Integer
         * @return max
         */

        String word1="Apple";
        String word2="Banana";
        String word3="Peach";

        System.out.println("Greatest: "+getMax(word1,word2,word3));
    }
}
