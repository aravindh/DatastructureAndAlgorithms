package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 20/6/17.
 */
@RunWith(value = JUnit4.class)
public class BoundaryTraversalOfBinaryTreeTest {

    @Test
    public void boundaryTraversalOnNonEmptyTreeReturnsBoundaryTraversal(){
        BoundaryTraversalOfBinaryTree tree = new BoundaryTraversalOfBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        Assert.assertEquals("1,2,4,8,9,10,11,12,13,14,15,7,3,", tree.boundaryTraversal());
    }

    @Test
    public void boundaryTraversalOnEmptyTreeReturnsEmptyString(){
        BoundaryTraversalOfBinaryTree tree = new BoundaryTraversalOfBinaryTree();
        Assert.assertEquals("", tree.boundaryTraversal());
    }


}