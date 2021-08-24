package com.bridgelabz.Utility;

public class GenericClass {
    /**
     * A method to find the maximum among three integers
     * @param x First Input Double
     * @param y Second Input Double
     * @param z Third Input Double
     * @return max Max is the greatest among all entered numbers
     */

    public static Double getMax( Double x,Double y,Double z){
        Double max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }

}