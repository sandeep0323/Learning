package com.learning.hackersrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
            int distance = x2 - x1;
            int relativeSpeed = v1 - v2;
            if (v1==v2){
                if (x1==x2){
                    return "YES";
                }else{
                    return "NO";
                }
            }
            int canMeet = distance % relativeSpeed;
            if (canMeet == 0 && ((distance>0 && relativeSpeed>0)||(distance<0 && relativeSpeed<0))){
                
                return "YES";
            }
        return "NO";
    }
    
    

   
    public static void main(String[] args) throws IOException {
   
        String result = kangaroo(0,2, 5, 3);
        System.out.println(result);
    }
}
