package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import com.aravindh.dsa.nonlinear.BinarySearchTree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 16/6/17.
 */
@RunWith(value= JUnit4.class)
public class RootToLeafPathBSTTest {

    @Test
    public void rootToLeafPathWithNonEmptyTreeReturnsAllPaths(){
        RootToLeafPathBST rootToLeafPathBST = new RootToLeafPathBST();
        BinaryTreeCreationHelper.getBSTWithValues(rootToLeafPathBST, 5,3,7,2,1,6,8,4);
        Assert.assertEquals("5,3,2,1,\n" +
                "5,3,4,\n" +
                "5,7,6,\n" +
                "5,7,8,\n", rootToLeafPathBST.rootToLeafPath());
    }

    @Test
    public void rootToLeafPathWithNonEmptySkewedTreeReturnsAllPaths(){
        RootToLeafPathBST rootToLeafPathBST = new RootToLeafPathBST();
        BinaryTreeCreationHelper.getBSTWithValues(rootToLeafPathBST, 5,4,3,2,1);
        Assert.assertEquals("5,4,3,2,1,\n", rootToLeafPathBST.rootToLeafPath());
    }

    @Test
    public void rootToLeafPathWithEmptyTreeReturnsEmptyString(){
        RootToLeafPathBST rootToLeafPathBST = new RootToLeafPathBST();
        Assert.assertEquals("", rootToLeafPathBST.rootToLeafPath());
    }


}