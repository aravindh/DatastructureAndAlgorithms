package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinarySearchTree;
import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

/**
 * node
 * recursive cvt(left)
 *
 * swap left and right
 * Created by aravindhravindran on 16/6/17.
 */
public class ConvertTreeToMirrorTree extends BinaryTree {
    public void convert(){
        convert(root);
    }

    private void convert(BinaryTreeNode node){
        if(node == null){
            return;
        }else{
            convert(node.left);
            convert(node.right);
            swapChilds(node);
        }
    }

    private void swapChilds(BinaryTreeNode node){
        BinaryTreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
