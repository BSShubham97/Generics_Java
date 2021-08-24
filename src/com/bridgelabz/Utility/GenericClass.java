package com.bridgelabz.Utility;

public class GenericClass<T extends Comparable<T>> {
        T x,y,z;
 public void getMax() {
     this.x=x;
     this.y=y;
     this.z=z;
 }
    /**
     * A method to find the maximum among three
     * @param x First Input
     * @param y Second Input
     * @param z Third Input
     * @return max Greatest
     */

    public static <T extends Comparable<T>> T getMax(T x, T y, T z){
        T max =x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }

}