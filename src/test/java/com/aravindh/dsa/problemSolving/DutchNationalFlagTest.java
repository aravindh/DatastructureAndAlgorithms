package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@RunWith(value = JUnit4.class)
public class DutchNationalFlagTest {

    DutchNationalFlag dutchNationalFlag = new DutchNationalFlag();

    @Test
    public void segregateWithEmptyListNoModification(){
        List<Integer> numbers = new ArrayList<>();
        dutchNationalFlag.segregate(numbers);
        Assert.assertEquals(new ArrayList<>(), numbers);
    }

    @Test
    public void segregateWithNonEmptyListWithSingleElementNoModification(){
        List<Integer> numbers = Arrays.asList(0);
        dutchNationalFlag.segregate(numbers);
        Assert.assertEquals(Arrays.asList(0), numbers);

        List<Integer> numbers1 = Arrays.asList(1);
        dutchNationalFlag.segregate(numbers1);
        Assert.assertEquals(Arrays.asList(1), numbers1);

        List<Integer> numbers2 = Arrays.asList(2);
        dutchNationalFlag.segregate(numbers2);
        Assert.assertEquals(Arrays.asList(2), numbers2);
    }

    @Test
    public void segregateWithNumbersInProperOrderNoModification(){
        List<Integer> numbers = Arrays.asList(0,0,1,1,1,2,2);
        dutchNationalFlag.segregate(numbers);
        Assert.assertEquals(Arrays.asList(0,0,1,1,1,2,2), numbers);

        List<Integer> numbers1 = Arrays.asList(0,1,2);
        dutchNationalFlag.segregate(numbers1);
        Assert.assertEquals(Arrays.asList(0,1,2), numbers1);

        List<Integer> numbers2 = Arrays.asList(1,1,1);
        dutchNationalFlag.segregate(numbers2);
        Assert.assertEquals(Arrays.asList(1,1,1), numbers2);

        List<Integer> numbers3 = Arrays.asList(1,1,2);
        dutchNationalFlag.segregate(numbers3);
        Assert.assertEquals(Arrays.asList(1,1,2), numbers3);
    }

    @Test
    public void segregateWithNumbersInReverseOrderSegregatesNumbers(){
        List<Integer> numbers = Arrays.asList(2,2,1,1,1,0);
        dutchNationalFlag.segregate(numbers);
        Assert.assertEquals(Arrays.asList(0,1,1,1,2,2), numbers);

        List<Integer> numbers1 = Arrays.asList(2,1,0);
        dutchNationalFlag.segregate(numbers1);
        Assert.assertEquals(Arrays.asList(0,1,2), numbers1);
    }

    @Test
    public void segregateWithNumbersInRandomOrderSegregateNumbers(){
        List<Integer> numbers = Arrays.asList(2,0,1,1,0,1,2,0);
        dutchNationalFlag.segregate(numbers);
        Assert.assertEquals(Arrays.asList(0,0,0,1,1,1,2,2), numbers);

        List<Integer> numbers1 = Arrays.asList(1,1,0);
        dutchNationalFlag.segregate(numbers1);
        Assert.assertEquals(Arrays.asList(0,1,1), numbers1);

        List<Integer> numbers2 = Arrays.asList(1,0,0);
        dutchNationalFlag.segregate(numbers2);
        Assert.assertEquals(Arrays.asList(0,0,1), numbers2);

    }
}