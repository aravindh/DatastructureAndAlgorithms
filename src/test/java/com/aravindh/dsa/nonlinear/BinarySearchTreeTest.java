package com.aravindh.dsa.nonlinear;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 2/6/17.
 */
@RunWith(value=JUnit4.class)
public class BinarySearchTreeTest {

    @Test
    public void insertOnEmptyTreeSuccessfullyAddsElement(){
        BinarySearchTree tree = new BinarySearchTree();
        Assert.assertTrue(tree.isEmpty());
        tree.insert(5);
        Assert.assertFalse(tree.isEmpty());
    }

    @Test
    public void inOrderOnNonEmptyTreeReturnsInOrderTraversalString(){
        BinarySearchTree tree = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        Assert.assertEquals("1,2,3,4,5,6,7,8,", tree.inOrder(true));
        Assert.assertEquals("1,2,3,4,5,6,7,8,", tree.inOrder(false));
    }

    @Test
    public void preOrderOnNonEmptyTreeReturnsInOrderTraversalString(){
        BinarySearchTree tree = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        Assert.assertEquals("5,3,2,1,4,7,6,8,", tree.preOrder(true));
        //Assert.assertEquals("5,3,2,1,4,7,6,8,", tree.preOrder(false));
    }

    @Test
    public void postOrderOnNonEmptyTreeReturnsInOrderTraversalString(){
        BinarySearchTree tree = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        Assert.assertEquals("1,2,4,3,6,8,7,5,", tree.postOrder(true));
    }

    @Test
    public void deleteWithValueInLeafDeletesNodeSuccessfully(){

    }

    @Test
    public void deleteWithValueWithOneChildDeletesNodeSuccessfully(){

    }


    @Test
    public void deleteWithValueWithTwoChildDeletesNodeSuccessfully(){

    }

    @Test
    public void breadthFirstTraversalWithEmptyTreeReturnEmptyString(){
        BinarySearchTree bst = new BinarySearchTree();
        Assert.assertEquals("", bst.breadthFirstTraversal());
    }

    @Test
    public void breadthFirstTraversalWithNonEmptyTreeReturnTraversalString(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        Assert.assertEquals("5,3,7,2,4,6,8,1,", bst.breadthFirstTraversal());
        bst = BinaryTreeCreationHelper.getBSTWithValues(1,2,3,4,5);
        Assert.assertEquals("1,2,3,4,5,", bst.breadthFirstTraversal());
    }

    @Test
    public void searchOnNonEmptyTreeWithValidValueReturnsTrue(){
        BinarySearchTree tree = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        Assert.assertTrue(tree.search(4, true));
        Assert.assertTrue(tree.search(4, false));
    }

    @Test
    public void searchOnNonEmptyTreeWithInvalidValueReturnsFalse(){
        BinarySearchTree tree = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        Assert.assertFalse(tree.search(9, true));
        Assert.assertFalse(tree.search(9, false));
    }

    @Test
    public void searchOnEmptyTreeReturnsFalse(){
        BinarySearchTree tree = new BinarySearchTree();
        Assert.assertFalse(tree.search(4, true));
        Assert.assertFalse(tree.search(4, false));
    }

    @Test
    public void equalsOnEmptyTreesReturnTrue(){
        BinarySearchTree source = new BinarySearchTree();
        BinarySearchTree target = new BinarySearchTree();
        Assert.assertTrue(source.equals(target));
    }

    @Test
    public void equalsOnNonEmptyIdenticalTreesReturnTrue(){
        BinarySearchTree source = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        BinarySearchTree target = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        Assert.assertTrue(source.equals(target));
    }

    @Test
    public void equalsOnNonEmptyNonIdenticalTreesReturnFalse(){
        BinarySearchTree source = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        BinarySearchTree target = BinaryTreeCreationHelper.getBSTWithValues(4,2,5,1,3);
        Assert.assertFalse(source.equals(target));
        target = new BinarySearchTree();
        Assert.assertFalse(source.equals(target));
    }

    @Test
    public void sizeOnEmptyTreeReturnsZero(){
        BinarySearchTree tree = new BinarySearchTree();
        Assert.assertEquals(0, tree.size());
    }

    @Test
    public void sizeOnNonEmptyTreeReturnsValidSize(){
        BinarySearchTree tree = BinaryTreeCreationHelper.getBSTWithValues(5,3,7,2,4,6,8,1);
        Assert.assertEquals(8, tree.size());
    }

}