package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.BinaryTreeCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class SerializeAndDeserializeBinarySearchTreeTest {

    @Test
    public void serializeAndDeserializeWithValidNonEmptyTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinarySearchTree serializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(serializeBinarySearchTree, 5,2,7,1,3,4,6,8);
        SerializeAndDeserializeBinarySearchTree deserializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        List<Integer> serializeTree = serializeBinarySearchTree.serializeTree();
        deserializeBinarySearchTree.deSerializeTree(serializeTree);
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithValidEmptyTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinarySearchTree serializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        SerializeAndDeserializeBinarySearchTree deserializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithSingleNodeTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinarySearchTree serializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(serializeBinarySearchTree, 5);
        SerializeAndDeserializeBinarySearchTree deserializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithLeftSkewedTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinarySearchTree serializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(serializeBinarySearchTree, 3,2,1);
        SerializeAndDeserializeBinarySearchTree deserializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithRightSkewedTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinarySearchTree serializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(serializeBinarySearchTree, 1,2,3);
        SerializeAndDeserializeBinarySearchTree deserializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }

    @Test
    public void serializeAndDeserializeWithRightSkewedWithSameValuesTreeSerializedAndDeSerializedTreeMatches(){
        SerializeAndDeserializeBinarySearchTree serializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        BinaryTreeCreationHelper.getBinaryTreeWithValues(serializeBinarySearchTree, 5,5,5,5,5);
        SerializeAndDeserializeBinarySearchTree deserializeBinarySearchTree = new SerializeAndDeserializeBinarySearchTree();
        deserializeBinarySearchTree.deSerializeTree(serializeBinarySearchTree.serializeTree());
        Assert.assertEquals(serializeBinarySearchTree.preOrder(true), deserializeBinarySearchTree.preOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.postOrder(true), deserializeBinarySearchTree.postOrder(true));
        Assert.assertEquals(serializeBinarySearchTree.inOrder(true), deserializeBinarySearchTree.inOrder(true));
    }
}