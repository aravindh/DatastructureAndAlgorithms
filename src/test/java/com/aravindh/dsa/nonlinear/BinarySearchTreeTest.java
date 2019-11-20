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
        int[] m = null;
        System.out.println(m.length);
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

    @Test(expected = IllegalArgumentException.class)
    public void deleteOnEmptyTreeThrowsIllegalArgumentException(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues();
        bst.delete(10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteOnNonEmptyWithTargetLessThanMinThrowsIllegalArgumentException(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        bst.delete(20);
    }


    @Test(expected = IllegalArgumentException.class)
    public void deleteOnNonEmptyWithTargetGreaterThanMaxThrowsIllegalArgumentException(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        bst.delete(90);
    }


    @Test(expected = IllegalArgumentException.class)
    public void deleteOnNonEmptyWithInValidTargetThrowsIllegalArgumentException(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        bst.delete(60);
    }

    @Test
    public void deleteWithTargetAsRootDeletesNode(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83, 42, 44);
        bst.delete(49);
        Assert.assertEquals("42,43,44,46,64,79,83,",bst.inOrder(true));
    }

    @Test
    public void deleteWithTargetAsLeafDeletesNode(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        bst.delete(43);
        Assert.assertEquals("46,49,64,79,83,",bst.inOrder(true));
    }

    @Test
    public void deleteWithTargetWithOneChildDeletesNode(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83, 42, 44);
        bst.delete(46);
        Assert.assertEquals("42,43,44,49,64,79,83,",bst.inOrder(true));
    }

    @Test
    public void deleteWithTargetWithTwoChildDeletesNode(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        bst.delete(79);
        Assert.assertEquals("43,46,49,64,83,",bst.inOrder(true));
    }

    @Test
    public void isIdenticalWithIdenticalTreesReturnTrue(){
        BinarySearchTree src = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        BinarySearchTree target = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        Assert.assertTrue(src.isIdentical(target));
    }

    @Test
    public void isIdenticalWithEmptyTreesReturnTrue(){
        BinarySearchTree src = BinaryTreeCreationHelper.getBSTWithValues();
        BinarySearchTree target = BinaryTreeCreationHelper.getBSTWithValues();
        Assert.assertTrue(src.isIdentical(target));
    }

    @Test
    public void isIdenticalWithEitherOfTreeIsEmptyReturnFalse(){
        BinarySearchTree src = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        BinarySearchTree target = BinaryTreeCreationHelper.getBSTWithValues();
        Assert.assertFalse("With target tree as Empty" ,src.isIdentical(target));
        target = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        src = BinaryTreeCreationHelper.getBSTWithValues();
        Assert.assertFalse("With source tree as Empty", src.isIdentical(target));
    }

    @Test
    public void sizeOnEmptyTreeReturnZero(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues();
        Assert.assertEquals(0, bst.size());
    }

    @Test
    public void sizeOnNonEmptyTreeReturnSize(){
        BinarySearchTree bst = BinaryTreeCreationHelper.getBSTWithValues(49, 46, 79, 43, 64, 83);
        Assert.assertEquals(6, bst.size());
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