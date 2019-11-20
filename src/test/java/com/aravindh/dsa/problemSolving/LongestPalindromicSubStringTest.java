package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class LongestPalindromicSubStringTest {

    LongestPalindromicSubString longestPalindromicSubString = new LongestPalindromicSubString();

    @Test
    public void longestPalindromeWithNonEmptyStringReturnsPalindromeWithMaxLength() {
        Assert.assertEquals("aba", longestPalindromicSubString.longestPalindrome("babad"));
    }
}