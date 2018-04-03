package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 1/2/18.
 */
@RunWith(value = JUnit4.class)
public class FindDuplicateInArrayTest {

    FindDuplicateInArray findDuplicateInArray = new FindDuplicateInArray();

    @Test
    public void repeatedNumberWithUniqueNumbersReturnsEmptyList(){
        Assert.assertTrue(findDuplicateInArray.repeatedNumber(Arrays.asList(0,1,2,3,4)).isEmpty());
        Assert.assertTrue(findDuplicateInArray.repeatedNumber(Arrays.asList(4,3,2,1,0)).isEmpty());
    }

    @Test
    public void repeatedNumberWithEmptyNumbersReturnsEmptyList(){
        Assert.assertTrue(findDuplicateInArray.repeatedNumber(Collections.EMPTY_LIST).isEmpty());
    }

    @Test
    public void repeatedNumberWithNonUniqueNumbersReturnsEmptyList(){
        Assert.assertEquals(Arrays.asList(1), findDuplicateInArray.repeatedNumber(Arrays.asList(1,1,2,3,4)));
        Assert.assertEquals(Arrays.asList(2), findDuplicateInArray.repeatedNumber(Arrays.asList(1,2,2,3,4)));
        Assert.assertEquals(Arrays.asList(3), findDuplicateInArray.repeatedNumber(Arrays.asList(1,2,3,3,4)));
        Assert.assertEquals(Arrays.asList(4), findDuplicateInArray.repeatedNumber(Arrays.asList(1,2,3,4,4)));
        Assert.assertEquals(Arrays.asList(1,2,3,4,5), findDuplicateInArray.repeatedNumber(Arrays.asList(1,1,2,2,3,3,4,4,5,5)));
        Assert.assertEquals(Arrays.asList(1,2,3,4,5), findDuplicateInArray.repeatedNumber(Arrays.asList(5,5,4,4,3,3,2,2,1,1)));
        Assert.assertEquals(Arrays.asList(1), findDuplicateInArray.repeatedNumber(Arrays.asList(1,1,1,1,1)));

        }


}