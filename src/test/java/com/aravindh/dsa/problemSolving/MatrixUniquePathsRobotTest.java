package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class MatrixUniquePathsRobotTest {

    MatrixUniquePathsRobot robot = new MatrixUniquePathsRobot();

    @Test
    public void uniquePathsWithObstaclesWithSingleCellReturnOne(){
        int[][] mat = new int[1][1];
        mat[0][0] = 0;
        Assert.assertEquals(1, robot.uniquePathsWithObstacles(mat));
    }

    @Test
    public void uniquePathsWithObstaclesWithSingleCellAsObstacleReturnZero(){
        int[][] mat = new int[1][1];
        mat[0][0] = 1;
        Assert.assertEquals(0, robot.uniquePathsWithObstacles(mat));
    }

    @Test
    public void uniquePathsWithObstaclesWithValidSquareMatrixReturnCountOfWays(){
        int[][] mat = new int[3][3];
        mat[0][0] = 0;
        mat[0][1] = 0;
        mat[0][2] = 0;

        mat[1][0] = 0;
        mat[1][1] = 1;
        mat[1][2] = 0;

        mat[2][0] = 0;
        mat[2][1] = 0;
        mat[2][2] = 0;

        Assert.assertEquals(2, robot.uniquePathsWithObstacles(mat));
    }



}