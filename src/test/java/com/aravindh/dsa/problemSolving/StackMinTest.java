package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value= JUnit4.class)
public class StackMinTest {

    @Test
    public void getMinOnEmptyStackReturnsNull(){
        StackMin stackMin = new StackMin();
        Assert.assertNull(stackMin.getMin());
    }

    @Test
    public void getMinOnNonEmptyStackWithAscendingOrderReturnsMin(){
        StackMin stackMin = new StackMin();
        stackMin.push(10);
        Assert.assertEquals(Integer.valueOf(10), stackMin.getMin());
        stackMin.push(1);
        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.push(2);
        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.push(3);
        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.push(4);
        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.push(5);

        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.pop(); //pop(5)
        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.pop(); //pop(4)
        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.pop(); //pop(3)
        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.pop(); //pop(2)
        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.pop(); //pop(1)
        Assert.assertEquals(Integer.valueOf(10), stackMin.getMin());
        stackMin.pop(); //pop(10)
        Assert.assertNull(stackMin.getMin());
    }

    @Test
    public void getMinOnNonEmptyStackWithDescendingOrderReturnsMin(){
        StackMin stackMin = new StackMin();
        stackMin.push(5);
        Assert.assertEquals(Integer.valueOf(5), stackMin.getMin());
        stackMin.push(4);
        Assert.assertEquals(Integer.valueOf(4), stackMin.getMin());
        stackMin.push(3);
        Assert.assertEquals(Integer.valueOf(3), stackMin.getMin());
        stackMin.push(2);
        Assert.assertEquals(Integer.valueOf(2), stackMin.getMin());
        stackMin.push(1);

        Assert.assertEquals(Integer.valueOf(1), stackMin.getMin());
        stackMin.pop(); //pop(1)
        Assert.assertEquals(Integer.valueOf(2), stackMin.getMin());
        stackMin.pop(); //pop(2)
        Assert.assertEquals(Integer.valueOf(3), stackMin.getMin());
        stackMin.pop(); //pop(3)
        Assert.assertEquals(Integer.valueOf(4), stackMin.getMin());
        stackMin.pop(); //pop(4)
        Assert.assertEquals(Integer.valueOf(5), stackMin.getMin());
        stackMin.pop(); //pop(5)
        Assert.assertNull(stackMin.getMin());
    }
}