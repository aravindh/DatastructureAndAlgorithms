package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class AllPermutationsOfArrayTest {

    AllPermutationsOfArray permutationsOfArray = new AllPermutationsOfArray();

    @Test
    public void permuteWithEmptyArrayReturnsEmpty(){
        Assert.assertTrue(permutationsOfArray.permute(new int[0]).isEmpty());
    }

    @Test
    public void permuteWithSingleNumberArrayReturnsSingleElement(){
        int[] nums = new int[1];
        nums[0] = 1;
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> e = new LinkedList<>();
        e.add(1);
        list.add(e);
        Assert.assertEquals(list, permutationsOfArray.permute(nums));
    }

    @Test
    public void permuteWithValidArrayReturnsPermutations(){
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        List<List<Integer>> permute = permutationsOfArray.permute(nums);
        System.out.println(permute);
    }

}