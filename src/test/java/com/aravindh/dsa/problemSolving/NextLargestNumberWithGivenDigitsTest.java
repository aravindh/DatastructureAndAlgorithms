package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 18/9/17.
 */
@RunWith(value = JUnit4.class)
public class NextLargestNumberWithGivenDigitsTest{

NextLargestNumberWithGivenDigits nextLargest = new NextLargestNumberWithGivenDigits();

    @Test
    public void nextLargestNumberWithSingleDigitReturnSameNumber(){
        Assert.assertEquals(Integer.valueOf(5), nextLargest.nextLargestNumber(5));
    }

    @Test
    public void nextLargestNumberWithDescendingOrderDigitsReturnNull(){
        Assert.assertNull(nextLargest.nextLargestNumber(54321));
    }

    @Test
    public void nextLargestNumberWithSameDigitsReturnNull(){
        Assert.assertNull(nextLargest.nextLargestNumber(55555));
    }

    @Test
    public void nextLargestNumberWithEmptyInputReturnNull(){
        Assert.assertNull(nextLargest.nextLargestNumber(null));
    }

    @Test
    public void nextLargestNumberWithNonEmptyInputReturnsNextLargestNumber(){
        Assert.assertEquals(Integer.valueOf(251678), nextLargest.nextLargestNumber(218765));
        Assert.assertEquals(Integer.valueOf(254678), nextLargest.nextLargestNumber(248765));
        Assert.assertEquals(Integer.valueOf(265578), nextLargest.nextLargestNumber(258765));
        Assert.assertEquals(Integer.valueOf(275668), nextLargest.nextLargestNumber(268765));
        Assert.assertEquals(Integer.valueOf(525555), nextLargest.nextLargestNumber(255555));
    }

}

