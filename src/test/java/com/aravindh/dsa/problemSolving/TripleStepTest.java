package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class TripleStepTest {

    TripleStep tripleStep = new TripleStep();

    @Test
    public void getNumberOfWaysWithZeroReturnsZero(){
        Assert.assertEquals(0, tripleStep.getNumberOfWays(0));
    }

    @Test
    public void getNumberOfWaysWithOneReturnsOne(){
        Assert.assertEquals(1, tripleStep.getNumberOfWays(1));
    }

    @Test
    public void getNumberOfWaysWithTwoReturnsTwo(){
        //2 ways 0+2 and reach 1(1) and then from 1 to 2
        Assert.assertEquals(2, tripleStep.getNumberOfWays(2));
    }

    @Test
    public void getNumberOfWaysWithThreeReturnsFour(){
        //4 ways from 0, from 1, from 2, but we can reach 2 by 2 ways
        Assert.assertEquals(4, tripleStep.getNumberOfWays(3));
    }

    @Test
    public void getNumberOfWaysWithValidNReturnsNumberOfWays(){
        //f(3)+f(2)+f(1) = 4+2+1 = 7
        Assert.assertEquals(7, tripleStep.getNumberOfWays(4));
        //f(4)+f(3)+f(2) = 7+4+2 = 13
        Assert.assertEquals(13, tripleStep.getNumberOfWays(5));
        //f(5)+f(4)+f(3) = 13+7+4 = 24
        Assert.assertEquals(24, tripleStep.getNumberOfWays(6));
        //f(6)+f(5)+f(4) = 24+13+7 = 44
        Assert.assertEquals(44, tripleStep.getNumberOfWays(7));
        //f(7)+f(6)+f(5) = 44+24+13 = 81
        Assert.assertEquals(81, tripleStep.getNumberOfWays(8));
        //f(8)+f(7)+f(6) = 81+44+24 = 149
        Assert.assertEquals(149, tripleStep.getNumberOfWays(9));
        //f(9)+f(8)+f(7) = 149+81+44 = 274
        Assert.assertEquals(274, tripleStep.getNumberOfWays(10));
    }
}