package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * C
 * Created by aravindhravindran on 20/6/17.
 */
public class BinaryTreeToDoublyLinkedList extends BinaryTree {

    public void convertToDoubleTree(boolean isIterative){
        if(isIterative){
            doubleTreeIterative();
        }else{
            BinaryTreeNode head = new BinaryTreeNode(null);
            BinaryTreeNode tail = head;
            doubleTreeRecursive(root, tail);
            root = head;
        }

    }

    private void populateStack(Stack<BinaryTreeNode> stack, BinaryTreeNode current){
        while(current != null){
            stack.push(current);
            current = current.left;
        }
    }

    private void doubleTreeIterative(){
        if(root == null){
            return;
        }else{
            Stack<BinaryTreeNode> nodes = new Stack<BinaryTreeNode>();
            populateStack(nodes, root);
            BinaryTreeNode head = new BinaryTreeNode(null);
            BinaryTreeNode tail = head;

            while(!nodes.isEmpty()){
                BinaryTreeNode current = nodes.pop();
                populateStack(nodes, current.right);
                tail.right = current;
                current.left = tail;
                tail = current;
            }
            root = head;
        }
    }


    private BinaryTreeNode doubleTreeRecursive(BinaryTreeNode curr, BinaryTreeNode listTail){
        if(curr == null){
            return listTail;
        }
        listTail = doubleTreeRecursive(curr.left, listTail);
        listTail.right = curr;
        curr.left = listTail;
        listTail = curr;
        listTail = doubleTreeRecursive(curr.right, listTail);
        return listTail;
    }

    public String printListForward(){
        StringBuilder builder = new StringBuilder();
        if(root == null){
            return builder.toString();
        }
        BinaryTreeNode curr = root;
        while(curr != null){
            builder.append(curr.data).append(",");
            curr = curr.right;
        }
        return builder.toString();
    }

    public String printListReverse(){
        StringBuilder builder = new StringBuilder();
        if(root == null){
            return builder.toString();
        }
        BinaryTreeNode curr = root;
        while(curr.right != null){
            curr = curr.right;
        }

        while(curr != null){
            builder.append(curr.data).append(",");
            curr = curr.left;
        }
        return builder.toString();
    }
}
