package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

public class RootToLeafPathSum extends BinaryTree {
    public boolean rootToLeafPath(int targetSum){
        return rootToLeafSumPathRecursive(root, targetSum, 0);
    }

    private boolean rootToLeafSumPathRecursive(BinaryTreeNode root, int targetSum, int currSum){
        if(root == null){
            if(currSum == targetSum){
                return true;
            }else{
                return false;
            }
        }
        currSum += root.data;

        if(currSum > targetSum){
            return false;
        }
        return (rootToLeafSumPathRecursive(root.left, targetSum, currSum) || rootToLeafSumPathRecursive(root.right, targetSum, currSum));
    }
}