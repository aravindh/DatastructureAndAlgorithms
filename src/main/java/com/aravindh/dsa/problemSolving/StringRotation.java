package com.aravindh.dsa.problemSolving;

/**
 * Given string s1(actual) and s2(rotated), check if the s2 is a rotated string of s1.
 * You are given a subString method which can be called only once.
 *
 * Eg: s1 = waterbottel
 * s2 = terbottelwa
 *
 * Approach:
 *  lets us assume the string has 2 parts based on the point of rotation, x, y
 *  i.e x = terbottel y=wa
 *  s1 = terbottelwa = xy
 *  s2 = waterbottel = yx
 *
 *  so we concat s1 + s1 = terbottelwa + terbottelwa = xy + xy
 *  In the concated string xyxy, yx which is the substring of it, which is the actual string
 *  Even if the string is rotated 0 times, this logic still applies.
 *
 *  TimeComplexity: O(n) space: 2n
 *
 * Created by aravindhravindran on 7/6/17.
 */
public class StringRotation {
    public boolean isRotatedString(String actual, String rotated){
        if(actual.length() != rotated.length()){
            return false;
        }
        String concatedString = rotated + rotated;
        if(concatedString.contains(actual)){
            return true;
        }else {
            return false;
        }
    }
}
