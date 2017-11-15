package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 14/11/17.
 */
@RunWith(value = JUnit4.class)
public class BinaryTreeSpiralLevelOrderTraversalTest {

    @Test
    public void spiralTraversalWithEmptyTreeReturnsEmptyString(){
        BinaryTreeSpiralLevelOrderTraversal tree = new BinaryTreeSpiralLevelOrderTraversal();
        Assert.assertEquals("",tree.spiralTraversal());
    }

    @Test
    public void spiralTraversalWithNonEmptyCompleteTreeReturnsSpriralTraversalString(){
        BinaryTreeSpiralLevelOrderTraversal tree = new BinaryTreeSpiralLevelOrderTraversal();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        Assert.assertEquals("1,3,2,4,5,6,7,15,14,13,12,11,10,9,8,",tree.spiralTraversal());
    }
}