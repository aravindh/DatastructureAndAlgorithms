package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import com.aravindh.dsa.nonlinear.BinaryTree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(value = JUnit4.class)
public class RootToLeafPathSumTest {

    @Test
    public void rootToLeafPathWithValidSumReturnsTrue(){
        RootToLeafPathSum tree = new RootToLeafPathSum();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, 1,2,3,4,5,6,7,8,9);
        Assert.assertTrue(tree.rootToLeafPath(10));
    }

    @Test
    public void rootToLeafPathWithInValidSumReturnsFalse(){
        RootToLeafPathSum tree = new RootToLeafPathSum();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, 1,2,3,4,5,6,7,8,9);
        Assert.assertFalse(tree.rootToLeafPath(25));
    }

    @Test
    public void rootToLeafPathOnEmptyTreeWithTargetSumZeroSumReturnsTrue(){
        RootToLeafPathSum tree = new RootToLeafPathSum();
        Assert.assertTrue(tree.rootToLeafPath(0));
    }
}