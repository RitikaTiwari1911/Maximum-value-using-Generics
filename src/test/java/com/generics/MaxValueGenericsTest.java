package com.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MaxValueGenericsTest {
    MaxValueGenerics maxValue;

    @Before
    public void object() {
        maxValue = new MaxValueGenerics();
    }

    //Using generics to find the greatest value among three given values
    //Finding the greatest integer value
    @Test
    public void givenThreeInteger_ReturnGreatestNumber(){
        Integer maxInteger = maxValue.MaximumTest(12,46,91);
        Assert.assertEquals(Integer.valueOf(91),maxInteger);
    }

    //Finding the greatest float value
    @Test
    public void givenThreeFloat_ReturnGreatestFloat(){
        Float maxFloat = maxValue.MaximumTest(2.6f,94.3f,12.3f);
        Assert.assertEquals(Float.valueOf(94.3f),maxFloat);
    }

    //Finding the greatest String value
    @Test
    public void givenThreeString_ReturnGreatestString(){
        String maxString = maxValue.MaximumTest("pear","strawberry","apple");
        Assert.assertEquals("strawberry",maxString);
    }
}


