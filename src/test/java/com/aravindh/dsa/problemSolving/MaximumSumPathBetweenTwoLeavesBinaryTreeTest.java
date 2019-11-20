package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class MaximumSumPathBetweenTwoLeavesBinaryTreeTest {

    @Test
    public void maxSumBetweenLeavesWithSingleNodeReturnRoot(){
        MaximumSumPathBetweenTwoLeavesBinaryTree binaryTree = new MaximumSumPathBetweenTwoLeavesBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binaryTree, 1);
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(binaryTree.maxSumBetweenLeaves()));
    }

    @Test
    public void maxSumBetweenLeavesWithEmptyTreeReturnZero(){
        MaximumSumPathBetweenTwoLeavesBinaryTree binaryTree = new MaximumSumPathBetweenTwoLeavesBinaryTree();
        Assert.assertEquals(Integer.valueOf(0), Integer.valueOf(binaryTree.maxSumBetweenLeaves()));
    }

    @Test
    public void maxSumBetweenLeavesWithLeftSkewedTreeReturnSum(){
        MaximumSumPathBetweenTwoLeavesBinaryTree binaryTree = new MaximumSumPathBetweenTwoLeavesBinaryTree();
        BinaryTreeCreationHelper.getLeftSkewedBinaryTreeWithValues(binaryTree, 1,2,3,4,5,6,7);
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(binaryTree.maxSumBetweenLeaves()));
    }

    @Test
    public void maxSumBetweenLeavesWithRightSkewedTreeReturnSum(){
        MaximumSumPathBetweenTwoLeavesBinaryTree binaryTree = new MaximumSumPathBetweenTwoLeavesBinaryTree();
        BinaryTreeCreationHelper.getRightSkewedBinaryTreeWithValues(binaryTree, 1,2,3,4,5,6,7);
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(binaryTree.maxSumBetweenLeaves()));
    }

}