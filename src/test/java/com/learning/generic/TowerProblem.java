package com.learning.generic;

public class TowerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4; // Number of disks 
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods 
	}
	
	public static void towerOfHanoi(int n, char from, char to, char aux) {
		
		if (n == 1) {
			System.out.println("Move disk 1 from rod " +  from + " to rod " + to); 
            return;
		}
		towerOfHanoi(n-1, from, aux, to);
		System.out.println("Move disk " + n + " from rod " +  from + " to rod " + to);
		towerOfHanoi(n-1, aux, to, from);
		
	}

}
