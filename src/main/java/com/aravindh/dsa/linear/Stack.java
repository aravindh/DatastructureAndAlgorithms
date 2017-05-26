package com.aravindh.dsa.linear;

import java.util.EmptyStackException;

/**
 * Created by aravindhravindran on 25/5/17.
 */
public class Stack {
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public int peek() throws EmptyStackException{
        return 0;
    }

    public void push(int data){

    }

    public int pop() throws EmptyStackException{
        return 0;
    }

    public boolean isEmpty(){
        return false;
    }
}
