package com.aravindh.dsa.problemSolving;

import java.util.HashMap;

public class TripleStep {
    HashMap<Integer, Integer> numberOfWays= null;

    public TripleStep() {
        this.numberOfWays = new HashMap<>();
        numberOfWays.put(0, 0);
        numberOfWays.put(1, 1);
        numberOfWays.put(2, 2);
        numberOfWays.put(3, 4);
    }

    public int getNumberOfWays(int n){
        if(numberOfWays.containsKey(n)){
            return numberOfWays.get(n);
        }
        int count = getNumberOfWays(n - 1) + getNumberOfWays(n - 2) + getNumberOfWays(n - 3);
        numberOfWays.put(n, count);
        return count;
    }
}
