package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;


@RunWith(value = JUnit4.class)
public class EquilibriumPointTest {

    EquilibriumPoint equilibriumPoint = new EquilibriumPoint();

    @Test
    public void getEquilibriumIndexWithSingleElementInListReturnZero(){
        Assert.assertEquals(-1, equilibriumPoint.getEquilibriumIndex(Arrays.asList(5)));
    }

    @Test
    public void getEquilibriumIndexWithMultipleEquilibriumPointsReturnFirstPoint(){
        Assert.assertEquals(4, equilibriumPoint.getEquilibriumIndex(Arrays.asList(1,2,3,6,12,6,1,2,3)));
    }

    @Test
    public void getEquilibriumIndexWithNoEqulibriumPointsListReturnNegativeOne(){
        Assert.assertEquals(-1, equilibriumPoint.getEquilibriumIndex(Arrays.asList(1,2,3,4,5)));
    }

}