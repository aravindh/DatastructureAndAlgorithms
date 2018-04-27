package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(value = JUnit4.class)
public class CheckBinaryTreeIsABinarySearchTreeTest {

    @Test
    public void isValidBinarySearchTreeWithEmptyTreeReturnsTrue(){
        CheckBinaryTreeIsABinarySearchTree tree = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree);
        Assert.assertTrue(tree.isValidBinarySearchTree());
    }

    @Test
    public void isValidBinarySearchTreeWithNonEmptySkewedBinarySearchTreeReturnsTrue(){
        CheckBinaryTreeIsABinarySearchTree leftSkewedBST = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getLeftSkewedBinaryTreeWithValues(leftSkewedBST, 7,6,5,4,3,2,1);
        Assert.assertTrue(leftSkewedBST.isValidBinarySearchTree());

        CheckBinaryTreeIsABinarySearchTree rightSkewedBST = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getRightSkewedBinaryTreeWithValues(rightSkewedBST, 1,2,3,4,5,6,7);
        Assert.assertTrue(rightSkewedBST.isValidBinarySearchTree());
    }

    @Test
    public void isValidBinarySearchTreeWithNonEmptySkewedBinaryTreeReturnsFalse(){
        CheckBinaryTreeIsABinarySearchTree leftSkewedBST = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getLeftSkewedBinaryTreeWithValues(leftSkewedBST, 7,3,9,6,4,52,8);
        Assert.assertFalse(leftSkewedBST.isValidBinarySearchTree());

        CheckBinaryTreeIsABinarySearchTree rightSkewedBST = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getLeftSkewedBinaryTreeWithValues(rightSkewedBST, 2,3,4,5,6,7,1);
        Assert.assertFalse(rightSkewedBST.isValidBinarySearchTree());
    }

    @Test
    public void isValidBinarySearchTreeWithNonEmptyBinarySearchTreeWithSingleNodeReturnsTrue(){
        CheckBinaryTreeIsABinarySearchTree binaryTree = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binaryTree, 5);
        Assert.assertTrue(binaryTree.isValidBinarySearchTree());
    }

    @Test
    public void isValidBinarySearchTreeWithNonEmptyBinaryTreeReturnsFalse(){
        CheckBinaryTreeIsABinarySearchTree binaryTree = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binaryTree, 5,8,1,14,81,87,21,0,78);
        Assert.assertFalse(binaryTree.isValidBinarySearchTree());

        CheckBinaryTreeIsABinarySearchTree binaryTreeWithRootEqualsToLeftChild = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binaryTreeWithRootEqualsToLeftChild, 2,2,1);
        Assert.assertFalse(binaryTreeWithRootEqualsToLeftChild.isValidBinarySearchTree());
    }


    @Test
    public void isValidBinarySearchTreeWithNonEmptyBinarySearchTreeReturnsTrue(){
        CheckBinaryTreeIsABinarySearchTree binarySearchTree = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binarySearchTree, 5,3,7,2,4,6,8,1);
        Assert.assertTrue(binarySearchTree.isValidBinarySearchTree());

        CheckBinaryTreeIsABinarySearchTree binarySearchTreeWithRootEqualsToRight = new CheckBinaryTreeIsABinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binarySearchTreeWithRootEqualsToRight, 2,1,2);
        Assert.assertTrue(binarySearchTreeWithRootEqualsToRight.isValidBinarySearchTree());
    }

}