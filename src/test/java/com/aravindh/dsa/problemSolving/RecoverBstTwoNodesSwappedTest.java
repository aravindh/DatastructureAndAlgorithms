package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import com.aravindh.dsa.nonlinear.BinarySearchTree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 16/11/17.
 */
@RunWith(value = JUnit4.class)
public class RecoverBstTwoNodesSwappedTest {

    private RecoverBstTwoNodesSwapped getBst(){
        RecoverBstTwoNodesSwapped tree = new RecoverBstTwoNodesSwapped();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, 10,5,15,4,7,14,17);
        return tree;
    }

    @Test
    public void recoverWithEmptyBstNoModification(){
        RecoverBstTwoNodesSwapped tree = new RecoverBstTwoNodesSwapped();
        tree.recover();
        Assert.assertEquals("", tree.inOrder(false));
    }

    @Test
    public void recoverWithTwoLeavesSwappedRecoversBST(){
        RecoverBstTwoNodesSwapped tree = getBst();
        tree.recover();
        Assert.assertEquals("4,5,7,10,14,15,17,", tree.inOrder(false));
    }


    @Test
    public void recoverWithRootNodeSwappedRecoversBST(){
        RecoverBstTwoNodesSwapped tree = getBst();
        tree.recover();
        Assert.assertEquals("4,5,7,10,14,15,17,", tree.inOrder(false));
    }

    @Test
    public void recoverWithParentAndChildSwappedRecoversBST(){
        RecoverBstTwoNodesSwapped tree = getBst();
        tree.recover();
        Assert.assertEquals("4,5,7,10,14,15,17,", tree.inOrder(false));
    }

    private void swap(BinarySearchTree tree, int src, int target){

    }




}