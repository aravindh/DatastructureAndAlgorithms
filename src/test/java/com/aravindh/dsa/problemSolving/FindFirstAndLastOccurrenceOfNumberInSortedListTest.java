package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

@RunWith(value = JUnit4.class)
public class FindFirstAndLastOccurrenceOfNumberInSortedListTest {

    FindFirstAndLastOccurrenceOfNumberInSortedList findFirstAndLastOccurrenceOfNumberInSortedList = new FindFirstAndLastOccurrenceOfNumberInSortedList();

    @Test
    public void getOccurrenceOnEmptyListReturnsEmptyList(){
        Assert.assertTrue(findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Collections.EMPTY_LIST, 2).isEmpty());
    }

    @Test
    public void getOccurrenceOnNonEmptyAndInvalidTargetListReturnsEmptyList(){
        Assert.assertTrue(findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(2,2,3,4,5), 1).isEmpty());
        Assert.assertTrue(findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(2,2,3,4,5), 6).isEmpty());
        Assert.assertTrue(findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,3,4,5), 2).isEmpty());
        Assert.assertTrue(findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,2,4,5), 3).isEmpty());
        Assert.assertTrue(findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,2,3,5), 4).isEmpty());
    }

    @Test
    public void getOccurrenceOnNonEmptyUniqueElementsAndValidTargetReturnStartAndEndIndexAsSame(){
        Assert.assertEquals(Arrays.asList(0,0), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1), 1));
        Assert.assertEquals(Arrays.asList(0,0), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,2,3,4,5), 1));
        Assert.assertEquals(Arrays.asList(1,1), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,2,3,4,5), 2));
        Assert.assertEquals(Arrays.asList(2,2), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,2,3,4,5), 3));
        Assert.assertEquals(Arrays.asList(3,3), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,2,3,4,5), 4));
        Assert.assertEquals(Arrays.asList(4,4), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,2,3,4,5), 5));
    }

    @Test
    public void getOccurrenceOnNonEmptyNonUniqueElementsAndValidTargetReturnStartAndEndIndex(){
        Assert.assertEquals(Arrays.asList(0,2), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,1,1,4,5), 1));
        Assert.assertEquals(Arrays.asList(2,4), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,2,5,5,5), 5));
        Assert.assertEquals(Arrays.asList(1,2), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,3,3,4,5), 3));
        Assert.assertEquals(Arrays.asList(2,3), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,2,4,4,5), 4));
        Assert.assertEquals(Arrays.asList(0,4), findFirstAndLastOccurrenceOfNumberInSortedList.getOccurrences(Arrays.asList(1,1,1,1,1), 1));
    }
}