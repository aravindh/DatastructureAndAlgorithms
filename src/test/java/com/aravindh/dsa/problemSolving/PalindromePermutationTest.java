package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 7/6/17.
 */
@RunWith(value=JUnit4.class)
public class PalindromePermutationTest {
    PalindromePermutation palindromePermutation = new PalindromePermutation();

    @Test
    public void isPalindromePermutationWithPalindromeStringReturnsTrue(){
        Assert.assertTrue(palindromePermutation.isPalindromePermutation("madam"));
        Assert.assertTrue(palindromePermutation.isPalindromePermutation("aabbccdd"));
        Assert.assertTrue(palindromePermutation.isPalindromePermutation("aabbccdde"));
    }

    @Test
    public void isPalindromePermutationWithNonPalindromeStringReturnsFalse(){
        Assert.assertFalse(palindromePermutation.isPalindromePermutation("aabbccddde"));
        Assert.assertFalse(palindromePermutation.isPalindromePermutation("aabbccde"));
    }
}