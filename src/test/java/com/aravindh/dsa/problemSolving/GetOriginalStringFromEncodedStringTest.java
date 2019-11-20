package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class GetOriginalStringFromEncodedStringTest {

    @Test
    public void getEncodedStringWithNoRepeatReturnsSame(){
        GetOriginalStringFromEncodedString encoder = new GetOriginalStringFromEncodedString();
        Assert.assertEquals("abcd", encoder.getEncodedString("abcd"));
        Assert.assertEquals("a", encoder.getEncodedString("a"));
        Assert.assertEquals("a", encoder.getEncodedString("1[a]"));
        Assert.assertEquals("abcd", encoder.getEncodedString("1[a1[b1[c1[d]]]]"));
    }

    @Test
    public void getEncodedStringWithValidRepeatReturnsEncoded(){
        GetOriginalStringFromEncodedString encoder = new GetOriginalStringFromEncodedString();
        //Assert.assertEquals("efaaaaaaaaaaaaaaaaaaabc", encoder.getEncodedString("ef2[3[3[a]]]abc"));
        Assert.assertEquals("aaadebcbcfg", encoder.getEncodedString("3[a]de2[bc]fg"));
    }
}