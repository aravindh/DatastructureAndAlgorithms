package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.linear.Stack;

public class StackMin extends Stack {
    private Stack minStack;

    @Override
    public void push(int data){
        super.push(data);
        if(minStack == null){
            minStack = new Stack();
            minStack.push(data);
        }else{
            if(data < minStack.peek()){
                minStack.push(data);
            }
        }
    }

    @Override
    public int pop(){
        final int result = super.pop();
        if(minStack == null || minStack.isEmpty()){
            return result;
        }
        if(result == minStack.peek()){
            minStack.pop();
        }
        return result;
    }

    public Integer getMin(){
        if(minStack == null || minStack.isEmpty()){
            return null;
        }
        return minStack.peek();
    }
}
