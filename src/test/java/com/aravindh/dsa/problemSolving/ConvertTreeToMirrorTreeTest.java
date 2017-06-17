package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import com.aravindh.dsa.nonlinear.BinarySearchTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 16/6/17.
 */
@RunWith(value = JUnit4.class)
public class ConvertTreeToMirrorTreeTest {

    @Test
    public void convertWithNonEmptyTreeModifiesTreeAsMirrorTree(){
        ConvertTreeToMirrorTree tree = new ConvertTreeToMirrorTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, 1,2,3,4,5,6,7,8);
        tree.convert();
        Assert.assertEquals("7,3,6,1,5,2,4,8,", tree.inOrder(true));
    }

    @Test
    public void convertWithEmptyTreeNoModificationOnTree(){
        ConvertTreeToMirrorTree tree = new ConvertTreeToMirrorTree();
        tree.convert();
        Assert.assertEquals("", tree.inOrder(true));
    }
}