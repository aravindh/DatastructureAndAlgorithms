package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

@RunWith(value = JUnit4.class)
public class MinimumLengthUnSortedSubArrayToSortCompleteArrayTest {
    MinimumLengthUnSortedSubArrayToSortCompleteArray minimumLengthUnSortedSubArrayToSortCompleteArray = new MinimumLengthUnSortedSubArrayToSortCompleteArray();

    @Test
    public void getUnSortedSubArrayLengthWithEmptyListReturnZero(){
        Assert.assertEquals(0, minimumLengthUnSortedSubArrayToSortCompleteArray.getUnSortedSubArrayLength(Collections.<Integer>emptyList()));
    }

    @Test
    public void getUnSortedSubArrayLengthWithNonEmptyUnSortedSubArrayListReturnSubArrayLength(){
        Assert.assertEquals(0, minimumLengthUnSortedSubArrayToSortCompleteArray.getUnSortedSubArrayLength(Arrays.asList(1,2,5,3,4,7,6,8,9,10)));
        Assert.assertEquals(0, minimumLengthUnSortedSubArrayToSortCompleteArray.getUnSortedSubArrayLength(Arrays.asList(2,5,3,1,4,7,6,8,9,10)));
        Assert.assertEquals(0, minimumLengthUnSortedSubArrayToSortCompleteArray.getUnSortedSubArrayLength(Arrays.asList(1,2,5,3,10,4,7,6,8,9)));
        Assert.assertEquals(0, minimumLengthUnSortedSubArrayToSortCompleteArray.getUnSortedSubArrayLength(Arrays.asList(1,2,5,3,9,4,7,6,8,10)));
        Assert.assertEquals(0, minimumLengthUnSortedSubArrayToSortCompleteArray.getUnSortedSubArrayLength(Arrays.asList(10,9,8,7,6,5,4,3,2,1)));
    }

    @Test
    public void getUnSortedSubArrayLengthWithNonEmptySortedSubArrayListReturnZero(){
        Assert.assertEquals(0, minimumLengthUnSortedSubArrayToSortCompleteArray.getUnSortedSubArrayLength(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
    }
}