package com.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MaxValueGenericsTest {
    MaxValueGenerics maxValue;

    //Using generics to find the greatest value among three given values
    //Finding the greatest integer value
    @Test
    public void givenThreeInteger_ReturnGreatestNumber(){
        maxValue = new MaxValueGenerics(21,48,64);
        Comparable maxInteger =  maxValue.testMaximum();
        Assert.assertEquals(Integer.valueOf(64),maxInteger);
    }


    //Finding the greatest float value
    @Test
    public void givenThreeFloat_ReturnGreatestFloat(){
        maxValue = new MaxValueGenerics(25.4f,45.9f,3.1f);
        Comparable maxFloat = maxValue.testMaximum();
        Assert.assertEquals(Float.valueOf((float) 45.9f),maxFloat);
    }

    //Finding the greatest String value
    @Test
    public void givenThreeString_ReturnGreatestString(){
        maxValue = new MaxValueGenerics("pear","strawberry","apple");
        Comparable maxString = maxValue.testMaximum();
        Assert.assertEquals("strawberry",maxString);
    }


}


