package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

public class CheckBinaryTreeIsABinarySearchTree extends BinaryTree {

    public boolean isValidBinarySearchTree(){
        return isValidBinarySearchTreeRecursive(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBinarySearchTreeRecursive(BinaryTreeNode root, Integer min, Integer max){
        if(root == null){
            return true;
        }

        if(!isBetween(root.data, min, max)){
            return false;
        }else{
            return isValidBinarySearchTreeRecursive(root.left, min, root.data) &&
                    isValidBinarySearchTreeRecursive(root.right, root.data, max);
        }
    }

    private boolean isBetween(Integer data, Integer min, Integer max) {
        if(data >= min && data < max){
            return true;
        }
        return false;
    }


}
