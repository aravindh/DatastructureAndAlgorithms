package com.aravindh.dsa.problemSolving;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given a list of non negative numbers, form the single largest number by rearranging the numbers.
 *
 * i/p: {54, 546, 548, 60}
 * o/p: 6054854654
 * Created by aravindhravindran on 25/6/17.
 */
public class MaxNumberFromListOfNumbers {

    private int compareDigits(Integer n1, Integer n2){
        String XY = n1.toString()+n2.toString();
        String YX = n2.toString()+n1.toString();

        if(XY.compareTo(YX) > 0){
            return -1;
        }else{
            return 1;
        }
    }

    public String getMaxNumber(List<Integer> numbers){
        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer integer, Integer t1) {
                return compareDigits(integer, t1);
            }
        });
        StringBuilder builder = new StringBuilder();
        for(Integer num : numbers){
            builder.append(num.toString());
        }
        return builder.toString();
    }
}
