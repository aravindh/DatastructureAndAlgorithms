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
public class ConvertBinaryTreeToSumTreeTest {

    @Test
    public void convertOnEmptyBinaryTreeNoModificationOnTree(){
        ConvertBinaryTreeToSumTree tree = new ConvertBinaryTreeToSumTree();
        tree.convert();
    }

    @Test
    public void convertOnNonEmptyBinaryTreeModifiesTree(){
        ConvertBinaryTreeToSumTree tree = new ConvertBinaryTreeToSumTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, 10,-2,6,8,-4,7,5);
        tree.convert();
        Assert.assertEquals("0,4,0,20,0,12,0,",tree.inOrder(false));
    }
}