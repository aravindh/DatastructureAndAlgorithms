package com.aravindh.dsa.linear;

/**
 * Created by aravindhravindran on 25/5/17.
 */
public class LinkedList {

    public SinglyLinkedListNode head;

    public void prepend(int data){
        prepend(new SinglyLinkedListNode(data));
    }

    public void prepend(SinglyLinkedListNode newNode){
        if(head == null){
            head = new SinglyLinkedListNode();
        }
        newNode.next = head.next;
        head.next = newNode;
    }

    public int size(){
        if(this.isEmpty()){
            return 0;
        }
        int size = 0;
        SinglyLinkedListNode curr = head.next;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        return size;
    }

    public void appendAll(LinkedList sourceList){
        if(sourceList.isEmpty()){
            return;
        }
        if(head == null){
            head = new SinglyLinkedListNode();
        }
        SinglyLinkedListNode curr = head.next;
        SinglyLinkedListNode prev = head;
        while(curr != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = sourceList.head.next;
    }

    public void append(int data){
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(head == null){
            head = new SinglyLinkedListNode();
            head.next = newNode;
            return;
        }
        SinglyLinkedListNode current = head.next;
        SinglyLinkedListNode prev = head.next;
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

    public String toString(){
        if(isEmpty()){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        SinglyLinkedListNode curr = head.next;
        while(curr != null){
            builder.append(String.valueOf(curr.data));
            builder.append(", ");
            curr = curr.next;
        }
        return builder.toString();
    }

}
