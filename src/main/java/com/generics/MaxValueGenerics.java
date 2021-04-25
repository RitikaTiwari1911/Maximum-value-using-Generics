package com.generics;

//making a generic class
public class MaxValueGenerics<T extends Comparable>{
    T a;
    T b;
    T c;

    //making a generic constructor
    public MaxValueGenerics(T a, T b, T c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    //method to internally call the static method passing the three instance variable
    public T testMaximum(){
        return maximumTest(a,b,c);
    }
    //Refactoring all the three to one generic method and finding the maximum
    public  <T extends Comparable> T maximumTest(T a,T b,T c){
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



