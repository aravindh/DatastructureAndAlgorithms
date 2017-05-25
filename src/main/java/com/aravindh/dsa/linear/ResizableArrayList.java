package com.aravindh.dsa.linear;

/**
 * Created by aravindhravindran on 25/5/17.
 */
public class ResizableArrayList {
    private static final int DEFAULT_ARRAY_SIZE = 10;
    private static final int DEFAULT_GROWTH_RATE = 2;
    private int[] items;
    private int size = 0;

    public ResizableArrayList(){
        this(DEFAULT_ARRAY_SIZE);
    }

    public ResizableArrayList(int size){
        this.items = new int[size];
    }

    public void add(int element){

    }

    public int get(int index) throws IndexOutOfBoundsException{
        return 0;
    }

    public void setAtIndex(int index, int element) throws IndexOutOfBoundsException{

    }

    public boolean isEmpty(){
        return false;
    }

    public int size(){
        return 0;
    }
}
