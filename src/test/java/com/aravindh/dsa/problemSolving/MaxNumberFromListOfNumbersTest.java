package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 25/6/17.
 */
@RunWith(value = JUnit4.class)
public class MaxNumberFromListOfNumbersTest {
    private MaxNumberFromListOfNumbers maxNumber = new MaxNumberFromListOfNumbers();

    @Test
    public void getMaxNumbersWithSameNumbersNoModification(){
        List<Integer> numbers = Arrays.asList(8,8,8,8,8,8);
        Assert.assertEquals("888888", maxNumber.getMaxNumber(numbers));
    }

    @Test
    public void getMaxNumbersWithDifferentNumbersModifiesToGetMax(){
        List<Integer> numbers = Arrays.asList(9, 98, 30, 3);
        Assert.assertEquals("998330", maxNumber.getMaxNumber(numbers));
    }




}