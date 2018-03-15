package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 14/3/18.
 */
@RunWith(value = JUnit4.class)
public class MinimumLengthSubArrayWithSumKTest {

    MinimumLengthSubArrayWithSumK minimumLengthSubArrayWithSumK = new MinimumLengthSubArrayWithSumK();

    @Test
    public void getSubArrayWithMultipleSubArrayWithSumKReturnSmallestSubArray(){
        Assert.assertEquals(Integer.valueOf(2), minimumLengthSubArrayWithSumK.getSubArray(Arrays.asList(2,3,1,1,-1,3,4), 7));
    }

    @Test
    public void getSubArrayWithInvalidKReturnNull(){
        Assert.assertNull(minimumLengthSubArrayWithSumK.getSubArray(Arrays.asList(2,3,1,1,-1,3,4), 10));
        Assert.assertNull(minimumLengthSubArrayWithSumK.getSubArray(Arrays.asList(2,3,1,1,-1,3,4), 100));
        Assert.assertNull(minimumLengthSubArrayWithSumK.getSubArray(Arrays.asList(2,3,2,2,-1,3,4), 1));
    }

    @Test
    public void getSubArrayWithSingleSubArrayWithSumKReturnSubArray(){
        Assert.assertEquals(Integer.valueOf(7), minimumLengthSubArrayWithSumK.getSubArray(Arrays.asList(2,3,1,1,-1,3,4), 13));
        Assert.assertEquals(Integer.valueOf(6), minimumLengthSubArrayWithSumK.getSubArray(Arrays.asList(2,3,1,1,-1,3,4), 9));
        Assert.assertEquals(Integer.valueOf(1), minimumLengthSubArrayWithSumK.getSubArray(Arrays.asList(2,3,1,1,-1,3,4), 1));
    }

}