package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 18/7/17.
 */
@RunWith(value = JUnit4.class)
public class FindCountOccurrencesOfNumberInSortedTest {

    FindCountOccurrencesOfNumberInSorted counter = new FindCountOccurrencesOfNumberInSorted();

    @Test
    public void findCountInEmptyListReturnsZero(){
        Assert.assertEquals(0, counter.findCount(Collections.EMPTY_LIST, 10));
    }

    @Test
    public void findCountWithSingleInstanceOfTargetInNonEmptyListReturnsOne(){
        Assert.assertEquals(1, counter.findCount(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 10));
    }

    @Test
    public void findCountWithMultipleInstancesOfTargetInNonEmptyListReturnsCount(){
        Assert.assertEquals(4, counter.findCount(Arrays.asList(1,2,3,4,5,5,5,5,6,7,8,9,10), 5));
    }

    @Test
    public void findCountWithAllInstancesAsTargetInNonEmptyListReturnsSize(){
        Assert.assertEquals(6, counter.findCount(Arrays.asList(10,10,10,10,10,10), 10));
    }

    @Test
    public void findCountWithInvalidTargetInNonEmptyListReturnsZero(){
        Assert.assertEquals("Target greater than range",0, counter.findCount(Arrays.asList(1,2,3,4,5,5,5,5,6,7,8,9,10), 15));
        Assert.assertEquals("Target Less than range",0, counter.findCount(Arrays.asList(5,5,5,5,6,7,8,9,10), 3));
        Assert.assertEquals("Target in range",0, counter.findCount(Arrays.asList(1,2,3,4,6,7,8,9,10), 5));
    }

}