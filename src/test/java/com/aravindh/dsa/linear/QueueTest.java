package com.aravindh.dsa.linear;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 26/5/17.
 */
@RunWith(value = JUnit4.class)
public class QueueTest {

    @Test
    public void addOnEmptyQueueSuccessfullyAddsElementToQueue(){
        Queue queue = new Queue();
        queue.add(1);
        Assert.assertEquals(1, queue.peek());
    }

    @Test
    public void addOnNonEmptyQueueSuccessfullyAddsElementsToQueue(){
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        Assert.assertEquals(1, queue.remove());
        Assert.assertEquals(2, queue.remove());
        Assert.assertEquals(3, queue.remove());
        Assert.assertEquals(4, queue.remove());
        Assert.assertEquals(5, queue.remove());
    }

    @Test(expected = NoSuchElementException.class)
    public void removeOnEmptyQueueThrowsNoSuchElementException(){
        Queue queue = new Queue();
        queue.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void peekOnEmptyQueueThrowsNoSuchElementException(){
        Queue queue = new Queue();
        queue.peek();
    }


}