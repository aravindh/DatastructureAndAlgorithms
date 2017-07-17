package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 16/7/17.
 */
@RunWith(value = JUnit4.class)
public class FindFirstOrLastOccurrenceOfElementTest {

    FindFirstOrLastOccurrenceOfElement search = new FindFirstOrLastOccurrenceOfElement();

    @Test
    public void findFirstOrLastIndexWithEmptyListReturnsNotFound(){
        Assert.assertEquals("FirstIndex",-1, search.findFirstOrLastIndex(Collections.EMPTY_LIST, 10, true));
        Assert.assertEquals("LastIndex",-1, search.findFirstOrLastIndex(Collections.EMPTY_LIST, 10, false));
    }

    @Test
    public void findFirstOrLastIndexWithInvalidTargetReturnsNotFound(){
        Assert.assertEquals("FirstIndex Target in range but not in elements",-1, search.findFirstOrLastIndex(Arrays.asList(1,2,5,6,8,10), 9, true));
        Assert.assertEquals("FirstIndex Target less than min",-1, search.findFirstOrLastIndex(Arrays.asList(4,6,7,8,9,11), 3, true));
        Assert.assertEquals("FirstIndex Target greater than max",-1, search.findFirstOrLastIndex(Arrays.asList(4,6,7,8,9,11), 13, true));

        Assert.assertEquals("LastIndex Target in range but not in elements",-1, search.findFirstOrLastIndex(Arrays.asList(1,2,5,6,8,10), 9, true));
        Assert.assertEquals("LastIndex Target less than min",-1, search.findFirstOrLastIndex(Arrays.asList(4,6,7,8,9,11), 3, true));
        Assert.assertEquals("LastIndex Target greater than max",-1, search.findFirstOrLastIndex(Arrays.asList(4,6,7,8,9,11), 13, true));
    }

    @Test
    public void findFirstOrLastIndexWithValidTargetReturnsIndexOfTheElement(){
        Assert.assertEquals("FirstIndex Target with all elements and target same",0, search.findFirstOrLastIndex(Arrays.asList(10,10,10,10,10,10), 10, true));
        Assert.assertEquals("LastIndex Target with all elements and target same",5, search.findFirstOrLastIndex(Arrays.asList(10,10,10,10,10,10), 10, false));

        Assert.assertEquals("FirstIndex Target in between elements",5, search.findFirstOrLastIndex(Arrays.asList(3,4,6,7,8,10,10,10,12,15,18), 10, true));
        Assert.assertEquals("LastIndex Target in between elements",7, search.findFirstOrLastIndex(Arrays.asList(3,4,6,7,8,10,10,10,12,15,18), 10, false));

        Assert.assertEquals("FirstIndex Target in first half elements",0, search.findFirstOrLastIndex(Arrays.asList(10,10,10,12,16,17,18,19), 10, true));
        Assert.assertEquals("LastIndex Target in first Half elements",2, search.findFirstOrLastIndex(Arrays.asList(10,10,10,12,16,17,18,19), 10, false));

        Assert.assertEquals("FirstIndex Target in second half elements",6, search.findFirstOrLastIndex(Arrays.asList(2,3,5,6,8,9,10,10,10), 10, true));
        Assert.assertEquals("LastIndex Target in second half elements",8, search.findFirstOrLastIndex(Arrays.asList(2,3,5,6,8,9,10,10,10), 10, false));

        Assert.assertEquals("FirstIndex with single Target",4, search.findFirstOrLastIndex(Arrays.asList(2,4,5,6,8,10), 8, true));
        Assert.assertEquals("LastIndex with single Target",4, search.findFirstOrLastIndex(Arrays.asList(2,4,5,6,8,10), 8, false));
    }

}