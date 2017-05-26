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
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    public int remove() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("Empty Queue");
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException("Empty queue");
        }
        return head.data;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
}
