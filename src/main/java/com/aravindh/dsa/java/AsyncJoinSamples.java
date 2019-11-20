package com.aravindh.dsa.java;

import java.util.Arrays;
import java.util.List;

public class AsyncJoinSamples {
    private static void asyncSequential(){
        long startTime = System.nanoTime();
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0 ; i<nums.size()/2; i++){
            sum1 = sum1+nums.get(i);
        }

        for(int i =nums.size()/2 ; i<nums.size(); i++){
            sum2 = sum2+nums.get(i);
        }
        int sum = sum1+sum2;
        System.out.println("Sum "+sum+" time taken "+(System.nanoTime() - startTime));
    }

    private static void asyncParallel(){
        long startTime = System.nanoTime();
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0 ; i<nums.size()/2; i++){
            sum1 = sum1+nums.get(i);
        }

        for(int i =nums.size()/2 ; i<nums.size(); i++){
            sum2 = sum2+nums.get(i);
        }
        int sum = sum1+sum2;
        System.out.println("Sum "+sum+" time taken "+(System.nanoTime() - startTime));
    }
    public static void main(String[] args) {

       asyncSequential();
       asyncParallel();

       asyncSequential();
       asyncParallel();

       asyncSequential();
       asyncParallel();

       asyncSequential();
       asyncParallel();

       asyncSequential();
       asyncParallel();
    }
}
