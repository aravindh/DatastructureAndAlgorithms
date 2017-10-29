package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinarySearchTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

public class LowestCommonAncestorBinarySearchTree extends BinarySearchTree{
    public Integer lca(int n1, int n2){
        return lca(root, n1, n2);
    }

    private Integer lca(BinaryTreeNode node, int n1, int n2){
        if(node == null){
            return null;
        }
        if(n1 < node.data  && n2 < node.data){
            return lca(node.left, n1, n2);
        }
        if(n1 > node.data && n2 >  node.data){
            return lca(node.right, n1, n2);
        }
        return node.data;
    }
}
