package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(value = JUnit4.class)
public class ConvertBinaryTreeToBinarySearchTreeTest {


    @Test
    public void convertWithEmptyBinaryTreeReturnsTreeUnModified(){
        ConvertBinaryTreeToBinarySearchTree tree = new ConvertBinaryTreeToBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree);
        String inOrderBT = tree.inOrder(true);
        tree.convert();
        Assert.assertEquals(inOrderBT, tree.inOrder(true));
    }

    @Test
    public void convertWithNonEmptySkewedBTModifiesToBST(){
        ConvertBinaryTreeToBinarySearchTree leftSkewedBinaryTree = new ConvertBinaryTreeToBinarySearchTree();
        BinaryTreeCreationHelper.getLeftSkewedBinaryTreeWithValues(leftSkewedBinaryTree, 1,2,3,4,5,6);
        leftSkewedBinaryTree.convert();
        Assert.assertEquals("1,2,3,4,5,6,", leftSkewedBinaryTree.inOrder(true));

        ConvertBinaryTreeToBinarySearchTree rightSkewedBinaryTree = new ConvertBinaryTreeToBinarySearchTree();
        BinaryTreeCreationHelper.getRightSkewedBinaryTreeWithValues(rightSkewedBinaryTree, 1,2,3,4,5,6);
        rightSkewedBinaryTree.convert();
        Assert.assertEquals("1,2,3,4,5,6,", rightSkewedBinaryTree.inOrder(true));
    }

    @Test
    public void convertWithNonEmptyBSTUnModifiesTree(){
        ConvertBinaryTreeToBinarySearchTree binarySearchTree = new ConvertBinaryTreeToBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binarySearchTree, 5);
        BinaryTreeNode leftSubTree = new BinaryTreeNode(3);
        leftSubTree.left = new BinaryTreeNode(2);
        leftSubTree.right = new BinaryTreeNode(4);
        binarySearchTree.root.left = leftSubTree;

        BinaryTreeNode rightSubTree = new BinaryTreeNode(7);
        rightSubTree.left = new BinaryTreeNode(6);
        rightSubTree.right = new BinaryTreeNode(8);
        binarySearchTree.root.right = rightSubTree;

        binarySearchTree.convert();
        Assert.assertEquals("2,3,4,5,6,7,8,", binarySearchTree.inOrder(true));

        ConvertBinaryTreeToBinarySearchTree binarySearchTreeWithSingleNode = new ConvertBinaryTreeToBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binarySearchTreeWithSingleNode, 5);
        binarySearchTreeWithSingleNode.convert();
        Assert.assertEquals("5,", binarySearchTreeWithSingleNode.inOrder(true));

    }

    @Test
    public void convertWithNonEmptyBTModifiesToBST(){
        ConvertBinaryTreeToBinarySearchTree binaryTree = new ConvertBinaryTreeToBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(binaryTree, 1,2,3,4,5,6);
        binaryTree.convert();
        Assert.assertEquals("1,2,3,4,5,6,", binaryTree.inOrder(true));
    }
}