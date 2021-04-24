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

    //Testing the greatest number among the three given integer value
    //Given Max num at the 1st position return the same number
    @Test
    public void givenMaxNumber_ShouldReturn_AtFirstPosition() {
        Integer maxIntegerValue = maxValue.greatestInteger(45, 2, 25);
        Assert.assertEquals(Integer.valueOf(45), maxIntegerValue);
    }
}

