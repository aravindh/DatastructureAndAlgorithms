package com.aravindh.dsa.problemSolving;

/**
 * Given a String, find whether its has all unique char or not.
 *
 * #Arrays
 * #HashTable
 * Approach 1: for each character, check against all other characters. O(n^2)
 * Approach 2: Sorting O(nlogn)
 * Approach 3: HashTable/boolean array for 128 characters, O(n) constant space
 * Created by aravindhravindran on 6/6/17.
 */
public class IsUnique {
    public boolean hasUniqueCharacters(String source){

        if(source.length() > 128){
            return false;
        }
        boolean[] charsVsAvilability = new boolean[128];
        for(int i = 0; i < 128; i++){
            charsVsAvilability[i] = false;
        }

        for(Character c : source.toCharArray()){
            int charValue = (int)c;
            if(charsVsAvilability[charValue]){
                return false;
            }
            charsVsAvilability[charValue] = true;
        }
        return true;
    }
}
