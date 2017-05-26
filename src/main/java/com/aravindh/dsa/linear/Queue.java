package com.aravindh.dsa.linear;

import java.util.NoSuchElementException;

/**
 * Created by aravindhravindran on 26/5/17.
 */
public class Queue {
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void add(int data){

    }

    public int remove() throws NoSuchElementException {
        return 0;
    }

    public int peek() throws NoSuchElementException{
        return 0;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
}
