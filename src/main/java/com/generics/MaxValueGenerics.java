package com.generics;

public class MaxValueGenerics{
    //Refactoring all the three to one generic method and finding the maximum
    public  <T extends Comparable> T MaximumTest(T a,T b,T c){
        //Assuming that a is the maximum value for now
        T maximum=a;
        if(maximum.compareTo(b)<0){
            maximum=b;
        }
        if(maximum.compareTo(c)<0){
            maximum=c;
        }
        return maximum;
    }
}



