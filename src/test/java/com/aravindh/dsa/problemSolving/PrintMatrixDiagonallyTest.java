package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 14/2/18.
 */
@RunWith(value = JUnit4.class)
public class PrintMatrixDiagonallyTest {
    PrintMatrixDiagonally printMatrixDiagonally = new PrintMatrixDiagonally();

    @Test
    public void printDiagonalWithSquareMatrixReturnsDiagonalElements(){
        List<Integer> row1 = Arrays.asList(1,2,3);
        List<Integer> row2 = Arrays.asList(4,5,6);
        List<Integer> row3 = Arrays.asList(7,8,9);
        List<List<Integer>> mat = Arrays.asList(row1, row2, row3);
        String diagonalElements = "1,2,4,3,5,7,6,8,9,";
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, true));
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, false));
    }

    @Test
    public void printDiagonalWithRectangleMatrixReturnsDiagonalElements(){
        List<Integer> row1 = Arrays.asList(1,2,3,4);
        List<Integer> row2 = Arrays.asList(5,6,7,8);
        List<List<Integer>> mat = Arrays.asList(row1, row2);
        String diagonalElements = "1,2,5,3,6,4,7,8,";
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, true));
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, false));

        List<Integer> row3 = Arrays.asList(1,2);
        List<Integer> row4 = Arrays.asList(3,4);
        List<Integer> row5 = Arrays.asList(5,6);
        List<Integer> row6 = Arrays.asList(7,8);
        List<List<Integer>> mat1 = Arrays.asList(row3, row4, row5, row6);
        String diagonalElements1 = "1,2,3,4,5,6,7,8,";
        Assert.assertEquals(diagonalElements1, printMatrixDiagonally.printDiagonal(mat1, true));
        Assert.assertEquals(diagonalElements1, printMatrixDiagonally.printDiagonal(mat1, false));
    }

    @Test
    public void printDiagonalWithSingleRowMatrixReturnsDiagonalElements(){
        List<Integer> row1 = Arrays.asList(1,2,3,4,5,6);
        List<List<Integer>> mat = Arrays.asList(row1);
        String diagonalElements = "1,2,3,4,5,6,";
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, true));
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, false));
    }

    @Test
    public void printDiagonalWithSingleColumnMatrixReturnsDiagonalElements(){
        List<Integer> row1 = Arrays.asList(1);
        List<Integer> row2 = Arrays.asList(2);
        List<Integer> row3 = Arrays.asList(3);
        List<Integer> row4 = Arrays.asList(4);

        List<List<Integer>> mat = Arrays.asList(row1, row2, row3, row4);
        String diagonalElements = "1,2,3,4,";
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, true));
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, false));
    }

    @Test
    public void printDiagonalWithSingleCellReturnsDiagonalElements(){
        List<Integer> row1 = Arrays.asList(1);
        List<List<Integer>> mat = Arrays.asList(row1);
        String diagonalElements = "1,";
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, true));
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, false));
    }

    @Test
    public void printDiagonalWithEmptyReturnsDiagonalElements(){
        List<Integer> row1 = Arrays.asList();
        List<List<Integer>> mat = Arrays.asList(row1);
        String diagonalElements = "";
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, true));
        Assert.assertEquals(diagonalElements, printMatrixDiagonally.printDiagonal(mat, false));
    }

}