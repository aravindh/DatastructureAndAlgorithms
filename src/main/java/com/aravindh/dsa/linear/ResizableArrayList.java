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
        if(size >= items.length){
            grow();
        }
        items[size++] = element;
    }

    private void grow() {
        int[] newItems = new int[size*DEFAULT_GROWTH_RATE];
        for(int i=0; i< items.length; i++){
            newItems[i] = items[i];
        }
        items = newItems;
    }

    public int get(int index) throws IndexOutOfBoundsException{
        if(!isValidIndex(index)){
            throw new IndexOutOfBoundsException("Invalid index "+index);
        }
        return items[index];
    }

    private boolean isValidIndex(int index){
        if(index > size || index < 0){
            return false;
        }
        return true;
    }

    public void setAtIndex(int index, int element) throws IndexOutOfBoundsException{
        if(!isValidIndex(index)){
            throw new IndexOutOfBoundsException("Invalid Index "+index);
        }
        items[index] = element;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }
}
