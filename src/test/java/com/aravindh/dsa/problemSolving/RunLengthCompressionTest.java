package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by aravindhravindran on 7/6/17.
 */
@RunWith(value=JUnit4.class)
public class RunLengthCompressionTest {
    RunLengthCompression compression = new RunLengthCompression();

    @Test
    public void encodeWithCompressedStringSmallerThanActualReturnsCompressedString(){
        Assert.assertEquals("a3b3", compression.encode("aaabbb"));
        Assert.assertEquals("a4b2c", compression.encode("aaaabbc"));
    }

    @Test
    public void encodeWithCompressedStringLargerThanOrEqualToActualReturnsActualString(){
        Assert.assertEquals("a2b2", compression.encode("aabb"));
        Assert.assertEquals("abcd", compression.encode("abcd"));
        Assert.assertEquals("a", compression.encode("a"));
    }

    @Test
    public void encodeWithEmptyStringReturnsActualString(){
        Assert.assertEquals("", compression.encode(""));
    }

}