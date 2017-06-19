package com.aravindh.dsa.linear;

import com.aravindh.dsa.helper.LinkedListCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 25/5/17.
 */
@RunWith(value = JUnit4.class)
public class LinkedListTest {

    @Test
    public void prependOnEmptyListSuccessfullyPrependsElement(){
        LinkedList list = new LinkedList();
        list.prepend(2);
        Assert.assertTrue(list.search(2));
    }

    @Test
    public void appendOnEmptyListSuccessfullyAppendsElement(){
        LinkedList list = new LinkedList();
        list.append(2);
        Assert.assertTrue(list.search(2));
    }

    @Test
    public void deleteNodeWithValueOnNonEmptyListWithValidValueSuccessfullyDeletesElement(){
        LinkedList list = new LinkedList();
        list.append(2);
        list.deleteNodeWithValue(2);
        Assert.assertFalse(list.search(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteNodeWithValueOnNonEmptyListWithInValidValueThrowsIllegalArgumentException(){
        LinkedList list = new LinkedList();
        list.append(2);
        list.deleteNodeWithValue(3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteNodeWithValueOnEmptyListThrowsIllegalArgumentException(){
        LinkedList list = new LinkedList();
        list.deleteNodeWithValue(3);
    }

    @Test
    public void middleNodeValueOnEmptyListReturnsNull(){
        LinkedList list = new LinkedList();
        Assert.assertNull(list.middleNodeValue());
    }

    @Test
    public void middleNodeValueOnNonEmptyListReturnsMiddleNodeValue(){
        LinkedList list = LinkedListCreationHelper.getLinkedListWithValues(1,2,3,4);
        Assert.assertEquals("With even number of nodes", Integer.valueOf(3), list.middleNodeValue());
        list.append(5);
        Assert.assertEquals("With odd number of nodes", Integer.valueOf(3), list.middleNodeValue());
    }


}