package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class FindCountOfRotationOfSortedNumbersTest {

    FindCountOfRotationOfSortedNumbers findCountOfRotationOfSortedNumbers = new FindCountOfRotationOfSortedNumbers();

    @Test
    public void findRotationCountWithEmptyListReturnZero(){
        Assert.assertEquals(0, findCountOfRotationOfSortedNumbers.findRotationCount(Collections.EMPTY_LIST));
    }

    @Test
    public void findRotationCountWithNonEmptyListNoRotationReturnZero(){
        Assert.assertEquals("Single Element in List",0, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(10)));
        Assert.assertEquals("Multiple Elements in List",0, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
    }

    @Test
    public void findRotationCountWithNonEmptyRotatedReturnRotationCount(){
        Assert.assertEquals(3, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(4,5,6,7,8,9,10,1,2,3)));
        Assert.assertEquals(9, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(10,1,2,3,4,5,6,7,8,9)));

        Assert.assertEquals(1, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(2,3,4,5,1)));
        Assert.assertEquals(2, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(3,4,5,1,2)));
        Assert.assertEquals(3, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(4,5,1,2,3)));
        Assert.assertEquals(4, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(5,1,2,3,4)));

        Assert.assertEquals(1, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(2,3,4,1)));
        Assert.assertEquals(2, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(3,4,1,2)));
        Assert.assertEquals(3, findCountOfRotationOfSortedNumbers.findRotationCount(Arrays.asList(4,1,2,3)));
    }

}