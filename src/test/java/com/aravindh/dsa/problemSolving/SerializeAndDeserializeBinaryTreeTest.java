package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class SerializeAndDeserializeBinaryTreeTest {

    @Test
    public void serializeAndDeserializeWithValidNonEmptyTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinaryTree serializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(serializeBinarySearchTree, 5,2,7,1,3,4,6,8);
        SerializeAndDeserializeBinaryTree deserializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        List<Integer> serializeTree = serializeBinarySearchTree.serializeTree();
        deserializeBinarySearchTree.deSerializeTree(serializeTree);
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithValidEmptyTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinaryTree serializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        SerializeAndDeserializeBinaryTree deserializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithSingleNodeTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinaryTree serializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(serializeBinarySearchTree, 5);
        SerializeAndDeserializeBinaryTree deserializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithLeftSkewedTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinaryTree serializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        BinaryTreeCreationHelper.getLeftSkewedBinaryTreeWithValues(serializeBinarySearchTree, 3,2,1);
        SerializeAndDeserializeBinaryTree deserializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithRightSkewedTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinaryTree serializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        BinaryTreeCreationHelper.getRightSkewedBinaryTreeWithValues(serializeBinarySearchTree, 1,2,3);
        SerializeAndDeserializeBinaryTree deserializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithRightSkewedWithSameValuesTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinaryTree serializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(serializeBinarySearchTree, 5,5,5,5,5);
        SerializeAndDeserializeBinaryTree deserializeBinarySearchTree = new SerializeAndDeserializeBinaryTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

}