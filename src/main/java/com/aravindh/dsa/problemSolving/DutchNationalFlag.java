package com.aravindh.dsa.problemSolving;

import java.util.List;

/*
* Segregate 0,1 and 2's in given array
* */

public class DutchNationalFlag {

    public void segregate(List<Integer> numbers){
        if(numbers == null || numbers.isEmpty()){
            return;
        }
        int lo = 0;
        int mid = 0;
        int hi = numbers.size() -1;
        while(mid <= hi){
            int curr = numbers.get(mid);
            switch (curr){
                case 0:{
                    swap(lo, mid, numbers);
                    lo++;
                    mid++;
                    break;
                }case 1:{
                    mid++;
                    break;
                }case 2:{
                    swap(mid, hi, numbers);
                    //mid++;
                    hi--;
                    break;
                }
            }
        }
    }

    private void swap(int lo, int mid, List<Integer> numbers) {
        int temp = numbers.get(lo);
        numbers.set(lo, numbers.get(mid));
        numbers.set(mid, temp);
    }
}
