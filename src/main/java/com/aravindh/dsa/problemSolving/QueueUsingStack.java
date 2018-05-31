package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.linear.Stack;

import java.util.EmptyStackException;

/*
* Implementing Queue behaviour using two stacks
*
* Simplest Approach will be to keep pushing in to one stack, when dequeue need to be done reverse the elements using another stack,
* pop the top element and push it back again to old stack. But this approach keeps pushing and popping for each peek or pop.
*
* Optimized version is this using same two stack is to maintain two stacks, one for pushing and another for pop, when ever pop stack becomes
* empty push all the elements from pushing stack to popping stack
* */
public class QueueUsingStack {
    private Stack stackWithOldestOnTop;
    private Stack stackWithNewestOnTop;

    public QueueUsingStack() {
        stackWithNewestOnTop = new Stack();
        stackWithOldestOnTop = new Stack();
    }

    public void enqueue(int element){
        stackWithNewestOnTop.push(element);
    }

    private void shiftItemsFromNewStackToOldStack(){
        while(!stackWithNewestOnTop.isEmpty()){
            stackWithOldestOnTop.push(stackWithNewestOnTop.pop());
        }
    }

    public int dequeue() throws EmptyStackException {
        if(stackWithOldestOnTop.isEmpty()){
            shiftItemsFromNewStackToOldStack();
        }
        return stackWithOldestOnTop.pop();
    }

    public int peek(){
        if(stackWithOldestOnTop.isEmpty()){
            shiftItemsFromNewStackToOldStack();
        }
        return stackWithOldestOnTop.peek();
    }



}

