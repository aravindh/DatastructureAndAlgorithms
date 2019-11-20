package com.aravindh.dsa.problemSolving;

/**
 * Created by aravindhravindran on 30/5/17.
 * Given a list of numbers(both +ve and -ve), find the maxSumSubarray.
 *
 * Eg 1: 3, -2, 5, -1
 * o/p: 6 (3, -2, 5)
 *
 * Eg 2: -3, -2, -5, -1
 * o/p: -1
 *
 */
public class MaxSumSubarray {


    public int getMaxSumSubArray(int[] numbers){
        return getMaxSumSubArrayApproach1(numbers);
    }

    //Approach 1: BruteForce
    //Foreach subArray sizes(1-n), get all sub arrays, calculate the sum of each subArray and get the maxSum.
    //Time Complexity: O(n^3) Because of the 3 nested loops,
    // the outer loop runs from 1-n,
    // the next inner loop runs from 1-n and
    // the inner most loop runs from start - end, which on worst case runs from 1-n

    public int getMaxSumSubArrayApproach1(int[] numbers){
        Integer maxSum = Integer.MIN_VALUE;
        for(int size = 1; size <= numbers.length; size++){
            for(int start = 0; start < numbers.length; start++){
                int end = start+1;
                if(end > numbers.length){
                    break;
                }
                int currSum = 0;
                for(int i = start; i < end; i++){
                    currSum += numbers[i];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    //Approach 2:
    //For each startIndex, for each size, calculate the sums and get the maxSum
    //The difference between the approach 1 and approach 2 is that instead of iterating multiple time the same element,
    // we keep adding the extra element to the old sum subarray
    // i.e, lets say the array is 1, 2, 3, the sub arrays will be
    // [1]  sum=1
    // [1,2] sum = prevSum + 2 = 3
    // [1,2,3] sum = prevSum + 3 = 6
    // Time complexity: O(n^2)
    // Why ?? How many nested loops this time ??
    // One outer loop for startIndex 1-n and inner loop deciding the size 1-n
    public int getMaxSumSubArrayApproach2(int[] numbers){
        Integer maxSum = Integer.MIN_VALUE;
        for(int start = 0; start < numbers.length; start++){
            int currSum = 0;
            for(int size = 1; size <= numbers.length; size++){
                int end = start + size;
                if(end > numbers.length){
                    break;
                }
                currSum += numbers[end-1];
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    //Approach 3:
    //Divide and conquer
    //Given a array the maxSumSubArray can either lie in left half of array, right half of array or in both.
    //We can call getMaxSum on left and right half recursively and Find Left_Max_Sum and Right_Max_sum
    //for the combination of both, we find the right sum from middle to n
    //and left sum from middle to start
    //result will be max(Left_Max_Sum, Right_Max_sum, (left sum + right sum))
    //How does the subarray with combination of left and right part work ??
    //Time Complexity: O(nlogn)
    //Because
    public int getMaxSumSubArrayApproach3(int[] numbers, int start, int end){
        return 0;
    }

    //Approach 4:
    //Kadane's algorithm
    //MaximumSumSubArray(MSS) at i+1 is Max(MSS of i + element i+1, MSS of i)
    //It assumes, atleast one possible maxSubArray, even if all are -ve one max element of them will be MSS
    //Time Complexity: O(n)
    //Because there is only one loop from 1-n or each element is visited only once.
    public int getMaxSumSubArrayApproach4(int[] numbers){
        Integer globalMax = Integer.MIN_VALUE;
        
        return 0;
    }

}
