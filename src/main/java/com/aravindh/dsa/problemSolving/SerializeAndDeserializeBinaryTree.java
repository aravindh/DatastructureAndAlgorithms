package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeserializeBinaryTree extends BinaryTree {

    private static Integer EMPTY_MARKER = Integer.valueOf(-1);
    private Integer currentIndex = 0;

    public List<Integer> serializeTree(){
        List<Integer> serializedTree = new ArrayList<>();
        preOrderSerialization(this.root, serializedTree);
        return serializedTree;
    }

    private void preOrderSerialization(BinaryTreeNode root, List<Integer> serializedTree){
        if(root == null){
            serializedTree.add(-1);
            return;
        }
        serializedTree.add(root.data);
        preOrderSerialization(root.left, serializedTree);
        preOrderSerialization(root.right, serializedTree);
    }

    public void deSerializeTree(List<Integer> values){
        this.root = deSerializeRecursive(values);
    }

    private BinaryTreeNode deSerializeRecursive(List<Integer> values){
        if(currentIndex >= values.size()){
            return null;
        }

        Integer currVal = values.get(currentIndex++);
        if(EMPTY_MARKER.equals(currVal)){
            return null;
        }
        BinaryTreeNode currNode = new BinaryTreeNode(currVal);
        currNode.left = deSerializeRecursive(values);
        currNode.right = deSerializeRecursive(values);
        return currNode;
    }

}
