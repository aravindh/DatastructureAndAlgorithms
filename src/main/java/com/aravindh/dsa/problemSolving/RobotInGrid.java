package com.aravindh.dsa.problemSolving;


import java.util.HashMap;
import java.util.List;

public class RobotInGrid {

    HashMap<String, Boolean> visitedPoints = new HashMap<>();

    public boolean findPaths(List<List<Boolean>> matrix, int currRow, int currCol){
        if(currRow < 0 || currCol < 0){
            return false;
        }
        String key = String.valueOf(currRow) + String.valueOf(currCol);
        if(visitedPoints.containsKey(key)){
            return visitedPoints.get(key);
        }
        if(currRow == 0 && currCol == 0){
            visitedPoints.put(key, Boolean.TRUE);
            return true;
        }
        //off limits cell
        if(!matrix.get(currRow).get(currCol)){
            return false;
        }
        boolean moveUp = findPaths(matrix, currRow-1, currCol);
        boolean moveLeft = findPaths(matrix, currRow, currCol-1);
        if(moveUp || moveLeft){
            visitedPoints.put(key, Boolean.TRUE);
            return true;
        }else{
            visitedPoints.put(key, Boolean.FALSE);
            return false;
        }


    }
}
