package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class MinimumDepthBinaryTreeTest {

    @Test
    public void getMinimumDepthWithEmptyTreeReturnsZero(){
        MinimumDepthBinaryTree binaryTree = new MinimumDepthBinaryTree();
        Assert.assertEquals(0, binaryTree.getMinimumDepth());
    }

    @Test
    public void getMinimumDepthWithSingleNodeTreeReturnsOne(){
        MinimumDepthBinaryTree binaryTree = new MinimumDepthBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binaryTree, 1);
        Assert.assertEquals(1, binaryTree.getMinimumDepth());
    }

    @Test
    public void getMinimumDepthWithNonEmptyTreeReturnsOne(){
        MinimumDepthBinaryTree binaryTree = new MinimumDepthBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binaryTree, 1,2,3,4,5);
        Assert.assertEquals(2, binaryTree.getMinimumDepth());
    }
}