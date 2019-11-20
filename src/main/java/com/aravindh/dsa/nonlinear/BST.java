package com.aravindh.dsa.nonlinear;

public class BST {
    private BinaryTreeNode root;


    public void insert(int element, boolean isIterative){

    }

    private BinaryTreeNode insertRecursive(BinaryTreeNode root, int element){
        if(root == null){
            return new BinaryTreeNode(element);
        }
        if(element < root.data){
            root.left = insertRecursive(root.left, element);
        }else{
            root.right = insertRecursive(root.right, element);
        }
        return root;
    }

    private void insertIterative(int element){
        if(root == null){
            root = new BinaryTreeNode(element);
            return;
        }
        BinaryTreeNode curr = root;
        BinaryTreeNode prev = root;
        while(curr != null){
            prev = curr;
            if(element < curr.data){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }

        if(element < prev.data){
            prev.left = new BinaryTreeNode(element);
        }else{
            prev.right = new BinaryTreeNode(element);
        }
    }

    public boolean search(int target){

        return false;
    }

}
