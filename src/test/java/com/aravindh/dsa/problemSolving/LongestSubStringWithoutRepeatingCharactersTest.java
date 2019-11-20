package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class LongestSubStringWithoutRepeatingCharactersTest {

    LongestSubStringWithoutRepeatingCharacters longestSubStringWithoutRepeatingCharacters = new LongestSubStringWithoutRepeatingCharacters();

    @Test
    public void lengthOfLongestSubstringWithNonEmptyStringReturnsMaxLength(){
        Assert.assertEquals(3, longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(2, longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("au"));
    }

    @Test
    public void lengthOfLongestSubstringWithEmptyStringReturnsZero(){
        Assert.assertEquals(0, longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
    }
}