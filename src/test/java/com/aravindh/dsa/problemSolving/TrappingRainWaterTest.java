package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class TrappingRainWaterTest {

    TrappingRainWater trappingRainWater = new TrappingRainWater();

    @Test
    public void maxWaterTrappedWithSingleTowerReturnsZero(){
        Assert.assertEquals(Integer.valueOf(0), trappingRainWater.maxWaterTrapped(Arrays.asList(1)));
    }

    @Test
    public void maxWaterTrappedWithTowerInAscendingOrderReturnsZero(){
        Assert.assertEquals(Integer.valueOf(0), trappingRainWater.maxWaterTrapped(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    public void maxWaterTrappedWithTowerWithSameValuesReturnsZero(){
        Assert.assertEquals(Integer.valueOf(0), trappingRainWater.maxWaterTrapped(Arrays.asList(5,5,5,5,5)));
    }

    @Test
    public void maxWaterTrappedWithTowerInDescendingOrderReturnsZero(){
        Assert.assertEquals(Integer.valueOf(0), trappingRainWater.maxWaterTrapped(Arrays.asList(5,4,3,2,1)));
    }

    @Test
    public void maxWaterTrappedWithMultipleTowersOrderReturnsTrappedWaterCount(){
        Assert.assertEquals(Integer.valueOf(20), trappingRainWater.maxWaterTrapped(Arrays.asList(5,6,4,7,3,8,2,9,1,10)));
    }

}