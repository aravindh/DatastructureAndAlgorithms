package com.aravindh.dsa.linear;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 25/5/17.
 */
@RunWith(value = JUnit4.class)
public class StackTest {

    @Test
    public void pushOnEmptyStackSuccessfullyAddsElementToTop(){
        Stack stack = new Stack();
        stack.push(1);
        Assert.assertEquals(1, stack.peek());
    }

    @Test
    public void pushOnNonEmptyStackSuccessfullyAddsElementToTop(){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.peek());
    }

    @Test
    public void popOnNonEmptyStackSuccessfullyPopsElementOnTop(){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Assert.assertEquals(4, stack.pop());
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(1, stack.pop());
    }

    @Test(expected = EmptyStackException.class)
    public void popOnEmptyStackThrowsEmptyStackException(){
        Stack stack = new Stack();
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void peekOnEmptyStackThrowsEmptyStackException(){
        Stack stack = new Stack();
        stack.peek();
    }



}