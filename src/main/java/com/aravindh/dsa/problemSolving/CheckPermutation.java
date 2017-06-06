package com.aravindh.dsa.problemSolving;

/**
 * Check if one string is permutation of another
 * Clarifications:
 *  Check if its case sensitive - YES
 *  Check if its space sensitive - NO
 *  Only printable ASCII chars Range - 32 to 126 (Both Inclusive)
 * Approach 1:
 *  Sorting the String and comparing
 * Approach 2:
 *  HashMap - time complexity is O(n) and space is constant space - O(128)
 *
 * Created by aravindhravindran on 6/6/17.
 */
public class CheckPermutation {
    public boolean isPermutation(String source, String target){

        int[] charCount = new int[95];
        //Preset the counts to 0
        for(int i =0 ;i<95; i++){
            charCount[i] = 0;
        }
        //Populate source String char count
        for(Character c : source.toCharArray()){
            if(c != ' '){
                int charValue = ((int) c) - 32;
                charCount[charValue] ++;
            }
        }

        //Check charCount with targetString
        for(Character c : target.toCharArray()){
            if(c != ' ') {
                int charValue = ((int) c) - 32;
                if (charCount[charValue] <= 0) {
                    return false;
                }
                charCount[charValue]--;
            }
        }
        return true;
    }
}
