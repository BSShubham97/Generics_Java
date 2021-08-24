package com.bridgelabz.Utility;

public class GenericClass {
    /**
     * A method to find the maximum among three integers
     * @param x First Input Integer
     * @param y Second Input Integer
     * @param z Third Input Integer
     * @return max Max is the greatest among all entered integers
     */
    public static Integer getMax( Integer x,Integer y,Integer z){
        Integer max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }


}