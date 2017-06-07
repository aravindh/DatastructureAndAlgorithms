package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 7/6/17.
 */
@RunWith(value = JUnit4.class)
public class OneAwayTest {
    OneAway oneAway = new OneAway();

    @Test
    public void isOneEditAwayWithDifferenceOneExtraCharReturnsTrue(){
        Assert.assertTrue(oneAway.isOneEditAway("ale", "pale"));
        Assert.assertTrue(oneAway.isOneEditAway("pale", "ale"));
        Assert.assertTrue(oneAway.isOneEditAway("pale", "pal"));
        Assert.assertTrue(oneAway.isOneEditAway("pale", "ple"));
    }

    @Test
    public void isOneEditAwayWithDifferenceOneReplaceReturnsTrue(){
        Assert.assertTrue(oneAway.isOneEditAway("bale", "pale"));
    }

    @Test
    public void isOneEditAwayWithMultipleDifferencesReturnsFalse(){
        Assert.assertFalse(oneAway.isOneEditAway("hello", "world"));
        Assert.assertFalse(oneAway.isOneEditAway("hello", "abcde"));
    }

    @Test
    public void isOneEditAwayWithNoDifferencesReturnsFalse(){
        Assert.assertFalse(oneAway.isOneEditAway("hello", "hello"));
    }
}