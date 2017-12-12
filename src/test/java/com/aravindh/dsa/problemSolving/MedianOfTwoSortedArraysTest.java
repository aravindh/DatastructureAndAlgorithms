package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 16/11/17.
 */
@RunWith(value = JUnit4.class)
public class MedianOfTwoSortedArraysTest {
    MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    public void getMedianWithTwoListSameSizeReturnsMiddleElement(){
        Assert.assertEquals(Integer.valueOf(5),medianOfTwoSortedArrays.getMedian(Arrays.asList(1,2,3,4,5), Arrays.asList(6,7,8,9,10)));
        Assert.assertEquals(Integer.valueOf(5),medianOfTwoSortedArrays.getMedian(Arrays.asList(6,7,8,9,10), Arrays.asList(1,2,3,4,5)));
        Assert.assertEquals(Integer.valueOf(4),medianOfTwoSortedArrays.getMedian(Arrays.asList(1,3,5,7,9), Arrays.asList(2,4,6,8,10)));
        Assert.assertEquals(Integer.valueOf(4),medianOfTwoSortedArrays.getMedian(Arrays.asList(2,4,6,8,10), Arrays.asList(1,3,5,7,9)));
    }

    @Test
    public void getMedianWithTwoListSameElementsReturnsMiddleElement(){
        Assert.assertEquals(Integer.valueOf(2),medianOfTwoSortedArrays.getMedian(Arrays.asList(1,2,3), Arrays.asList(1,2,3)));
        Assert.assertEquals(Integer.valueOf(1),medianOfTwoSortedArrays.getMedian(Arrays.asList(1), Arrays.asList(1)));
    }

    @Test
    public void getMedianWithTwoListSingleElementsReturnsMiddleElement(){
        Assert.assertEquals(Integer.valueOf(1),medianOfTwoSortedArrays.getMedian(Arrays.asList(1), Arrays.asList(2)));
        Assert.assertEquals(Integer.valueOf(2),medianOfTwoSortedArrays.getMedian(Arrays.asList(2), Arrays.asList(1)));
    }

    @Test
    public void getMedianWithTwoEmptyListReturnsNull(){
        Assert.assertNull(medianOfTwoSortedArrays.getMedian(Collections.EMPTY_LIST, Collections.EMPTY_LIST));
    }

}