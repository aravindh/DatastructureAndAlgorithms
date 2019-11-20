package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinarySearchTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeserializeBinarySearchTree extends BinarySearchTree {

    private Integer currentIndex = 0;

    public List<Integer> serializeTree(){
        List<Integer> serializedTree = new ArrayList<>(this.size());
        preOrderSerialization(this.root, serializedTree);
        return serializedTree;
    }

    private void preOrderSerialization(BinaryTreeNode root, List<Integer> serializedTree){
        if(root == null){
            return;
        }
        serializedTree.add(root.data);
        preOrderSerialization(root.left, serializedTree);
        preOrderSerialization(root.right, serializedTree);
    }

    public void deSerializeTree(List<Integer> values){
        this.root = deSerializeRecursive(values, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private BinaryTreeNode deSerializeRecursive(List<Integer> values, Integer min, Integer max){
        if(currentIndex >= values.size()){
            return null;
        }

        if(!isInRange(values.get(currentIndex), min, max)){
            return null;
        }
        Integer currVal = values.get(currentIndex++);
        BinaryTreeNode currNode = new BinaryTreeNode(currVal);
        currNode.left = deSerializeRecursive(values, min, currVal-1);
        currNode.right = deSerializeRecursive(values, currVal, max);
        return currNode;
    }

    private boolean isInRange(Integer currVal, Integer min, Integer max) {
        if(currVal >= min && currVal <= max){
            return true;
        }
        return false;
    }
}
