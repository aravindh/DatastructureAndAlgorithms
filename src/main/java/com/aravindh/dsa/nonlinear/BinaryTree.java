package com.aravindh.dsa.nonlinear;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by aravindhravindran on 17/6/17.
 */
public class BinaryTree {
    protected BinaryTreeNode root;

    public void insert(int data){
        if(root == null){
            root = new BinaryTreeNode(data);
        }else{
            Queue<BinaryTreeNode> nodes = new LinkedList<BinaryTreeNode>();
            nodes.add(root);
            while(!nodes.isEmpty()){
                BinaryTreeNode curr = nodes.remove();
                if(curr.left == null){
                    curr.left = new BinaryTreeNode(data);
                    break;
                }else if(curr.right == null){
                    curr.right = new BinaryTreeNode(data);
                    break;
                }else{
                    nodes.add(curr.left);
                    nodes.add(curr.right);
                }
            }
        }

    }

    public boolean isEmpty(){
        if(root == null){
            return true;
        }else{
            return false;
        }
    }

    public int height(boolean isIterative){
        if(isIterative){
            return heightRecursive(root);
        }else{
            return heightRecursive(root);
        }
    }

    private int heightRecursive(BinaryTreeNode root){
        if(root == null){
            return 0;
        }else{
            int leftSubtreeHeight = heightRecursive(root.left);
            int rightSubtreeHeight = heightRecursive(root.right);
            return Math.max(leftSubtreeHeight, rightSubtreeHeight)+1;
        }
    }

    public String inOrder(boolean isIterative){
        if(isIterative){
            //return inOrderIterative().toString();
            return morrisInorderTraversal().toString();
        }else{
            StringBuilder builder = new StringBuilder();
            inOrderRecursive(root, builder);
            return builder.toString();
        }
    }

    private StringBuilder inOrderRecursive(BinaryTreeNode root, StringBuilder builder){
        if(root == null){
            return builder;
        }else{
            inOrderRecursive(root.left, builder);
            builder.append(root.data);
            builder.append(",");
            inOrderRecursive(root.right, builder);
        }
        return builder;
    }

    private StringBuilder inOrderIterative(){
        //Approach 1:
        //With extra space for using stack
        StringBuilder builder = new StringBuilder();
        if(isEmpty()){
            return builder;
        }
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        BinaryTreeNode current = root;
        //Left first, so push them to stack
        while(current != null){
            stack.push(current);
            current = current.left;
        }

        while(!stack.isEmpty()){
            BinaryTreeNode node = stack.pop();
            //Print the top element ie. root
            builder.append(node.data);
            builder.append(",");
            //Left first for the right subtree
            current = node.right;
            while(current != null){
                stack.push(current);
                current = current.left;
            }
        }
        return builder;

    }

    private StringBuilder morrisInorderTraversal(){
        //Approach 2:
        //Without using recursion and extra space
        //#Morris Traversal
        StringBuilder builder = new StringBuilder();
        BinaryTreeNode current = root;
        while(current != null){
            if(current.left == null){
                builder.append(current.data+",");
                current = current.right;

            }else{
                BinaryTreeNode predecessor = current.left;
                while(predecessor.right != null && current != predecessor.right) {
                    predecessor = predecessor.right;
                }
                if(predecessor.right == null){
                    predecessor.right = current;
                    current = current.left;
                }else{
                    predecessor.right = null;
                    builder.append(current.data+",");
                    current = current.right;
                }
            }
        }
        return builder;
    }

    private StringBuilder preOrderRecursive(BinaryTreeNode root, StringBuilder builder){
        if(root == null){
            return builder;
        }else{
            //root
            builder.append(root.data+",");
            //left
            preOrderRecursive(root.left, builder);
            //right
            preOrderRecursive(root.right, builder);
        }
        return builder;
    }

    public String breadthFirstTraversal(){
        return bfsIterative().toString();
    }

    private StringBuilder bfsIterative(){
        if(root == null){
            return new StringBuilder();
        }
        Queue<BinaryTreeNode> nodes = new LinkedList<BinaryTreeNode>();
        nodes.add(root);
        StringBuilder builder = new StringBuilder();
        while(!nodes.isEmpty()){
            BinaryTreeNode current = nodes.remove();
            builder.append(current.data+",");
            if(current.left != null){
                nodes.add(current.left);
            }
            if(current.right != null){
                nodes.add(current.right);
            }
        }
        return builder;
    }

    private StringBuilder preOrderIterative(){
        StringBuilder builder = new StringBuilder();
        if(isEmpty()){
            return new StringBuilder();
        }else{
            BinaryTreeNode current = root;
            Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
            stack.push(current);
            while(!stack.isEmpty()){
                current = stack.pop();
                builder.append(current.data+",");
                if(current.right != null){
                    stack.push(current.right);
                }
                if(current.left != null){
                    stack.push(current.left);
                }
            }
        }
        return builder;
    }

    public String postOrder(boolean isIterative){
        if(isIterative){
            return postOrderIterative().toString();
        }else{
            StringBuilder builder = new StringBuilder();
            postOrderRecursive(root, builder);
            return builder.toString();
        }
    }

    private StringBuilder postOrderRecursive(BinaryTreeNode root, StringBuilder builder){
        if(root != null){
            return builder;
        }else{
            postOrderRecursive(root.left, builder);
            postOrderRecursive(root.right, builder);
            builder.append(root.data+",");
        }
        return builder;
    }

    private StringBuilder postOrderIterative(){
        //Approach 1
        if(root == null){
            return new StringBuilder();
        }else{
            StringBuilder builder = new StringBuilder();
            BinaryTreeNode current = root;
            Stack<BinaryTreeNode> firstStack = new Stack<BinaryTreeNode>();
            Stack<BinaryTreeNode> secondStack = new Stack<BinaryTreeNode>();
            firstStack.push(current);
            while(!firstStack.isEmpty()){
                current = firstStack.pop();
                if(current.left != null){
                    firstStack.push(current.left);
                }
                if(current.right != null){
                    firstStack.push(current.right);
                }
                secondStack.push(current);
            }

            while(!secondStack.isEmpty()){
                builder.append(secondStack.pop().data+",");
            }
            return builder;
        }

    }

    //root left right
    private StringBuilder morrisPreOrderTraversal(){
        StringBuilder builder = new StringBuilder();
        BinaryTreeNode current  = root;
        while(current != null){

            if(current.left == null){
                builder.append(current.data+",");
                current = current.right;
            }else {
                BinaryTreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = current;
                    builder.append(current.data+",");
                    current = current.left;
                } else {
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }
        return builder;
    }

    public String preOrder(boolean isIterative){
        if(isIterative){
            //return preOrderIterative().toString();
            return morrisPreOrderTraversal().toString();
        }else{
            StringBuilder builder = new StringBuilder();
            preOrderRecursive(root, builder);
            return builder.toString();
        }
    }

    public int size(){
        return size(root);
    }

    private int size(BinaryTreeNode root){
        if(root == null){
            return 0;
        }else{
            return size(root.left)+ 1 + size(root.right);
        }
    }
}
