package com.aravindh.dsa.problemSolving;

import java.util.EmptyStackException;

public class KstackUsingArray {

    private int numberOfStacks;
    private int size;
    private int[] items;
    private int[] next;
    private int[] stackTop;
    private Integer availableTop;

    public KstackUsingArray(int numberOfStacks, int size) {
        this.numberOfStacks = numberOfStacks;
        this.size = size;
        this.items = new int[size];
        this.next = new int[size];
        this.stackTop = new int[numberOfStacks];
        for(int i =0; i< size; i++){
            items[i] = 0;
        }
        for(int i =0; i< size-1; i++){
            next[i] = i+1;
        }
        next[size-1] = -1;
        for(int i =0; i< this.numberOfStacks; i++){
            stackTop[i] = -1;
        }
        this.availableTop = 0;
    }

    public void push(int stackIdx, int data) throws IllegalArgumentException {
        if(availableTop == -1){
            throw new IllegalArgumentException("No space left in array");
        }
        int oldStackTop = stackTop[stackIdx];
        items[availableTop] = data;
        int nextAvailableTop = next[availableTop];
        next[availableTop] = oldStackTop;
        stackTop[stackIdx] = availableTop;
        availableTop = nextAvailableTop;
    }

    public int pop(int stackIdx)throws EmptyStackException{
        if(stackTop[stackIdx] == -1){
            throw new EmptyStackException();
        }
        int currentTopIdx = stackTop[stackIdx];
        int currentTopValue = items[currentTopIdx];
        int newTopIdx = next[currentTopIdx];
        stackTop[stackIdx] = newTopIdx;
        int oldAvailableTop = availableTop;
        availableTop = currentTopIdx;
        next[currentTopIdx] = oldAvailableTop;
        return currentTopValue;
    }



}
