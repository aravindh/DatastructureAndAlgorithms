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
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(top != null){
            newNode.next = top;
        }
        top = newNode;
    }

    public int pop() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
}
