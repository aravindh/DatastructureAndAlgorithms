package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class LongestConsecutiveNumbersSubSetTest {

    LongestConsecutiveNumbersSubSet longestConsecutiveNumbersSubSet = new LongestConsecutiveNumbersSubSet();

    @Test
    public void getLongestSubSetLengthWithSingleSetReturnLengthOfLargestSubSet(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> longestSubSet = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertEquals(longestSubSet.size(), longestConsecutiveNumbersSubSet.getLongestSubSetLength(numbers));
    }

    @Test
    public void getLongestSubSetLengthWithNoConsecutiveNumbersReturnZero(){
        List<Integer> numbers = Arrays.asList(1, 3, 5);
        List<Integer> longestSubSet = Collections.emptyList();
        Assert.assertEquals(longestSubSet.size(), longestConsecutiveNumbersSubSet.getLongestSubSetLength(numbers));
    }

    @Test
    public void getLongestSubSetLengthWithMultipleSubSetsSameLengthReturnLengthOfLargestSubSet(){
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7, 8, 10);
        List<Integer> longestSubSet = Arrays.asList(1,2);
        Assert.assertEquals(longestSubSet.size(), longestConsecutiveNumbersSubSet.getLongestSubSetLength(numbers));
    }

    @Test
    public void getLongestSubSetLengthWithMultipleSubSetsButSingleLargetsSubSetReturnLengthOfLargestSubSet(){
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7, 8, 9);
        List<Integer> longestSubSet = Arrays.asList(7,8,9);
        Assert.assertEquals(longestSubSet.size(), longestConsecutiveNumbersSubSet.getLongestSubSetLength(numbers));
    }

    @Test
    public void getLongestSubSetLengthWithMultipleSubSetsButSingleLargetsSubSetInReverseOrderReturnLengthOfLargestSubSet(){
        List<Integer> numbers = Arrays.asList(8,5,7,4,9,2,1); //1, 2, 4, 5, 7, 8, 9
        List<Integer> longestSubSet = Arrays.asList(7,8,9);
        Assert.assertEquals(longestSubSet.size(), longestConsecutiveNumbersSubSet.getLongestSubSetLength(numbers));
    }

    @Test
    public void getLongestSubSetLengthWithSingleNumberReturnLengthOfLargestSubSet(){
        List<Integer> numbers = Arrays.asList(1);
        List<Integer> longestSubSet = Arrays.asList(1);
        Assert.assertEquals(longestSubSet.size(), longestConsecutiveNumbersSubSet.getLongestSubSetLength(numbers));
    }

    @Test
    public void getLongestSubSetLengthWithEmptyListReturnLengthOfLargestSubSet(){
        List<Integer> numbers = Collections.EMPTY_LIST;
        List<Integer> longestSubSet = Collections.EMPTY_LIST;
        Assert.assertEquals(longestSubSet.size(), longestConsecutiveNumbersSubSet.getLongestSubSetLength(numbers));
    }
}