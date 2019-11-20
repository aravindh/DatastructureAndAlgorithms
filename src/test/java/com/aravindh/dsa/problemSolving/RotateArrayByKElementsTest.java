package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class RotateArrayByKElementsTest {

    RotateArrayByKElements rotateArrayByKElements = new RotateArrayByKElements();

    @Test
    public void rotateWithNonEmptyListRotatesArray(){

        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 1);
        Assert.assertEquals(Arrays.asList(2,3,4,5,6,7,8,9,10,1), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 2);
        Assert.assertEquals(Arrays.asList(3,4,5,6,7,8,9,10,1,2), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 3);
        Assert.assertEquals(Arrays.asList(4,5,6,7,8,9,10,1,2,3), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 4);
        Assert.assertEquals(Arrays.asList(5,6,7,8,9,10,1,2,3,4), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 5);
        Assert.assertEquals(Arrays.asList(6,7,8,9,10,1,2,3,4,5), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 6);
        Assert.assertEquals(Arrays.asList(7,8,9,10,1,2,3,4,5,6), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 7);
        Assert.assertEquals(Arrays.asList(8,9,10,1,2,3,4,5,6,7), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 8);
        Assert.assertEquals(Arrays.asList(9,10,1,2,3,4,5,6,7,8), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 9);
        Assert.assertEquals(Arrays.asList(10,1,2,3,4,5,6,7,8,9), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 10);
        Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10), input);

    }

    @Test
    public void rotateWithNonEmptyListWithKGreaterThanLengthRotatesArray(){
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 11);
        Assert.assertEquals(Arrays.asList(2,3,4,5,6,7,8,9,10,1), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 12);
        Assert.assertEquals(Arrays.asList(3,4,5,6,7,8,9,10,1,2), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 13);
        Assert.assertEquals(Arrays.asList(4,5,6,7,8,9,10,1,2,3), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 14);
        Assert.assertEquals(Arrays.asList(5,6,7,8,9,10,1,2,3,4), input);

        input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rotateArrayByKElements.rotate(input, 15);
        Assert.assertEquals(Arrays.asList(6,7,8,9,10,1,2,3,4,5), input);
    }

    @Test
    public void rotateWithSingleElementNoModification(){
        List<Integer> input = Arrays.asList(1);
        rotateArrayByKElements.rotate(input, 1);
        Assert.assertEquals(Arrays.asList(1), input);

    }
}