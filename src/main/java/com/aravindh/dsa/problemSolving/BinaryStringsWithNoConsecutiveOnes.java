package com.aravindh.dsa.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class BinaryStringsWithNoConsecutiveOnes {

    private Map<Integer, Integer> countEndsWith0 = new HashMap<>();
    private Map<Integer, Integer> countEndsWith1 = new HashMap<>();
    public int getNumberOfStrings(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            countEndsWith0.put(1,1);
            countEndsWith1.put(1,1);
            return 2;
        }
        if(!countEndsWith0.containsKey(n)){
            getNumberOfStrings(n-1);
            int stringsEndsWith0 = countEndsWith0.get(n-1);
            int stringsEndsWith1 = countEndsWith1.get(n-1);

            int totalStrings = stringsEndsWith0 + stringsEndsWith1;
            countEndsWith0.put(n, totalStrings);
            countEndsWith1.put(n, stringsEndsWith0);
        }
        return countEndsWith0.get(n)+countEndsWith1.get(n);
    }
}
