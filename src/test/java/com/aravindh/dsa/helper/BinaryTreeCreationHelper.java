package com.aravindh.dsa.helper;

import com.aravindh.dsa.nonlinear.BinarySearchTree;
import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

/**
 * Created by aravindhravindran on 16/6/17.
 */
public class BinaryTreeCreationHelper {

    public static BinarySearchTree getBSTWithValues(int... values){
        BinarySearchTree tree = new BinarySearchTree();
        for(int value : values){
            tree.insert(value);
        }
        return tree;
    }

    public static void getBinaryTreeWithValues(BinaryTree tree, int... values){
        for(int value : values){
            tree.insert(value);
        }
    }

    public static BinaryTree getBinaryTreeWithValues(int... values){
        BinaryTree tree = new BinaryTree();
        for(int value : values){
            tree.insert(value);
        }
        return tree;
    }

    public static BinaryTree getLeftSkewedBinaryTreeWithValues(int... values){
        BinaryTree tree = new BinaryTree();
        return getLeftSkewedBinaryTreeWithValues(tree, values);
    }

    public static BinaryTree getLeftSkewedBinaryTreeWithValues(BinaryTree tree, int... values){
        BinaryTreeNode prev = tree.root;
        for(int value : values){
            BinaryTreeNode curr = new BinaryTreeNode(value);
            if(prev == null){
                tree.root = curr;
            }else{
                prev.left = curr;
            }
            prev = curr;
        }
        return tree;
    }

    public static BinaryTree getRightSkewedBinaryTreeWithValues(int... values){
        BinaryTree tree = new BinaryTree();
        return getRightSkewedBinaryTreeWithValues(tree, values);
    }

    public static BinaryTree getRightSkewedBinaryTreeWithValues(BinaryTree tree, int... values){
        BinaryTreeNode prev = tree.root;
        for(int value : values){
            BinaryTreeNode curr = new BinaryTreeNode(value);
            if(prev == null){
                tree.root = curr;
            }else{
                prev.right = curr;
            }
            prev = curr;
        }
        return tree;
    }
}
