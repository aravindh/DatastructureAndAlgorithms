package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class KstackUsingArrayTest {

    @Test(expected = IllegalArgumentException.class)
    public void pushOnFullArrayThrowsIllegalArgumentException(){
        KstackUsingArray stacks = new KstackUsingArray(2, 5);
        stacks.push(0,1);
        stacks.push(0,2);
        stacks.push(0,3);
        stacks.push(1,4);
        stacks.push(1,5);
        stacks.push(1,6);
    }

    @Test(expected = EmptyStackException.class)
    public void popOnEmptyArrayThrowsEmptyStackException(){
        KstackUsingArray stacks = new KstackUsingArray(1, 1);
        stacks.pop(0);
    }

    @Test
    public void pushOnNonEmptyArrayToSingleStackReturnsInSameStackOrder(){
        KstackUsingArray stacks = new KstackUsingArray(1, 5);
        stacks.push(0,1);
        stacks.push(0,2);
        stacks.push(0,3);
        stacks.push(0,4);
        stacks.push(0,5);
        Assert.assertEquals(5, stacks.pop(0));
        Assert.assertEquals(4, stacks.pop(0));
        Assert.assertEquals(3, stacks.pop(0));
        Assert.assertEquals(2, stacks.pop(0));
        Assert.assertEquals(1, stacks.pop(0));
    }

    @Test
    public void pushOnNonEmptyArrayToMultipleStacksReturnsInSameStackOrder(){
        KstackUsingArray stacks = new KstackUsingArray(3, 6);
        stacks.push(0,1);
        stacks.push(1,2);
        stacks.push(2,3);
        stacks.push(0,4);
        stacks.push(1,5);
        stacks.push(2,6);
        Assert.assertEquals(6, stacks.pop(2));
        Assert.assertEquals(5, stacks.pop(1));
        Assert.assertEquals(4, stacks.pop(0));
        Assert.assertEquals(3, stacks.pop(2));
        Assert.assertEquals(2, stacks.pop(1));
        Assert.assertEquals(1, stacks.pop(0));
    }

    @Test
    public void pushOnNonEmptyArrayToMultipleStacksMultipleTimesReturnsInSameStackOrder(){
        //FirstTime
        KstackUsingArray stacks = new KstackUsingArray(3, 6);
        stacks.push(0,1);
        stacks.push(1,2);
        stacks.push(2,3);
        stacks.push(0,4);
        stacks.push(1,5);
        stacks.push(2,6);
        Assert.assertEquals(6, stacks.pop(2));
        Assert.assertEquals(5, stacks.pop(1));
        Assert.assertEquals(4, stacks.pop(0));
        Assert.assertEquals(3, stacks.pop(2));
        Assert.assertEquals(2, stacks.pop(1));
        Assert.assertEquals(1, stacks.pop(0));
        //Reusing same stack second time
        stacks.push(0,1);
        stacks.push(1,2);
        stacks.push(2,3);
        stacks.push(0,4);
        stacks.push(1,5);
        stacks.push(2,6);
        Assert.assertEquals(6, stacks.pop(2));
        Assert.assertEquals(5, stacks.pop(1));
        Assert.assertEquals(4, stacks.pop(0));
        Assert.assertEquals(3, stacks.pop(2));
        Assert.assertEquals(2, stacks.pop(1));
        Assert.assertEquals(1, stacks.pop(0));
        //Reusing third time
        stacks.push(0,1);
        stacks.push(1,2);
        stacks.push(2,3);
        stacks.push(0,4);
        stacks.push(1,5);
        stacks.push(2,6);
        Assert.assertEquals(6, stacks.pop(2));
        Assert.assertEquals(5, stacks.pop(1));
        Assert.assertEquals(4, stacks.pop(0));
        Assert.assertEquals(3, stacks.pop(2));
        Assert.assertEquals(2, stacks.pop(1));
        Assert.assertEquals(1, stacks.pop(0));
    }

    @Test
    public void pushOnNonEmptyArrayInGapBetweenTheElementsReturnsInSameStackOrder(){
        KstackUsingArray stacks = new KstackUsingArray(2, 6);
        stacks.push(0,1);
        stacks.push(0,2);
        stacks.push(0,3);
        stacks.push(1,4);
        stacks.push(1,5);
        stacks.push(0,6);

        stacks.pop(0);
        stacks.pop(0);

        stacks.push(0,7);
        stacks.push(0,8);

        Assert.assertEquals(8, stacks.pop(0));
        Assert.assertEquals(7, stacks.pop(0));
        Assert.assertEquals(2, stacks.pop(0));
        Assert.assertEquals(1, stacks.pop(0));
        Assert.assertEquals(5, stacks.pop(1));
        Assert.assertEquals(4, stacks.pop(1));
    }

}