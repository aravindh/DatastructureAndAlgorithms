package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinarySearchTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

public class RecoverBstTwoNodesSwapped extends BinarySearchTree{
    private BinaryTreeNode swappedNode1 = null;
    private BinaryTreeNode swappedNode2 = null;

    public void recover(){
        if(isEmpty()){
            return;
        }
        identifySwappedNodes(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        //swap nodes and their children
        
    }

    private void identifySwappedNodes(BinaryTreeNode root, Integer minValue, int maxValue) {
        if(root == null){
            return;
        }
        int[] nums = null;
        if(swappedNode1 != null && swappedNode2 != null){
            return;
        }
        if(!isBetween(root.data, minValue, maxValue)){
            if(swappedNode1 == null){
                swappedNode1 = root;
            }
            else if(swappedNode2 == null){
                swappedNode2 = root;
            }
        }
        identifySwappedNodes(root.left, minValue, root.data);
        identifySwappedNodes(root.right, root.data, maxValue);
    }

    private boolean isBetween(Integer data, Integer minValue, int maxValue) {
        return false;
    }
}
