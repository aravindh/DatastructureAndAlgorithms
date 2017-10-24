package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value= JUnit4.class)
public class LowestCommonAncestorBinaryTreeTest {

    @Test
    public void lcaOfNonEmptyBTWithValidNodesReturnAncestor(){
        LowestCommonAncestorBinaryTree tree= new LowestCommonAncestorBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, 1,2,3,4,5,6,7,8);
        Assert.assertEquals(Integer.valueOf(1), tree.lca(1,2));
        Assert.assertEquals(Integer.valueOf(1), tree.lca(2,1));
        Assert.assertEquals(Integer.valueOf(1), tree.lca(2,3));
        Assert.assertEquals(Integer.valueOf(2), tree.lca(4,2));
        Assert.assertEquals(Integer.valueOf(1), tree.lca(4,6));
        Assert.assertEquals(Integer.valueOf(1), tree.lca(4,3));
        Assert.assertEquals(Integer.valueOf(1), tree.lca(5,6));
        Assert.assertEquals(Integer.valueOf(2), tree.lca(2,8));
        Assert.assertEquals(Integer.valueOf(2), tree.lca(8,2));
    }
}