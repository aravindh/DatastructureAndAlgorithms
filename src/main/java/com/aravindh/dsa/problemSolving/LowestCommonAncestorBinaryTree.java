package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

/*
* Given a binary tree (not a binary search tree) and two values say n1 and n2,
* write a program to find the least common ancestor.
*
* Note:
* 1. Assume that both nodes n1 and n2 exists in Tree T.
* 2. The common ancestor can even be the node n1 or n2 itself. ie. The node itself is also counted as ancestor.
* */
public class LowestCommonAncestorBinaryTree extends BinaryTree {

    private Integer lca(BinaryTreeNode node, final int n1, final int n2){
        if(node == null){
            return null;
        }
        if(node.data == n1 || node.data == n2){
            return node.data;
        }
        Integer left_LCA = lca(node.left, n1, n2);
        Integer right_LCA = lca(node.right, n1, n2);
        if(left_LCA != null && right_LCA != null){
            return node.data;
        }
        if(left_LCA != null){
            return left_LCA;
        }
        if(right_LCA != null){
            return right_LCA;
        }
        return null;
    }

    public Integer lca(int n1, int n2){
        return lca(root, n1, n2);
    }



}
