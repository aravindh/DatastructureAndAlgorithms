package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;


@RunWith(JUnit4.class)
public class MinimumDistanceBetweenTwoNumbersInUnSortedArrayTest {
    MinimumDistanceBetweenTwoNumbersInUnSortedArray minimumDistanceBetweenTwoNumbersInUnSortedArray = new MinimumDistanceBetweenTwoNumbersInUnSortedArray();

    @Test
    public void getMinimumDistanceWithEmptyListReturnsNull(){
        Assert.assertEquals(-1, minimumDistanceBetweenTwoNumbersInUnSortedArray.getMinimumDistance(Collections.emptyList(), 1,2));
    }

    @Test
    public void getMinimumDistanceWithNonEmptyWithMultipleXFollowedByMultipleYReturnMinimumDistance(){
        Assert.assertEquals(4, minimumDistanceBetweenTwoNumbersInUnSortedArray.getMinimumDistance(Arrays.asList(1,1,1,1,4,5,6,2,2,2,2), 1,2));
        Assert.assertEquals(4, minimumDistanceBetweenTwoNumbersInUnSortedArray.getMinimumDistance(Arrays.asList(2,2,2,2,4,5,6,1,1,1,1), 1,2));
    }

    @Test
    public void getMinimumDistanceWithNonEmptyWithMultipleXYOccurencesReturnMinimumDistance(){
        Assert.assertEquals(3, minimumDistanceBetweenTwoNumbersInUnSortedArray.getMinimumDistance(Arrays.asList(1, 3,4,5, 2, 6,7, 2, 4,5,6, 1, 5,4, 1, 4,3, 2), 1,2));
    }

    @Test
    public void getMinimumDistanceWithNonEmptyWithOnlyXYReturnsOne(){
        Assert.assertEquals(1, minimumDistanceBetweenTwoNumbersInUnSortedArray.getMinimumDistance(Arrays.asList(1,2), 1,2));
    }

    @Test
    public void getMinimumDistanceWithNonEmptyWithXAndYNextToItReturnOne(){
        Assert.assertEquals(1, minimumDistanceBetweenTwoNumbersInUnSortedArray.getMinimumDistance(Arrays.asList(1,2,3,4,5,1,2,7,8), 1,2));
    }

}