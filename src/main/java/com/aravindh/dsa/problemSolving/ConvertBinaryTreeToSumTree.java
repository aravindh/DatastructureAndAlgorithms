package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

/**
 * Convert the given BinaryTree to Sum Tree such that value of ParentNode  = Sum(leftChildData + rightChildData) i.e. child's original value
 * In case of the leaf nodes, it will be zero
 *
 * Node value  = newVal = left + right / 0 for leaf
 * returnValue = newVal + oldVal
 *
 * Approach: Like DepthFirst Traversal like preOrder or inorder, with modification to return sumValue.
 *
 * Created by aravindhravindran on 19/6/17.
 */
public class ConvertBinaryTreeToSumTree extends BinaryTree {

    public void convert(){
        if(root == null){
            return;
        }else{
            convertToSumTree(root);
        }
    }

    private int convertToSumTree(BinaryTreeNode root){
        if(root == null){
            return 0;
        }else{
            int oldVal = root.data;
            int newVal = convertToSumTree(root.left) + convertToSumTree(root.right);
            root.data = newVal;
            return (oldVal+newVal);
        }
    }
}
