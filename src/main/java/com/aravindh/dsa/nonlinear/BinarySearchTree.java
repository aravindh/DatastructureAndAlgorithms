package com.aravindh.dsa.nonlinear;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Max No. of nodes at level i = 2^(i-1) and root is at level 1.
 * Max No. of nodes of height h = (2^h) - 1 i.e., 1+2+4+8+16+32...2^(h-1)
 * Minimum height for N nodes  = log2(N+1)-1 i.e., take log on the above expression
 * Traversal:
 *  InOrder = Left Root Right
 *  PreOrder= Root Left Right
 *  PostOrder=Left Right Root
 *
 *  Inorder - First element is smallest since it starts with leftmost and last element is largest as it ends with Right most
 *  preOrder- First is Root and last is largest as its right most element
 *  postOrder-First is smallest and last is root
 *
 *  Time Complexity of Traversal = O(n)
 *  Space Complexity Of Traversal = O(1) except the function stack
 *
 * Created by aravindhravindran on 31/5/17.
 */
public class BinarySearchTree extends BinaryTree {

    public void insert(int data){
        root = insertRecursive(data, root);
    }

    public void insert(int data, boolean isIterative){
        if(isIterative){
            insertIterative(data);
        }else{
            root = insertRecursive(data, root);
        }
    }

    private BinaryTreeNode insertRecursive(int data, BinaryTreeNode root){
       if(root == null){
           return new BinaryTreeNode(data);
       }else if(data < root.data){
           root.left = insertRecursive(data, root.left);
       }else{
           root.right = insertRecursive(data, root.right);
       }
       return root;
    }

    private void insertIterative(int data){
        if(root == null){
            root = new BinaryTreeNode(data);
        }else{
            BinaryTreeNode current = root;
            BinaryTreeNode prev = root;
            while(current != null){
                prev = current;
                if(data < current.data){
                    current = current.left;
                }else{
                    current = current.right;
                }
            }
            if(data < prev.data){
                prev.left = new BinaryTreeNode(data);
            }else{
                prev.right = new BinaryTreeNode(data);
            }
        }
    }

    public boolean search(int value, boolean isIterative){
        if(isIterative){
            return searchIterative(value);
        }else{
            return searchRecursive(root, value);
        }
    }

    private boolean searchRecursive(BinaryTreeNode root, int value){
        if(root == null){
            return false;
        }else if(root.data == value){
            return true;
        }else if(value < root.data){
            return searchRecursive(root.left, value);
        }else{
            return searchRecursive(root.right, value);
        }
    }

    private boolean searchIterative(int value){
        BinaryTreeNode current = root;
        while(current != null){
            if(current.data == value){
                return true;
            }else if(value < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return false;
    }

    private BinaryTreeNode getMinNode(BinaryTreeNode root){
        BinaryTreeNode current = root;
        while(current.left != null){
            current = current.left;
        }
        return current;
    }

    private BinaryTreeNode getMaxNode(BinaryTreeNode root){
        BinaryTreeNode current = root;
        while(current.right != null){
            current = current.right;
        }
        return current;
    }

    public void delete(int value){
        root = deleteRecursive(root, value);
    }

    private BinaryTreeNode deleteRecursive(BinaryTreeNode root, int targetValue){
        if(root == null){
            throw new IllegalArgumentException("Target value not found in binary search tree");
        }
        if(targetValue < root.data){
            root.left = deleteRecursive(root.left, targetValue);
        }else if(targetValue > root.data){
            root.right = deleteRecursive(root.right, targetValue);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left != null && root.right == null){
                return root.left;
            }else if(root.left == null && root.right != null){
                return root.right;
            }else{
                final int maxNodeValue = getMaxNode(root.left).data;
                root.left = deleteRecursive(root.left, maxNodeValue);
                root.data = maxNodeValue;
                return root;
            }
        }
        return root;
    }

    public void printTree(){
        int height = height(false);
        PriorityQueue<BinaryTreeNode> nodes = new PriorityQueue();
        while(!nodes.isEmpty()){

        }
    }

    

    public boolean equals(BinarySearchTree target){
        return isIdentical(this.root, target.root);
    }



   /* public void convertToMirrorTree(){
        return
    }*/




    private boolean isIdentical(BinaryTreeNode source, BinaryTreeNode target){
        if(source == null && target == null){
            return true;
        }else if(source == null || target == null){
            return false;
        }else{
            if(source.data == target.data && isIdentical(source.left, target.left) && isIdentical(source.right, target.right)){
                return true;
            }else{
                return false;
            }
        }
    }

}
