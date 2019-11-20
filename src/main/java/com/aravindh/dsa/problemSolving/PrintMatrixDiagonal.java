package com.aravindh.dsa.problemSolving;

public class PrintMatrixDiagonal {

    public int[] findDiagonalOrder(int[][] matrix) {

        int i = 0;
        int j = 0;

        int m = matrix.length;
        int n = matrix[0].length;

        int d = 0;
        int[] result = new int[m*n];
        int idx = 0;
        System.out.println("start m "+m+" n "+n );
        while(!(i == (m-1) && j == (n-1))){
            //fwd
            if(d%2 == 0){
                System.out.println("Fwd i "+i+" j "+j );
                for(; i >=0 && j < n; i--,j++){
                    result[idx++] = matrix[i][j];
                }
                if(i <= 0 && j< n)
                    i++;
                else
                    j--;
                System.out.println("Rev Next i "+i+" j "+j );
            }
            //rev
            else{
                System.out.println("Rev i "+i+" j "+j );
                for(; i <m && j >= 0; i++,j--){
                    result[idx++] = matrix[i][j];
                }
                if(j <= 0 && i < m){
                    j++;
                }else{
                    i--;
                }
                System.out.println("Next Fwd i "+i+" j "+j );
            }
            d++;
        }
        result[idx] = matrix[m-1][n-1];
        return result;

    }
}
