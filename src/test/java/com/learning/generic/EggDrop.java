package com.learning.generic;

public class EggDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2, k = 50; 
        System.out.println("Minimum number of trials in worst case with "+n+"  eggs and "+k+ 
                 " floors is "+eggDrop(n, k)); 

	}
	public static int eggDrop(int n, int k) {
	int[][] eggfloors = new int[n+1][k+1];	
	//for floor = 0 and floor =1
	for (int i=1;i<=n;i++) {
		eggfloors[i][1] =1;
		eggfloors[i][0] =0;
	}
	// If n = 1, then return ith floor
	for (int i=1;i<=k;i++) {
		eggfloors[1][i] = i;
	}
	for (int i=2;i<=n;i++) {
		for(int j=2;j<=k;j++) {
			eggfloors[i][j] = Integer.MAX_VALUE;
			for (int l=1;l<=j;l++) {
				int res = 1 + Math.max(eggfloors[i-1][l - 1],  eggfloors[i][j-l]);
				if (res<eggfloors[i][j]){
					eggfloors[i][j] = res;
				}
			}
		}
	}
		
		return eggfloors[n][k];
	}
}
