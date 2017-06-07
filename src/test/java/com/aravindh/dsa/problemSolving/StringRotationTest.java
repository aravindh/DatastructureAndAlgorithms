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
public class StringRotationTest {

    StringRotation rotation = new StringRotation();

    @Test
    public void isRotatedStringWithValidRotatedStringReturnsTrue(){
        Assert.assertTrue(rotation.isRotatedString("waterbottel", "terbottelwa"));
        Assert.assertTrue(rotation.isRotatedString("waterbottel", "waterbottel"));
    }

    @Test
    public void isRotatedStringWithNoRotationReturnsTrue(){
        Assert.assertTrue(rotation.isRotatedString("waterbottel", "waterbottel"));
    }

    @Test
    public void isRotatedStringWithInValidRotatedStringReturnsFalse(){
        Assert.assertFalse(rotation.isRotatedString("waterbottel", "abcdefghijk"));
        Assert.assertFalse(rotation.isRotatedString("waterbottel", "hello"));
    }

}