package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class AddOneToNumberTest {

    AddOneToNumber addOneToNumber = new AddOneToNumber();

    @Test
    public void plusOneWithCarryTrimZerosReturnSum(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        numbers.add(0);numbers.add(0);numbers.add(9);numbers.add(9);numbers.add(9);
        addOneToNumber.plusOne(numbers);
        Assert.assertEquals(Arrays.asList(1,0,0,0), numbers);
    }

    @Test
    public void plusOneWithEmptyListReturnOne(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(0);
        addOneToNumber.plusOne(numbers);
        Assert.assertEquals(Arrays.asList(1), numbers);
    }

}