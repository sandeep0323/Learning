package com.learning.generic;

public class gcd {

	static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
        int a = 20, b = 10; 
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b)); 
    } 

}
