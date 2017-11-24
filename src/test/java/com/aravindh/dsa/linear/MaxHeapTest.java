package com.aravindh.dsa.linear;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by aravindhravindran on 21/11/17.
 */
@RunWith(value = JUnit4.class)
public class MaxHeapTest {

    @Test
    public void addOnNonEmptyHeapInsertsElementAndRebuildsHeap(){
        MaxHeap heap = getHeapWithValues(10,5,1,45,8,0);
        Assert.assertEquals(6, heap.size());
        Assert.assertEquals(45, heap.peek());
        heap.add(60);
        Assert.assertEquals(60, heap.peek());
        heap.add(51); heap.add(52); heap.add(53); heap.add(54); heap.add(55);
        Assert.assertEquals(60, heap.peek());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void peekOnEmptyHeapThrowsIndexOutOfBoundException(){
        MaxHeap heap = getHeapWithValues();
        heap.peek();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void extractMaxOnEmptyHeapThrowsIndexOutOfBoundException(){
        MaxHeap heap = getHeapWithValues(10);
        heap.extractMax();
        heap.extractMax();

    }

    @Test
    public void extractMaxOnNonEmptyHeapReturnsMaxAndRebuildsHeap(){
        MaxHeap heap = getHeapWithValues(10,5,1,45,8,0);
        Assert.assertEquals(45, heap.extractMax());
        Assert.assertEquals(10, heap.extractMax());
        Assert.assertEquals(8, heap.extractMax());
        Assert.assertEquals(5, heap.extractMax());
        Assert.assertEquals(1, heap.extractMax());
        Assert.assertEquals(0, heap.extractMax());
    }

    private MaxHeap getHeapWithValues(int ... values){
        MaxHeap heap = new MaxHeap();
        for(int val : values){
            heap.add(val);
        }
        return heap;
    }


}