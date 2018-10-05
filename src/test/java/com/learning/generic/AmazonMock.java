package com.learning.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * colony of 8 houses is a cell
 * 1 - > active
 * 0 -> inactive
 * adjacent cells of edges can be considered as 0 all days
 * for next day state of house is inactive, if both adjacent are either active or inactive.
 * return the state after n days
 * @author z993415
 *
 */
public class AmazonMock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,0,0,0,0,1,0,0};
		
	}
	
	public static List<Object> solution(int[] states, int days){
		ArrayList<Integer> a = new ArrayList<Integer>();
		int l = states.length;
		int[] output = new int[l + 2];
		output[0] = 0;
		output[l+1] = 0;
		for (int i =0 ; i<l; i++) {
			output[i+1] = states[i]; 
		}
		while (days > 0) {
			output = util(output);
			days--;
		} 
		output =  Arrays.copyOfRange(output, 1, l + 2);  
		return  Arrays.stream(output).boxed().collect(Collectors.toList());
	}
	
	public static int[] util(int[] states) {
		int[] output = new int[states.length];
		for (int i = 1; i< states.length -1; i++) {
			if (states[i-1] == states[i+1]) {
				output[i] = 0;
			}else {
				output[i] = 1;
			}
		}
		return output;
	}
	

}
