package com.learning.leetcode.medium;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(binaryDivide(-2147483648,1));//-2147483648
			System.out.println(binaryDivide(-1,1));//-1
			System.out.println(binaryDivide(-2147483648,-1));//2147483647
			System.out.println(binaryDivide(-2147483648,-3));//715827882.6666667
			System.out.println(binaryDivide(972,5));//715827882.6666667
			//Excellent solution at https://stackoverflow.com/questions/5386377/division-without-using
	}
	
	 public static int divide(int dividend, int divisor) {
		 int sign = 1;
		 if ((dividend>=0 && divisor>=0) || (dividend<=0 && divisor<=0)) {
			 sign = 1;
		 }else {
			 sign = -1;
		 }
		 long ldividend =Math.abs((long)dividend);
		 long ldivisor =Math.abs((long)divisor);
		 long multiple = 0;
		 
		 if (ldivisor == 1) {
			multiple = ldividend;
		 }else {
			while (ldividend>=ldivisor) {
				long lsum = ldivisor;
				long lmultiple = 1;
				while (ldividend>=lsum) { //this to reduce the time exponentially 
					ldividend = ldividend - lsum;
					lsum = lsum + lsum;
					 multiple = multiple + lmultiple;
					 lmultiple = lmultiple + lmultiple;
				}
			 } 
		 }
		 multiple = multiple * sign;
		 if (multiple > Integer.MAX_VALUE) {
			 return Integer.MAX_VALUE;
		 }else if (multiple < Integer.MIN_VALUE) {
			 return Integer.MIN_VALUE;
		 }else {
			 return (int) multiple;
		 }
		 
	
	  }
	 
	 private static int binaryDivide(int dividend, int divisor) {
		    int current = 1;
		    int denom = divisor;
		    // This step is required to find the biggest current number which can be
		    // divided with the number safely.
		    while (denom <= dividend) {
		        current <<= 1;
		        denom <<= 1;
		    }
		    // Since we may have increased the denomitor more than dividend
		    // thus we need to go back one shift, and same would apply for current.
		    denom >>= 1;
		    current >>= 1;
		    int answer = 0;
		    // Now deal with the smaller number.
		    while (current != 0) {
		        if (dividend >= denom) {
		            dividend -= denom;
		            answer |= current;
		        }
		        current >>= 1;
		        denom >>= 1;
		    }
		    return answer;
		}

}
