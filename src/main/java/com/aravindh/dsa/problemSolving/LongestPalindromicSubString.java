package com.aravindh.dsa.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubString {
    Map<String, Boolean> stringVsIsPalindrome = new HashMap();
    Integer maxLength = Integer.MIN_VALUE;
    String maxLengthPalindrome = null;
    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length()-1; i++){
            lps(s, i, s.length()-1);
        }

        return maxLengthPalindrome;
    }

    public Boolean lps(String s, int start, int end){
        if(end < start){
            return false;
        }
        if(end == start){
            return true;
        }

        String curr = s.substring(start, end+1);
        if(stringVsIsPalindrome.containsKey(curr)){
            return stringVsIsPalindrome.get(curr);
        }
        Boolean isLpsOnSubString = lps(s, start, end -1);
        boolean isCurrentStringPalindrome = s.charAt(start) == s.charAt(end);
        System.out.println("isLps before "+curr+" result "+isLpsOnSubString+" start "+start+" end "+end+" isCurrentStringPalindrome "+isCurrentStringPalindrome);
        if(isCurrentStringPalindrome && isLpsOnSubString){
            System.out.println("isLps "+s+" result "+isLpsOnSubString+" start "+start+" end "+end);
            if((end-start) > maxLength){
                maxLength = end-start;
                maxLengthPalindrome = curr;
            }
            return true;
        }
        return false;
    }
}
