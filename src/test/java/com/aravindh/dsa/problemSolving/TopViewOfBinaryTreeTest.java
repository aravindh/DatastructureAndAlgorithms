package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 9/11/17.
 */
@RunWith(value = JUnit4.class)
public class TopViewOfBinaryTreeTest {

    @Test
    public void topViewWithEmptyTreeReturnsEmptyString(){
        TopViewOfBinaryTree tree = new TopViewOfBinaryTree();
        Assert.assertEquals("", tree.topView());
    }

    @Test
    public void topViewWithNonEmptyLeftSkewedTreeReturnsLeftBoundaryString(){
        TopViewOfBinaryTree tree = new TopViewOfBinaryTree();
        tree.root = getSkewedBinaryTree();
        Assert.assertEquals("1,2,3,4,5,6,", tree.topView());
    }

    private BinaryTreeNode getSkewedBinaryTree() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode c1 = new BinaryTreeNode(2);
        BinaryTreeNode c2 = new BinaryTreeNode(3);
        BinaryTreeNode c3 = new BinaryTreeNode(4);
        BinaryTreeNode c4 = new BinaryTreeNode(5);
        BinaryTreeNode c5 = new BinaryTreeNode(6);

        root.left = c1;
        c1.left = c2;
        c2.left = c3;
        c3.left = c4;
        c4.left = c5;
        return root;
    }

    @Test
    public void topViewWithNonEmptyWithChildHavingLeftSkewedTreeReturnsTopViewString(){
        TopViewOfBinaryTree tree = new TopViewOfBinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(11);
        BinaryTreeNode c1 = new BinaryTreeNode(12);
        BinaryTreeNode c2 = new BinaryTreeNode(13);
        BinaryTreeNode c3 = new BinaryTreeNode(14);

        root.left = c1;
        root.right = c2;
        c1.right = c3;

        c3.left = getSkewedBinaryTree();
        tree.root = root;

        Assert.assertEquals("11,12,13,2,3,4,5,6,", tree.topView());
    }

    @Test
    public void topViewWithNonEmptyWithChildHavingRightSkewedTreeReturnsTopViewString(){
        TopViewOfBinaryTree tree = new TopViewOfBinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(11);
        BinaryTreeNode c1 = new BinaryTreeNode(12);
        BinaryTreeNode c2 = new BinaryTreeNode(13);
        BinaryTreeNode c3 = new BinaryTreeNode(14);

        root.left = c1;
        root.right = c2;
        c1.right = c3;

        c3.right = getSkewedBinaryTree();
        tree.root = root;

        Assert.assertEquals("11,12,13,4,5,6,", tree.topView());
    }

    @Test
    public void topViewWithNonEmptyNearlyCompleteTreeReturnsTopViewString(){
        TopViewOfBinaryTree tree = new TopViewOfBinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode c1 = new BinaryTreeNode(2);
        BinaryTreeNode c2 = new BinaryTreeNode(3);
        BinaryTreeNode c3 = new BinaryTreeNode(4);
        BinaryTreeNode c4 = new BinaryTreeNode(5);
        BinaryTreeNode c5 = new BinaryTreeNode(6);
        BinaryTreeNode c6 = new BinaryTreeNode(7);

        root.left = c1;
        root.right = c2;

        c1.left = c3;
        c1.right = c4;

        c2.left = c5;
        c2.right = c6;

        tree.root = root;
        Assert.assertEquals("1,2,3,4,7,", tree.topView());
    }
}