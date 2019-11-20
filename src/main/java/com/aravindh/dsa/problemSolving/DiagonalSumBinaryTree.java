package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

import java.util.*;

public class DiagonalSumBinaryTree extends BinaryTree {

    private HashMap<Integer, Integer> diagonalVsSum = new HashMap<>();

    public Map<Integer, Integer> getDiagonalSum(boolean isIterative){
        if(isIterative){
            return getDiagonalSumIterative();
        }else {
            getDiagonalSumRecursive(this.root, 0);
            return diagonalVsSum;
        }
    }

    private void getDiagonalSumRecursive(BinaryTreeNode root, int currentDiagonal){
        if(root == null){
            return;
        }
        if(!diagonalVsSum.containsKey(currentDiagonal)){
            diagonalVsSum.put(currentDiagonal, 0);
        }
        diagonalVsSum.put(currentDiagonal, diagonalVsSum.get(currentDiagonal)+root.data);
        getDiagonalSumRecursive(root.left, currentDiagonal+1);
        getDiagonalSumRecursive(root.right, currentDiagonal);
    }

    private Map<Integer, Integer> getDiagonalSumIterative(){
        if(null == root || isEmpty()){
            return Collections.emptyMap();
        }

        Map<Integer, Integer> diagonalVsSum = new HashMap<>();
        Queue<BinaryTreeNode> pendingNodes = new LinkedList<BinaryTreeNode>();
        Queue<Integer> diagonalDistance = new LinkedList<Integer>();
        pendingNodes.add(root);
        diagonalDistance.add(0);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode currNode = pendingNodes.remove();
            Integer currNodeDiagonalDistance = diagonalDistance.remove();
            while(currNode != null) {

                if(!diagonalVsSum.containsKey(currNodeDiagonalDistance)){
                    diagonalVsSum.put(currNodeDiagonalDistance, 0);
                }
                diagonalVsSum.put(currNodeDiagonalDistance, diagonalVsSum.get(currNodeDiagonalDistance)+root.data);
                if (currNode.left != null) {
                    pendingNodes.add(currNode.left);
                    diagonalDistance.add(currNodeDiagonalDistance + 1);
                }
                currNode = currNode.right;
            }
        }
        return diagonalVsSum;
    }
}
