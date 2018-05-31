package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class QueueUsingStackTest {

    @Test
    public void addAndRemoveElementsToQueueAlternativelyReturnElementsInInsertedOrder(){
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        Assert.assertEquals(1, queue.peek());
        queue.enqueue(2);
        Assert.assertEquals(1, queue.peek());
        Assert.assertEquals(1, queue.dequeue());
        Assert.assertEquals(2, queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        Assert.assertEquals(1, queue.dequeue());
        queue.enqueue(4);
        Assert.assertEquals(2, queue.dequeue());
        queue.enqueue(5);
        Assert.assertEquals(3, queue.dequeue());
        Assert.assertEquals(4, queue.dequeue());
        Assert.assertEquals(5, queue.dequeue());
    }

    @Test
    public void addAllElementsAndRemoveAllElemetsToQueueReturnElementsInInsertedOrder(){
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        Assert.assertEquals(1, queue.dequeue());
        Assert.assertEquals(2, queue.dequeue());
        Assert.assertEquals(3, queue.dequeue());
        Assert.assertEquals(4, queue.dequeue());
        Assert.assertEquals(5, queue.dequeue());
    }

    @Test(expected = EmptyStackException.class)
    public void removeElementOnEmptyQueueThrowsEmptyStackException(){
        QueueUsingStack queue = new QueueUsingStack();
        queue.dequeue();
    }

    @Test(expected = EmptyStackException.class)
    public void addAllElementsAndRemoveElementsMoreThanNumberOfInsertedToQueueThrowsEmptyStackException(){
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.dequeue();
    }



}