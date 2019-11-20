package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Map;

@RunWith(value = JUnit4.class)
public class DiagonalSumBinaryTreeTest {

    @Test
    public void getDiagonalSumWithEmprtTreeReturnsZero(){
        DiagonalSumBinaryTree binaryTree = new DiagonalSumBinaryTree();
        for(Boolean method: Arrays.asList(Boolean.TRUE, Boolean.FALSE)) {
            Assert.assertEquals(0, binaryTree.getDiagonalSum(method).size());
        }
    }

    @Test
    public void getDiagonalSumWithSingleNodeTreeReturnsSum(){
        DiagonalSumBinaryTree binaryTree = new DiagonalSumBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binaryTree, 1);
        for(Boolean method: Arrays.asList(Boolean.TRUE, Boolean.FALSE)) {
            Map<Integer, Integer> diagonalSum = binaryTree.getDiagonalSum(method);
            Assert.assertEquals(1, diagonalSum.size());
            Assert.assertEquals(Integer.valueOf(1), diagonalSum.get(Integer.valueOf(0)));
        }
    }


    @Test
    public void getDiagonalSumWithRightSkewedTreeReturnsSum(){
        DiagonalSumBinaryTree binaryTree = new DiagonalSumBinaryTree();
        BinaryTreeCreationHelper.getRightSkewedBinaryTreeWithValues(binaryTree, 1,2,3);
        for(Boolean method: Arrays.asList(Boolean.TRUE, Boolean.FALSE)) {
            Map<Integer, Integer> diagonalSum = binaryTree.getDiagonalSum(method);
            Assert.assertEquals(1, diagonalSum.size());
            Assert.assertEquals(Integer.valueOf(6), diagonalSum.get(Integer.valueOf(0)));
        }
    }


    @Test
    public void getDiagonalSumWithLeftSkewedTreeReturnsSum(){
        DiagonalSumBinaryTree binaryTree = new DiagonalSumBinaryTree();
        BinaryTreeCreationHelper.getLeftSkewedBinaryTreeWithValues(binaryTree, 1,2,3);
        for(Boolean method: Arrays.asList(Boolean.TRUE, Boolean.FALSE)) {
            Map<Integer, Integer> diagonalSum = binaryTree.getDiagonalSum(method);
            Assert.assertEquals(3, diagonalSum.size());
            Assert.assertEquals(Integer.valueOf(1), diagonalSum.get(Integer.valueOf(0)));
            Assert.assertEquals(Integer.valueOf(2), diagonalSum.get(Integer.valueOf(1)));
            Assert.assertEquals(Integer.valueOf(3), diagonalSum.get(Integer.valueOf(2)));
        }
    }


    @Test
    public void getDiagonalSumWithNonEmptyTreeReturnsSum(){
        DiagonalSumBinaryTree binaryTree = new DiagonalSumBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binaryTree, 1,2,3,4,5,6,7,8,9,10,11,12,13,14);
        for(Boolean method: Arrays.asList(Boolean.TRUE, Boolean.FALSE)) {
            Map<Integer, Integer> diagonalSum = binaryTree.getDiagonalSum(method);
            Assert.assertEquals(4, diagonalSum.size());
            Assert.assertEquals(Integer.valueOf(11), diagonalSum.get(Integer.valueOf(0)));
            Assert.assertEquals(Integer.valueOf(51), diagonalSum.get(Integer.valueOf(1)));
            Assert.assertEquals(Integer.valueOf(35), diagonalSum.get(Integer.valueOf(2)));
            Assert.assertEquals(Integer.valueOf(8), diagonalSum.get(Integer.valueOf(3)));
        }
    }


}