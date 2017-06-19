package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 19/6/17.
 */
@RunWith(value = JUnit4.class)
public class RotateMatrix90DegreeTest {

    RotateMatrix90Degree rotate = new RotateMatrix90Degree();

    @Test
    public void rotateOnNonEmptyRotates90Clockwise(){
        List<List<Integer>> mat = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4));
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(3,1),
                Arrays.asList(4,2));
        rotate.rotate(mat, true);
        Assert.assertEquals(result, mat);

    }

    @Test
    public void rotateOnNonEmptyRotates90AntiClockwise(){
        List<List<Integer>> mat = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4));
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(2,4),
                Arrays.asList(1,3));
        rotate.rotate(mat, false);
        Assert.assertEquals(result, mat);

    }

    @Test
    public void rotateWithEmptyNoModificationOnMatrix(){
        List<List<Integer>> mat = new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        rotate.rotate(mat, true);
        Assert.assertEquals(result, mat);

    }
}