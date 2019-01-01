package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class BinaryStringsWithNoConsecutiveOnesTest {

    @Test
    public void getNumberOfStringsWithZeroReturnsZero(){
        BinaryStringsWithNoConsecutiveOnes binaryStringsWithNoConsecutiveOnes = new BinaryStringsWithNoConsecutiveOnes();
        Assert.assertEquals(0, binaryStringsWithNoConsecutiveOnes.getNumberOfStrings(0));
    }

    @Test
    public void getNumberOfStringsWithValidNReturnsNumberOfStrings(){
        BinaryStringsWithNoConsecutiveOnes binaryStringsWithNoConsecutiveOnes = new BinaryStringsWithNoConsecutiveOnes();
        Assert.assertEquals(2, binaryStringsWithNoConsecutiveOnes.getNumberOfStrings(1));
        Assert.assertEquals(3, binaryStringsWithNoConsecutiveOnes.getNumberOfStrings(2));
        Assert.assertEquals(5, binaryStringsWithNoConsecutiveOnes.getNumberOfStrings(3));
        Assert.assertEquals(8, binaryStringsWithNoConsecutiveOnes.getNumberOfStrings(4));
        Assert.assertEquals(13, binaryStringsWithNoConsecutiveOnes.getNumberOfStrings(5));
    }
}