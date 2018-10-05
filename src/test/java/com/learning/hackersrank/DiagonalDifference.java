package com.learning.hackersrank;
import java.io.IOException;

public class DiagonalDifference {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        int size = a[0].length - 1;
        int ad = 0;
        int bd = 0;
        for (int i =0; i<= size; i++){
        	System.out.println(a[i][i]+":"+a[size - i][i]);
            ad = ad +a[i][i];
            bd= bd + a[size - i][i];
        }
        System.out.println("ad:" + ad);
        System.out.println("bd:" + bd);
       return Math.abs(ad -  bd);
    }

   
    public static void main(String[] args) throws IOException {
    	int[][] a = {{11,2,4},{4,5,6},{10,8,-12}};
    	diagonalDifference(a);
     }
}
