package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.nonlinear.BinaryTree;
import com.aravindh.dsa.nonlinear.BinaryTreeNode;

import java.util.LinkedList;

/**
 * Created by aravindhravindran on 9/11/17.
 */
public class TopViewOfBinaryTree extends BinaryTree {
    public String topView(){
        if(root == null){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        LinkedList<BinaryTreeNode> nodes = new LinkedList<BinaryTreeNode>();
        nodes.add(root);
        LinkedList<Integer> horizontalDistance = new LinkedList<Integer>();
        horizontalDistance.add(0);
        Integer maxLeftDistance = 1;
        Integer maxRightDistance = 0;

        while(!nodes.isEmpty()){
            BinaryTreeNode currentNode = nodes.remove();
            Integer currentHorizontalDistance = horizontalDistance.remove();
            if(currentNode.left != null){
                nodes.add(currentNode.left);
                horizontalDistance.add(currentHorizontalDistance-1);
            }

            if(currentNode.right != null){
                nodes.add(currentNode.right);
                horizontalDistance.add(currentHorizontalDistance+1);
            }

            if(currentHorizontalDistance < maxLeftDistance){
                maxLeftDistance = currentHorizontalDistance;
                builder.append(currentNode.data).append(",");
            }

            if(currentHorizontalDistance > maxRightDistance){
                maxRightDistance = currentHorizontalDistance;
                builder.append(currentNode.data).append(",");
            }

        }
        return builder.toString();
    }

    private void topViewRecursive(BinaryTreeNode root, Integer rootWidth, StringBuilder builder, Integer maxLeftWidth, Integer maxRightWidth){
        if(root == null){
            return;
        }
        if(rootWidth < maxLeftWidth ){
            maxLeftWidth = rootWidth;
            builder.append(root.data).append(",");
        }
        if(rootWidth > maxRightWidth){
            maxRightWidth = rootWidth;
            builder.append(root.data).append(",");
        }
        topViewRecursive(root.left, rootWidth-1, builder, maxLeftWidth, maxRightWidth);
        topViewRecursive(root.right, rootWidth+1, builder, maxLeftWidth, maxRightWidth);
    }
}
