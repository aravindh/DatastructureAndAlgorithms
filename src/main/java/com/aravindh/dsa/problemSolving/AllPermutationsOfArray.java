package com.aravindh.dsa.problemSolving;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AllPermutationsOfArray {

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        return getPermutation(nums, 0, n-1);

    }

    private List<List<Integer>> getPermutation(int[] nums, int start, int end){
        System.out.println("Permute with start "+start+" end "+end);
        if(start > end){
            return Collections.EMPTY_LIST;
        }
        List<List<Integer>> result = new LinkedList();
        for(int i = start; i<= end; i++){
            System.out.println("fix start "+i);
            swap(nums, start, i );
            List<List<Integer>> subSol = getPermutation(nums, start+1, end);
            if(subSol.isEmpty()){
                List<Integer> list = new LinkedList();
                list.add(nums[start]);
                result.add(list);
                continue;
            }
            for(List<Integer> sol : subSol){
                List<Integer> list = new LinkedList();
                list.add(nums[start]);
                list.addAll(sol);
                result.add(list);
            }
            swap(nums, i, start);
        }
        return result;
    }

    private void swap(int[] nums, int src, int target){
        int temp = nums[src];
        nums[src] = nums[target];
        nums[target] = temp;
    }
}
