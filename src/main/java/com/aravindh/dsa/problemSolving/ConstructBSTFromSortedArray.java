package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinarySearchTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

import java.util.List;

public class ConstructBSTFromSortedArray extends BinarySearchTree {
    public void construct(List<Integer> numbers){
        this.root = constructRecursively(numbers, 0, numbers.size()-1);
    }

    private BinaryTreeNode constructRecursively(List<Integer> numbers, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        BinaryTreeNode node = new BinaryTreeNode(numbers.get(mid));
        node.left = constructRecursively(numbers, start, mid-1);
        node.right = constructRecursively(numbers, mid+1, end);
        return node;
    }
}
