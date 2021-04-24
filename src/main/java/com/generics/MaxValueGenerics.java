package com.generics;

public class MaxValueGenerics{
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
        }

