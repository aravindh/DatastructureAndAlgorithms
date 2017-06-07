package com.aravindh.dsa.problemSolving;

/**
 * Given a String check if its a permutation fo a palindrome.
 * Note:
 *  We need to return only TRUE/FALSE and not all the palindrome(s)
 * What is a palindrome?
 *  A string which remains same when read from 0 to n or n to 0.
 * A String to be a palindrome, it should have all character count as even except at-most for one.
 *
 * Considering only ASCII printable characters
 * Created by aravindhravindran on 6/6/17.
 */
public class PalindromePermutation {

    public boolean isPalindromePermutation(String source){
        int[] charCount = new int[95];
        //reset the count to 0
        for(int i =0 ; i < 95; i++){
            charCount[i] = 0;
        }

        //populate charCount for source string
        for(Character c : source.toCharArray()){
            int charValue = (int) c - 32;
            charCount[charValue]++;
        }

        //Check if more than one odd count there in charCount
        boolean isOdd = false;
        for(int i =0 ; i < 95; i++){
            if(charCount[i] %2 == 1){
                if(!isOdd){
                    isOdd = true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
