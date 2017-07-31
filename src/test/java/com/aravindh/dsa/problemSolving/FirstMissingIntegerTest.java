package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;


@RunWith(value = JUnit4.class)
public class FirstMissingIntegerTest {

    FirstMissingInteger missingInteger = new FirstMissingInteger();

    @Test
    public void firstMissingPositiveWithNonEmptyArrayWithZeroReturnFirstMissing(){
        Assert.assertEquals(3,missingInteger.firstMissingPositive(Arrays.asList(0,1,2)));
    }

    @Test
    public void firstMissingPositiveWithNonEmptyArrayWithAllNegativeReturnOne(){
        Assert.assertEquals(1,missingInteger.firstMissingPositive(Arrays.asList(-1,-1,-2)));
    }

    @Test
    public void firstMissingPositiveWithNonEmptyArrayWithAllZeroReturnOne(){
        Assert.assertEquals(1,missingInteger.firstMissingPositive(Arrays.asList(0,0,0)));
    }

    @Test
    public void firstMissingPositiveWithNonEmptyArrayWithAllPositiveNumbersReturnFirstMissing(){
        Assert.assertEquals(4,missingInteger.firstMissingPositive(Arrays.asList(1,2,3)));
        Assert.assertEquals(4,missingInteger.firstMissingPositive(Arrays.asList(3,2,1)));
        Assert.assertEquals(4,missingInteger.firstMissingPositive(Arrays.asList(3,1,2)));
        Assert.assertEquals(2,missingInteger.firstMissingPositive(Arrays.asList(3,1,5)));
        Assert.assertEquals(2,missingInteger.firstMissingPositive(Arrays.asList(1,1,1)));
    }

    @Test
    public void firstMissingPositiveWithEmptyArrayReturnOne(){
        Assert.assertEquals(1,missingInteger.firstMissingPositive(Collections.EMPTY_LIST));
    }

    @Test
    public void firstMissingPositiveWithNonEmptyArrayWithRepeatedNumbersReturnFirstMissing(){
        Assert.assertEquals(3,missingInteger.firstMissingPositive(Arrays.asList(1,1,2)));
        Assert.assertEquals(2,missingInteger.firstMissingPositive(Arrays.asList(1,3,3)));
    }
}