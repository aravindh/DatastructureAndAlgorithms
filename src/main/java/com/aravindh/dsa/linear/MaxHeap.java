package com.aravindh.dsa.linear;

/**
 * Created by aravindhravindran on 21/11/17.
 */
public class MaxHeap {
    private int[] items;
    private int size=0;
    private final int DEFAULT_SIZE = 10;

    public int extractMax() throws IndexOutOfBoundsException{
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
        int parentIndex = getParentIndex(index);
        while(parentIndex >= 0 && items[parentIndex] < items[index]){
            swap(parentIndex, index);
            index = parentIndex;
            parentIndex = getParentIndex(index);
        }
    }

    private void heapDown(int parentIndex) {
        while(parentIndex < size){
            int leftChildIndex = getLeftChild(parentIndex);
            int rightChildIndex = getRightChild(parentIndex);

            if(leftChildIndex >= size && rightChildIndex >= size){
                break;
            }

            if(leftChildIndex < size && rightChildIndex < size){
                int leftChild = items[leftChildIndex];
                int rightChild = items[rightChildIndex];
                if(items[parentIndex] < Math.max(leftChild, rightChild)){
                    if(leftChild > rightChild){
                        swap(parentIndex, leftChildIndex);
                        parentIndex = leftChildIndex;
                    }else {
                        swap(parentIndex, rightChildIndex);
                        parentIndex = rightChildIndex;
                    }
                }else {
                    break;
                }
            }else{
                if(leftChildIndex < size){
                    if(items[parentIndex] < items[leftChildIndex]){
                        swap(parentIndex, leftChildIndex);
                        parentIndex = leftChildIndex;
                    }else{
                        break;
                    }
                }else{
                    if(items[parentIndex] < items[rightChildIndex]){
                        swap(parentIndex, rightChildIndex);
                        parentIndex = rightChildIndex;
                    }else{
                        break;
                    }
                }
            }
        }
    }

    private void swap(int sourceIndex, int targetIndex) {
        int temp = items[sourceIndex];
        items[sourceIndex] = items[targetIndex];
        items[targetIndex] = temp;
    }

    private void growArray() {
        int[] newArray = new int[items.length*2];
        for(int i=0; i < items.length; i++){
            newArray[i] = items[i];
        }
        items = newArray;
    }

    private int getRightChild(int parentIndex) {
        return (2*parentIndex)+2;
    }

    private int getLeftChild(int parentIndex) {
        return (2*parentIndex)+1;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex-1)/2;
    }

}
