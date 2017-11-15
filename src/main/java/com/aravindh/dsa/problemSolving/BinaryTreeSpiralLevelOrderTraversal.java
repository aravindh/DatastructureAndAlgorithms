package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

import java.util.Stack;

/**
 * Created by aravindhravindran on 14/11/17.
 *
 * Note :Based on level the nodes are pushed as left, right or right, left
 * because when the traversal comes a level down it first left first and then right,
 * else below is how it will print
 * 1,3,2,4,5,6,7,15,14,13,12,11,10,9,8
 * 1,3,2,5,4,7,6,13,12,15,14,9,8,11,10
 */
public class BinaryTreeSpiralLevelOrderTraversal extends BinaryTree{

    public String spiralTraversal(){
        if(isEmpty()){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        String COMMA = ",";
        Stack<BinaryTreeNode> oddLevelNodes = new Stack<BinaryTreeNode>();
        Stack<BinaryTreeNode> evenLevelNodes = new Stack<BinaryTreeNode>();

        oddLevelNodes.push(root);

        while(!oddLevelNodes.empty() || !evenLevelNodes.empty()){
            while(!oddLevelNodes.isEmpty()){
                BinaryTreeNode current = oddLevelNodes.pop();
                builder.append(current.data).append(COMMA);
                if(current.left != null) {
                    evenLevelNodes.push(current.left);
                }
                if(current.right != null) {
                    evenLevelNodes.push(current.right);
                }
            }

            while(!evenLevelNodes.isEmpty()){
                BinaryTreeNode current = evenLevelNodes.pop();
                builder.append(current.data).append(COMMA);
                if(current.right != null){
                    oddLevelNodes.push(current.right);
                }
                if(current.left != null){
                    oddLevelNodes.push(current.left);
                }

            }
        }
        return builder.toString();
    }
}
