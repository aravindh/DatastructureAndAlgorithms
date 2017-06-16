package com.aravindh.dsa.helper;

import com.aravindh.dsa.nonlinear.BinarySearchTree;

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

    public static BinarySearchTree getBSTWithValues(BinarySearchTree tree, int... values){
        for(int value : values){
            tree.insert(value);
        }
        return tree;
    }
}
