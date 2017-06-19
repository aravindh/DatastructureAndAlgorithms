package com.aravindh.dsa.linear;

/**
 * Created by aravindhravindran on 25/5/17.
 */
public class LinkedList {

    protected SinglyLinkedListNode head;

    public void prepend(int data){
        if(head == null){
            head = new SinglyLinkedListNode(null);
        }
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = head.next;
        head.next = newNode;
    }

    public void append(int data){
        if(head == null){
            head = new SinglyLinkedListNode(null);
        }
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head.next;
        SinglyLinkedListNode prev = head;
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
        SinglyLinkedListNode current = head.next;
        SinglyLinkedListNode prev = head;
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
        SinglyLinkedListNode fastPtr = head.next;
        SinglyLinkedListNode slowPtr = head.next;
        while(fastPtr != null && fastPtr.next  != null && slowPtr != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr.data;
    }

    public void reverse(){
        SinglyLinkedListNode current = head.next;
        SinglyLinkedListNode prev = null;
        while(current != null){
            SinglyLinkedListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
    }

    public boolean search(int value){
        SinglyLinkedListNode current = head.next;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

}
