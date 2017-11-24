package com.aravindh.dsa.linear;

/**
 * Created by aravindhravindran on 21/11/17.
 */
public class MinHeap {
    protected int[] items;
    protected int size=0;
    private final int DEFAULT_SIZE = 10;

    public int extractMin() throws IndexOutOfBoundsException{
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Peek on empty heap");
        }
        int temp = items[0];
        items[0] = items[size-1];
        size--;
        heapDown(0);
        return temp;
    }

    public int peek() throws IndexOutOfBoundsException{
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Peek on empty heap");
        }
        return items[0];
    }

    public void add(int element){
        if(items == null){
            items = new int[DEFAULT_SIZE];
        }
        if(size >= items.length){
            growArray();
        }
        items[size++] = element;
        heapUp(size-1);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else {
            return false;
        }
    }

    private void heapUp(int index) {
        while(index > 0){
            int parentIndex = getParentIndex(index);
            if(items[parentIndex] > items[index]){
                swap(parentIndex, index);
                index = parentIndex;
            }else{
                break;
            }
        }
    }

    private int getParentIndex(int childIndex) {
        return (childIndex-1)/2;
    }

    protected void heapDown(int index) {
        while(hasLeftChild(index)){
            int minIndex = getLeftChild(index);
            if(hasRightChild(index) && items[minIndex] > items[getRightChild(index)]){
                minIndex = getRightChild(index);
            }
            if(items[minIndex] < items[index]){
                swap(minIndex, index);
                index = minIndex;
            }else{
                break;
            }
        }
    }

    private boolean hasRightChild(int index) {
        if(getRightChild(index) < size){
            return true;
        }else{
            return false;
        }
    }

    private boolean hasLeftChild(int index) {
        if(getLeftChild(index) < size){
            return true;
        }else {
            return false;
        }
    }

    private int getRightChild(int index) {
        return (index*2)+2;
    }

    private int getLeftChild(int index) {
        return (index*2)+1;
    }

    private void swap(int srcIndex, int targetindex) {
        int temp = items[srcIndex];
        items[srcIndex] = items[targetindex];
        items[targetindex] = temp;
    }

    private void growArray() {
        int[] newItems = new int[items.length*2];
        for(int i=0; i < items.length; i++){
            newItems[i] = items[i];
        }
        items = newItems;
    }
}
