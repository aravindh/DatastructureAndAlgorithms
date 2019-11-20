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

    @Test
    public void reverseWithEmptyListReturnUnchanged(){
        LinkedList linkedList = new LinkedList();
        linkedList.reverse(true);
        linkedList.reverse(false);
    }

    @Test
    public void reverseWithEvenNumberOfNodesReturnsReversedList(){
        LinkedList list = LinkedListCreationHelper.getLinkedListWithValues(1,2);
        list.reverse(true);
        Assert.assertEquals("2, 1, ", list.toString());

        LinkedList list1 = LinkedListCreationHelper.getLinkedListWithValues(1,2);
        list1.reverse(false);
        Assert.assertEquals("2, 1, ", list1.toString());

        LinkedList list2 = LinkedListCreationHelper.getLinkedListWithValues(1,2,3,4);
        list2.reverse(true);
        Assert.assertEquals("4, 3, 2, 1, ", list2.toString());

        LinkedList list3 = LinkedListCreationHelper.getLinkedListWithValues(1,2,3,4);
        list3.reverse(false);
        Assert.assertEquals("4, 3, 2, 1, ", list3.toString());
    }

    @Test
    public void reverseWithOddNumberOfNodesReturnsReversedList(){
        LinkedList list2 = LinkedListCreationHelper.getLinkedListWithValues(1,2,3,4,5);
        list2.reverse(true);
        Assert.assertEquals("5, 4, 3, 2, 1, ", list2.toString());

        LinkedList list3 = LinkedListCreationHelper.getLinkedListWithValues(1,2,3,4,5);
        list3.reverse(false);
        Assert.assertEquals("5, 4, 3, 2, 1, ", list3.toString());
    }

    @Test
    public void reverseWithSingleElementRemainsUnchanged(){
        LinkedList list = LinkedListCreationHelper.getLinkedListWithValues(1);
        list.reverse(true);
        Assert.assertEquals("1, ", list.toString());

        LinkedList list2 = LinkedListCreationHelper.getLinkedListWithValues(1);
        list2.reverse(false);
        Assert.assertEquals("1, ", list2.toString());
    }

    @Test
    public void rotateWithEmptyListListRemainsSame(){
        LinkedList linkedList = new LinkedList();
        linkedList.rotate(1);
    }

    @Test
    public void rotateWithKEqualToLengthRemainsSame(){
        LinkedList linkedList = LinkedListCreationHelper.getLinkedListWithValues(1,2,3,4,5);
        linkedList.rotate(5);
        Assert.assertEquals("1, 2, 3, 4, 5, ", linkedList.toString());
    }

    @Test
    public void rotateWithKGreaterThanLengthRemainsSame(){
        LinkedList linkedList = LinkedListCreationHelper.getLinkedListWithValues(1,2,3,4,5);
        linkedList.rotate(6);
        Assert.assertEquals("1, 2, 3, 4, 5, ", linkedList.toString());
    }

    @Test
    public void rotateWithValidKRotatesList(){
        LinkedList linkedList = LinkedListCreationHelper.getLinkedListWithValues(1,2,3,4,5);
        linkedList.rotate(1);
        Assert.assertEquals("2, 3, 4, 5, 1, ", linkedList.toString());

        linkedList.rotate(2);
        Assert.assertEquals("4, 5, 1, 2, 3, ", linkedList.toString());

        linkedList.rotate(3);
        Assert.assertEquals("2, 3, 4, 5, 1, ", linkedList.toString());

        linkedList.rotate(4);
        Assert.assertEquals("1, 2, 3, 4, 5, ", linkedList.toString());

        linkedList.rotate(5);
        Assert.assertEquals("1, 2, 3, 4, 5, ", linkedList.toString());
    }

}