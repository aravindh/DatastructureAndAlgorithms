package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class FindElementInSortedRotatedArrayTest {

    FindElementInSortedRotatedArray finder = new FindElementInSortedRotatedArray();

    @Test
    public void findElementOnEmptyListReturnEmpty(){
        Assert.assertEquals(-1, finder.findElement(Collections.EMPTY_LIST, 10));
    }

    @Test
    public void findElementOnNonEmptyListWithInValidTargetLessThanMinReturnEmpty(){
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(2,3,4,5), 1));
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(3,4,5,2), 1));
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(4,5,2,3), 1));
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(5,2,3,4), 1));
    }

    @Test
    public void findElementOnNonEmptyListWithInValidTargetGreaterThanMaxReturnEmpty(){
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(2,3,4,5), 6));
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(3,4,5,2), 6));
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(4,5,2,3), 6));
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(5,2,3,4), 6));
    }

    @Test
    public void findElementOnNonEmptyListWithInValidTargetReturnEmpty() {
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(1,2,4,5), 3));
        Assert.assertEquals(-1, finder.findElement(Arrays.asList(4,5,1,2), 3));
    }

    @Test
    public void findElementOnNonEmptyListWithValidTargetReturnIndexOfTheTarget(){
        Assert.assertEquals(0, finder.findElement(Arrays.asList(2,3,4,5), 2));
        Assert.assertEquals(3, finder.findElement(Arrays.asList(3,4,5,2), 2));
        Assert.assertEquals(2, finder.findElement(Arrays.asList(4,5,2,3), 2));
        Assert.assertEquals(1, finder.findElement(Arrays.asList(5,2,3,4), 2));

        Assert.assertEquals(3, finder.findElement(Arrays.asList(2,3,4,5), 5));
        Assert.assertEquals(2, finder.findElement(Arrays.asList(3,4,5,2), 5));
        Assert.assertEquals(1, finder.findElement(Arrays.asList(4,5,2,3), 5));
        Assert.assertEquals(0, finder.findElement(Arrays.asList(5,2,3,4), 5));

        Assert.assertEquals(1, finder.findElement(Arrays.asList(2,3,4,5), 3));
        Assert.assertEquals(0, finder.findElement(Arrays.asList(3,4,5,2), 3));
        Assert.assertEquals(3, finder.findElement(Arrays.asList(4,5,2,3), 3));
        Assert.assertEquals(2, finder.findElement(Arrays.asList(5,2,3,4), 3));
    }




    }