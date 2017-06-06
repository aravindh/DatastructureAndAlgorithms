package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 6/6/17.
 */
@RunWith(value = JUnit4.class)
public class CheckPermutationTest {
    CheckPermutation checkPermutation = new CheckPermutation();
    @Test
    public void isPermutationWithSameCharactersDifferentCasesReturnsFalse(){
        Assert.assertFalse(checkPermutation.isPermutation("god", "Dog"));
    }

    @Test
    public void isPermutationWithSameCharactersSameCasesReturnsTrue(){
        Assert.assertTrue(checkPermutation.isPermutation("god", "dog"));
    }

    @Test
    public void isPermutationWithDifferentCharactersReturnsFalse(){
        Assert.assertFalse(checkPermutation.isPermutation("abcd", "efgh"));
    }

    @Test
    public void isPermutationWithDifferentLengthReturnsFalse(){
        Assert.assertFalse(checkPermutation.isPermutation("Hello", "world"));
    }

    @Test
    public void isPermutationWithSameCharactersWithSpacesReturnsTrue(){
        Assert.assertTrue(checkPermutation.isPermutation("god", "dog     "));
    }
}