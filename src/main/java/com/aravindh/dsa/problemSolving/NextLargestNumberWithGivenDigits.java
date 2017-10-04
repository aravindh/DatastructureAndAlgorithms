package com.aravindh.dsa.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given a number, get the next largest number with the same set of digits by rearranging them.
 * Example: 12345
 * o/p: 12354
 * 
 * i/p: 54321
 * o/p: null (Not Possible because the given number the largets number with these digits)
 * 
 * i/p: 218765
 * o/p: 251678
 *
 * Approach 1: O(n^2)
 *  Start iterating the characters from 0 to n, if we encounter a space replace it with %20 by shifting the rest of the characters.
 * Approach 2: O(n)
 *  Start iterating n down to 0, (because the bottleneck in approach 1 was shifting chars each time)
 *  if we encounter a space replace with %20 or else the same char.
 *
 * Created by aravindhravindran on 18/9/17.
 */

public class NextLargestNumberWithGivenDigits{

public Integer nextLargestNumber(Integer number){
    char[] digits = String.valueOf(number).toCharArray();
    if(digits.length <= 1){
        return number;
    }
    int minIdx = -1;
    int prev = digits[digits.length-1];
    for(int i = digits.length-2; i >= 0; i--){
        int curr = digits[i];
        if(curr < prev){
            minIdx = i;
            break;
        }
        prev = curr;
    }
    if(minIdx == -1){
        return null;
    }

    int nextMinIdx = minIdx+1;
    for(int i = minIdx+1; i < digits.length; i++){
        int curr = digits[i];
        if(curr < digits[nextMinIdx] && curr > digits[minIdx]){
            nextMinIdx = i;
        }
    }

    char temp = digits[minIdx];
    digits[minIdx] = digits[nextMinIdx];
    digits[nextMinIdx] = temp;

    Arrays.sort(digits, minIdx+1, digits.length);
    return Integer.valueOf(new String(digits));
}

}
