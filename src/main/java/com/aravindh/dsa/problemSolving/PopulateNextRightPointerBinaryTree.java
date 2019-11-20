package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

public class PopulateNextRightPointerBinaryTree extends BinaryTree {

    class ExtendedBinaryTreeNode extends BinaryTreeNode {

        ExtendedBinaryTreeNode nextRightpointer;

        public ExtendedBinaryTreeNode(Integer data) {
            super(data);
        }
    }

    @Override
    public BinaryTreeNode getNewNode(int data){
        return new ExtendedBinaryTreeNode(data);
    }

    public void populateNextRightPointer(){

    }

    private void populateNextRightPointerRecursive(ExtendedBinaryTreeNode root){
        if(root == null){
            return;
        }
        
    }
}
