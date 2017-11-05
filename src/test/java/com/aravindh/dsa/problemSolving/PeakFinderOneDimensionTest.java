package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

@RunWith(value = JUnit4.class)
public class PeakFinderOneDimensionTest {

    PeakFinderOneDimension peakFinder = new PeakFinderOneDimension();

    @Test
    public void findPeakOnEmptyListReturnNull(){
        Assert.assertNull(peakFinder.findPeak(Collections.EMPTY_LIST));
    }

    @Test
    public void findPeakOnNonEmptyIncreasingNumbersReturnsPeak(){
        Assert.assertEquals(Integer.valueOf(5), peakFinder.findPeak(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    public void findPeakOnNonEmptyDecreasingNumbersReturnsPeak(){
        Assert.assertEquals(Integer.valueOf(5), peakFinder.findPeak(Arrays.asList(5,4,3,2,1)));
    }

    @Test
    public void findPeakOnNonEmptyIncreasingAndDecreasingNumbersReturnsPeak(){
        Assert.assertEquals(Integer.valueOf(10), peakFinder.findPeak(Arrays.asList(1,2,3,4,5,10,9,8,7,6)));
    }

    @Test
    public void findPeakOnNonEmptySameNumbersReturnsPeak(){
        Assert.assertEquals(Integer.valueOf(5), peakFinder.findPeak(Arrays.asList(5,5,5,5,5)));
    }

    @Test
    public void findPeakOnNonEmptyOneNumbersReturnsPeak(){
        Assert.assertEquals(Integer.valueOf(5), peakFinder.findPeak(Arrays.asList(5)));
    }


    @Test
    public void findPeakOnNonEmptyTwoNumbersReturnsPeak(){
        Assert.assertEquals(Integer.valueOf(5), peakFinder.findPeak(Arrays.asList(5,4)));
        Assert.assertEquals(Integer.valueOf(5), peakFinder.findPeak(Arrays.asList(4,5)));
    }

}
