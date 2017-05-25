package com.aravindh.dsa.linear;

/**
 * Created by aravindhravindran on 25/5/17.
 */
public class LinkedList {
    private class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void prepend(int data){
        if(head == null){
            head = new Node(null);
        }
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
    }

    public void append(int data){
        if(head == null){
            head = new Node(null);
        }
        Node newNode = new Node(data);
        Node current = head.next;
        Node prev = head;
        while(current != null){
            prev = current;
            current = current.next;
        }

        prev.next = newNode;
    }

    public void deleteNodeWithValue(int value) throws IllegalArgumentException{
        if(isEmpty()){
            throw new IllegalArgumentException("Empty list");
        }
        Node current = head.next;
        Node prev = head;
        boolean isValueFound = false;
        while(current != null){
            if(value == current.data){
                isValueFound = true;
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
        }
        if(!isValueFound){
            throw new IllegalArgumentException("Value "+value+" not found");
        }
    }

    public boolean isEmpty(){
        if(head == null || head.next == null){
            return true;
        }
        return false;
    }

    public Integer middleNodeValue(){
        if(isEmpty()){
            return null;
        }
        Node fastPtr = head.next;
        Node slowPtr = head.next;
        while(fastPtr != null && fastPtr.next  != null && slowPtr != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr.data;
    }

    public void reverse(){
        Node current = head.next;
        Node prev = null;
        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
    }

    public boolean search(int value){
        Node current = head.next;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

}
