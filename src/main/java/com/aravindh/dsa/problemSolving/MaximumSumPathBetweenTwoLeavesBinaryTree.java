package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

import java.util.Collections;

public class MaximumSumPathBetweenTwoLeavesBinaryTree extends BinaryTree {

    public int maxSumBetweenLeaves(){
        return maxSumBetweenLeavesRecursive(root);
    }

    private int maxSumBetweenLeavesRecursive(BinaryTreeNode root){
        if(root == null){
            return 0;
        }
        int lsum = maxSumBetweenLeavesRecursive(root.left);
        int rsum = maxSumBetweenLeavesRecursive(root.right);
        return 0;
    }
}
