package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class LowestCommonAncestorBinarySearchTreeTest {

    @Test
    public void lcaOnNonEmptyTreeReturnLCA(){
        LowestCommonAncestorBinarySearchTree tree = new LowestCommonAncestorBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, 20, 22, 8, 4, 12, 10, 14);
        Assert.assertEquals(Integer.valueOf(12), tree.lca(10,14));
        Assert.assertEquals(Integer.valueOf(8), tree.lca(14,8));
        Assert.assertEquals(Integer.valueOf(8), tree.lca(8,14));
        Assert.assertEquals(Integer.valueOf(20), tree.lca(10,22));
        Assert.assertEquals(Integer.valueOf(8), tree.lca(10,4));
    }
}