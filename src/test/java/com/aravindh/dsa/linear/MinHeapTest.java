package com.aravindh.dsa.linear;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 21/11/17.
 */
@RunWith(value = JUnit4.class)
public class MinHeapTest {

    @Test
    public void addOnNonEmptyHeapInsertsElementAndRebuildsHeap(){
        MinHeap heap = getHeapWithValues(10,5,1,45,8);
        Assert.assertEquals(5, heap.size());
        Assert.assertEquals(1, heap.peek());
        heap.add(0);
        Assert.assertEquals(0, heap.peek());
        heap.add(2);heap.add(3);heap.add(4);
        Assert.assertEquals(0, heap.peek());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void peekOnEmptyHeapThrowsIndexOutOfBoundException(){
        MinHeap heap = getHeapWithValues(1);
        heap.extractMin();
        heap.peek();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void extractMaxOnEmptyHeapThrowsIndexOutOfBoundException(){
        MinHeap heap = getHeapWithValues(1);
        heap.extractMin();
        heap.extractMin();
    }

    @Test
    public void extractMaxOnNonEmptyHeapReturnsMaxAndRebuildsHeap(){
        MinHeap heap = getHeapWithValues(10,5,1,45,8,0);
        Assert.assertEquals(0, heap.extractMin());
        Assert.assertEquals(1, heap.extractMin());
        Assert.assertEquals(5, heap.extractMin());
        Assert.assertEquals(8, heap.extractMin());
        Assert.assertEquals(10, heap.extractMin());
        Assert.assertEquals(45, heap.extractMin());
    }

    private MinHeap getHeapWithValues(int ... values){
        MinHeap heap = new MinHeap();
        for(int val : values){
            heap.add(val);
        }
        return heap;
    }

}