package com.aravindh.dsa.problemSolving;

public class MatrixUniquePathsRobot {
    int[][] paths = null;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        paths = new int[r][c];
        for(int i =0 ; i< r; i++){
            for(int j =0 ; j<c; j++){
                paths[i][j] = -1;
            }
        }
        return getCountOfPaths(obstacleGrid, 0, 0, r, c);
    }

    private int getCountOfPaths(int[][] obstacleGrid, int i, int j, int r, int c){
        //System.out.println("i "+i+" j "+j);
        if(i==(r-1) && j == (c-1)){
            if(obstacleGrid[i][j] == 1){
                return 0;
            }else {
                return 1;
            }
        }
        if(obstacleGrid[i][j] == 1){
            return 0;
        }
        if(paths[i][j] != -1){
            return paths[i][j];
        }
        int rightCount =-1;
        if(isValidMove(i, j+1, r, c, obstacleGrid)){
            rightCount = getCountOfPaths(obstacleGrid, i, j+1, r,c);
            System.out.println("right i "+i+" j "+j+" rc "+rightCount);
        }
        int downCount = -1;
        if(isValidMove(i+1, j, r, c, obstacleGrid)){
            downCount = getCountOfPaths(obstacleGrid, i+1, j, r,c);
            System.out.println("down i "+i+" j "+j+" dc "+downCount);

        }
        if(rightCount == -1 && downCount == -1){
            return -1;
        }
        int pathCount = 0;
        if(rightCount != -1){
            pathCount = pathCount+rightCount;
        }
        if(downCount != -1){
            pathCount = pathCount+downCount;
        }
        paths[i][j] = pathCount;
        return pathCount;
    }

    private boolean isValidMove(int i, int j, int r, int c, int[][] mat){
        if(i >= r || j >= c || mat[i][j] ==1){
            return false;
        }
        return true;
    }
}
