package com.aravindh.dsa.linear;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;
import org.junit.runner.RunWith;
/**
 * Created by aravindhravindran on 25/5/17.
 */
@RunWith(value = JUnit4.class)
public class ResizableArrayListTest {
    @Test
    public void addOnEmptyListSuccessfullyAddsElement(){
        ResizableArrayList arrayList = new ResizableArrayList();
        arrayList.add(1);
        Assert.assertEquals(1, arrayList.get(0));
    }

    @Test
    public void addOnFullListSuccessfullyAddsElement(){
        ResizableArrayList arrayList = new ResizableArrayList(1);
        arrayList.add(1);
        arrayList.add(2);
        Assert.assertEquals(2, arrayList.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithIndexGreaterThanSizeThrowsIndexOutOfBoundException(){
        ResizableArrayList arrayList = new ResizableArrayList();
        arrayList.add(1);
        arrayList.get(2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithNegativeIndexThrowsIndexOutOfBoundException(){
        ResizableArrayList arrayList = new ResizableArrayList();
        arrayList.add(1);
        arrayList.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void setAtIndexWithIndexGreaterThanSizeThrowsIndexOutOfBoundsException(){
        ResizableArrayList arrayList = new ResizableArrayList(1);
        arrayList.add(1);
        arrayList.setAtIndex(2, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void setAtIndexWithNegativeIndexThrowsIndexOutOfBoundsException(){
        ResizableArrayList arrayList = new ResizableArrayList(1);
        arrayList.add(1);
        arrayList.setAtIndex(-1, 2);
    }

    @Test
    public void setAtIndexWithValidIndexSuccessfullySetsElementAtIndex(){
        ResizableArrayList arrayList = new ResizableArrayList(1);
        arrayList.add(1);
        arrayList.setAtIndex(0, 2);
        Assert.assertEquals(2, arrayList.get(0));
    }
}