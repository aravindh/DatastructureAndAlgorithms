package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

public class MinimumDepthBinaryTree extends BinaryTree {
    public int getMinimumDepth(){
        if(isEmpty()){
            return 0;
        }
        return getMin(root);
    }

    private int getMin(BinaryTreeNode root){
        if(root.left == null && root.right == null){
            return 1;
        }
        int leftMin = (root.left != null) ? getMin(root.left) : Integer.MAX_VALUE;
        int rightMin = (root.right != null) ? getMin(root.right) : Integer.MAX_VALUE;
        if(leftMin < rightMin){
            return leftMin+1;
        }else{
            return rightMin+1;
        }
    }
}
