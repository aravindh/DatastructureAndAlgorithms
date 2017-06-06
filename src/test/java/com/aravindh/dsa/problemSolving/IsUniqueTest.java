package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 6/6/17.
 */
@RunWith(value=JUnit4.class)
public class IsUniqueTest {
    private IsUnique isUnique = new IsUnique();
    @Test
    public void hasUniqueCharactersWithAllUniqueCharactersStringReturnsTrue(){
        Assert.assertTrue(isUnique.hasUniqueCharacters("abcd"));
        Assert.assertTrue(isUnique.hasUniqueCharacters("aAcd"));
    }

    @Test
    public void hasUniqueCharactersWithNonUniqueCharactersStringReturnsFalse(){
        Assert.assertFalse(isUnique.hasUniqueCharacters("bbcd"));
        Assert.assertFalse(isUnique.hasUniqueCharacters("abcdefghijklmnopqrst" +
                "abcdefghijklmnopqrst" +
                "abcdefghijklmnopqrst" +
                "abcdefghijklmnopqrst" +
                "abcdefghijklmnopqrst" +
                "abcdefghijklmnopqrst" +
                "abcdefghi"));
    }

    @Test
    public void hasUniqueCharactersWithEmptyStringReturnsTrue(){
        Assert.assertTrue(isUnique.hasUniqueCharacters(""));
    }
}