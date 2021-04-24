package com.generics;

public class MaxValueGenerics{
    //method to find the maximum integer value
    public static Integer greatestInteger(Integer a, Integer b, Integer c){
        //Assuming that a is the maximum number for now
        Integer maximum=a;
        if(maximum.compareTo(b)<0){
        maximum=b;      //now b is the maximum number
        }
        if(maximum.compareTo(c)<0){
        maximum=c;      //now c is the maximum number
        }
        return maximum;
        }

    //method to find the maximum float value
    public static Float greatestFloat(Float a, Float b, Float c){
        //Assuming that a is the maximum number for now
        Float maximum=a;
        if(maximum.compareTo(b)<0){
            maximum=b;      //now b is the maximum number
        }
        if(maximum.compareTo(c)<0){
            maximum=c;      //now c is the maximum number
        }
        return maximum;
    }
}



