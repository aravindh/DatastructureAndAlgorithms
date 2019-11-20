package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class PrintMatrixDiagonalTest {

    PrintMatrixDiagonal printDiagonal = new PrintMatrixDiagonal();

    @Test
    public void printDiagonalWithSquareMatrixReturnsDiagonalElements(){
        int[][] mat = new int[3][3];
        mat[0] = new int[]{1,2,3};
        mat[1] = new int[]{4,5,6};
        mat[2] = new int[]{7,8,9};
        String diagonalElements = "1,2,4,7,5,3,6,8,9,";

        Assert.assertEquals(diagonalElements, resultString(printDiagonal.findDiagonalOrder(mat)));
    }

    private String resultString(int[] result){
        StringBuilder builder = new StringBuilder();
        for(int i =0; i< result.length; i++){
            builder.append(result[i]).append(",");
        }
        return builder.toString();
    }

}