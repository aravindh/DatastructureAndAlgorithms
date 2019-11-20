package com.aravindh.dsa.problemSolving;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aravindhravindran on 19/6/17.
 */
public class RotateMatrix90Degree {
    public void rotate(List<List<Integer>> a, boolean isClockwise) {
        transpose(a);
        if(isClockwise){
            rotateColumns(a);
        }else{
            rotateRows(a);
        }
    }

    private void rotateRows(List<List<Integer>> a) {
        int n = a.size();
        for(int i = 0; i < n/2; i++){
            int start = i;
            int end = n-1-i;
            List<Integer> temp  = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
        }
    }

    private void transpose(List<List<Integer>> a) {
        int n = a.size();
        for(int i =0 ; i < n; i++){
            for(int j =i; j < n; j++){
                swap(a, i, j, j, i);
            }
        }
    }

    private void rotateColumns(List<List<Integer>> a) {
        int n = a.size();
        for(int j = 0; j < n/2; j++){
            int start = j;
            int end = n-1-j;
            for(int i =0; i < n; i++){
                swap(a, i, start, i, end);
            }
        }
    }

    private void swap(List<List<Integer>> a, int srcRow, int srcCol, int targetRow, int targetCol) {
        int temp = a.get(srcRow).get(srcCol);
        a.get(srcRow).set(srcCol, a.get(targetRow).get(targetCol));
        a.get(targetRow).set(targetCol, temp);
    }

    /*
    * 1 2 3
    * 4 5 6
    * 7 8 9
    *
    * 1 4 7
    * 2 5 8
    * 3 6 9
    *
    * 7 4 1
    * 8 5 2
    * 9 6 3
    *
    * */
}
