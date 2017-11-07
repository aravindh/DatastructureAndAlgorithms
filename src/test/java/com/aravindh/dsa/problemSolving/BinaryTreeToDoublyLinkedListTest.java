package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by aravindhravindran on 20/6/17.
 */
@RunWith(value = JUnit4.class)
public class BinaryTreeToDoublyLinkedListTest {

    @Test
    public void convertToDoubleTreeOnNonEmptyTreeModifiesTree(){
        String expectedForward = "null,8,4,9,2,10,5,1,6,3,7,";
        String expectedReverse = "7,3,6,1,5,10,2,9,4,8,null,";
        final int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Iterative
        BinaryTreeToDoublyLinkedList tree = new BinaryTreeToDoublyLinkedList();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, ints);
        tree.convertToDoubleTree(true);
        Assert.assertEquals(expectedForward, tree.printListForward());
        Assert.assertEquals(expectedReverse, tree.printListReverse());
        //recursive
        tree = new BinaryTreeToDoublyLinkedList();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(tree, ints);
        tree.convertToDoubleTree(false);
        Assert.assertEquals(expectedForward, tree.printListForward());
        Assert.assertEquals(expectedReverse, tree.printListReverse());

    }

    @Test
    public void convertToDoubleTreeOnEmptyTreeNoModificationOnTree(){
        BinaryTreeToDoublyLinkedList tree = new BinaryTreeToDoublyLinkedList();
        tree.convertToDoubleTree(true);
        Assert.assertEquals("", tree.printListForward());
        Assert.assertEquals("", tree.printListReverse());
        tree = new BinaryTreeToDoublyLinkedList();
        tree.convertToDoubleTree(false);
        Assert.assertEquals("null,", tree.printListForward());
        Assert.assertEquals("null,", tree.printListReverse());
    }

}