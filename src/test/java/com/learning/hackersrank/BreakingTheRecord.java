package com.learning.hackersrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 * @author z993415
 *
 */
public class BreakingTheRecord {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int max = 0;
        int min = 0;
        int max_num = 0;
        int min_num = 0;
        if (scores.length>=1){
            max = scores[0];
            min = scores[0];
            for (int i = 1; i <scores.length;i++){
                if (scores[i]>max){
                    max_num++;
                    max = scores[i];
                }
                if (scores[i]<min){
                    min_num++;
                    min = scores[i];
                }
            }
        }
        
        int[] output = {max_num, min_num};
        return output;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      // int[] scores = {10 ,5, 20, 20, 4, 5, 2, 25, 1};
    	 int[] scores = {3, 4, 21, 36, 10, 28, 35, 5 ,24 ,42};
        int[] result = breakingRecords(scores);
        System.out.println(result[0] + "-"+ result[1]);

       
    }
}
