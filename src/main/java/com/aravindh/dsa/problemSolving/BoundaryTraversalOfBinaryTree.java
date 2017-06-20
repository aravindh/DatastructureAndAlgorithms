package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by aravindhravindran on 20/6/17.
 */
public class BoundaryTraversalOfBinaryTree extends BinaryTree {
    public String boundaryTraversal(){
        return boundaryTraversal(root).toString();
    }

    private StringBuilder boundaryTraversal(BinaryTreeNode root){
        if(root == null){
            return new StringBuilder();
        }
        StringBuilder builder = new StringBuilder();
        //left boundary
        populateLeftBoundary(root, builder);
        //leaf nodes
        populateLeaves(root, builder);
        //right boundary
        populateRightBoundary(root, builder);
        return builder;
    }

    private void populateLeftBoundary(BinaryTreeNode root, StringBuilder builder){
        BinaryTreeNode current = root;
        while(current.left != null){
            builder.append(current.data+",");
            current = current.left;
        }
    }

    private void populateLeaves(BinaryTreeNode root, StringBuilder builder){
        Queue<BinaryTreeNode> nodes = new LinkedList<BinaryTreeNode>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            BinaryTreeNode current = nodes.remove();
            //leaf node
            if(current.left == null && current.right == null){
                builder.append(current.data+",");
            }else{
                if(current.left != null){
                    nodes.add(current.left);
                }
                if(current.right != null){
                    nodes.add(current.right);
                }
            }
        }
    }

    private void populateRightBoundary(BinaryTreeNode root, StringBuilder builder){
        BinaryTreeNode  current = root.right;
        Stack<BinaryTreeNode> rightNodes = new Stack<BinaryTreeNode>();
        while(current.right != null){
            rightNodes.push(current);
            current = current.right;
        }

        while(!rightNodes.isEmpty()){
            builder.append(rightNodes.pop().data+",");
        }
    }
}
