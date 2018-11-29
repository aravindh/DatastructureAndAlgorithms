package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class RobotInGridTest {

    @Test
    public void FindPathWithValidPathReturnTrue(){
        List<List<Boolean>> mat = Arrays.asList(Arrays.asList(true, true, true),Arrays.asList(true, false, true),Arrays.asList(true, true, true));
        Assert.assertTrue(new RobotInGrid().findPaths(mat, mat.size()-1, mat.get(0).size()-1));

        List<List<Boolean>> mat1 = Arrays.asList(Arrays.asList(true, false, true),Arrays.asList(true, false, true),Arrays.asList(true, true, true));
        Assert.assertTrue(new RobotInGrid().findPaths(mat1, mat1.size()-1, mat1.get(0).size()-1));

        List<List<Boolean>> mat2 = Arrays.asList(Arrays.asList(true, true),Arrays.asList(true, false),Arrays.asList(true, true));
        Assert.assertTrue(new RobotInGrid().findPaths(mat2, mat2.size()-1, mat2.get(0).size()-1));
    }

    @Test
    public void FindPathWithValidPathReturnFalse(){
        List<List<Boolean>> mat = Arrays.asList(Arrays.asList(true, false, true),Arrays.asList(true, false, true),Arrays.asList(true, false, true));
        Assert.assertFalse(new RobotInGrid().findPaths(mat, mat.size()-1, mat.get(0).size()-1));
    }

}