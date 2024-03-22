package org.example;

public class Tehtava4 {
    public static int[] BiggestIndex(int[][] matrix) {
        int max =matrix[0][0];
        int[] index={0,0};

        for (int i =0; i< matrix.length; i++) {
            for (int j =0; j< matrix[i].length; j++) {
                if (matrix[i][j]>max) {
                    max =matrix[i][j];
                    index[0] =i;
                    index[1] =j;
                }
            }
        }
    return index;
    }
}
