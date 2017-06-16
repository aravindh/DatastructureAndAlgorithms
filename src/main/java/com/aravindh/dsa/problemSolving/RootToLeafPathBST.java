package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinarySearchTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

/**
 * Created by aravindhravindran on 15/6/17.
 */
public class RootToLeafPathBST extends BinarySearchTree {

    public String rootToLeafPath(){
        StringBuilder allPaths = new StringBuilder();
        rootToLeafPath(root, new StringBuilder(), allPaths);
        return allPaths.toString();

    }
    private void rootToLeafPath(BinaryTreeNode root, StringBuilder prevPath, StringBuilder allPaths){
        if(root == null){
            return;
        }else if(root.left == null && root.right == null) {
            //leaf
            prevPath.append(root.data+",");
            allPaths.append(prevPath+"\n");
            return;
        }else{
            //non-leaf
            prevPath.append(root.data+",");
            StringBuilder rightPath = new StringBuilder(prevPath);
            rootToLeafPath(root.left, prevPath, allPaths);
            rootToLeafPath(root.right, rightPath, allPaths);
            return;
        }
    }



}

