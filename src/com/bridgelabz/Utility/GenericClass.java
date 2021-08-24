package com.bridgelabz.Utility;

public class GenericClass {
    /**
     * A method to find the maximum among three strings
     * @param x First Input String
     * @param y Second Input String
     * @param z Third Input  String
     * @return max Max is the String that has characters that comes after previous Strings character
     */

    public static String getMax(String x, String y, String z){
        String max =x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }

}