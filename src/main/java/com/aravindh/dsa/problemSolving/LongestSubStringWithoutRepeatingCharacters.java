package com.aravindh.dsa.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        Integer maxLength = Integer.MIN_VALUE;
        int currLength = 1;
        int startIdx = 0;
        int endIdx = 1;
        Map<Character, Integer> charVsCount = new HashMap();
        charVsCount.put(s.charAt(startIdx), startIdx);

        while(endIdx < s.length()){
            Character curr = s.charAt(endIdx);

            if(charVsCount.containsKey(curr)){
                if(currLength > maxLength ){
                    maxLength = currLength;
                }
                int newStartIdx = charVsCount.get(curr);
                while(startIdx <= newStartIdx){
                    currLength--;
                    charVsCount.remove(s.charAt(startIdx));
                    startIdx++;
                }
            }
            charVsCount.put(curr, endIdx);

            currLength++;
            endIdx++;
        }
        if(currLength > maxLength){
            maxLength = currLength;
        }
        return maxLength;
    }
    /*public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }*/
}
