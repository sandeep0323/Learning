package com.learning.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;

public class TaskScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] tasks = { 'A', 'A', 'A','A','A','A','B', 'B', 'B' ,'B','C','C','C','C','D','D'};
		int n = 2;
		System.out.println(leastInterval(tasks, n));
	}

	public static int leastInterval(char[] tasks, int n) {
		int[] map = new int[26];
		for (char c : tasks)
			map[c - 'A']++;
		Arrays.sort(map);
		int max_val = map[25] - 1, idle_slots = max_val * n;
		for (int i = 24; i >= 0 && map[i] > 0; i--) {
			idle_slots -= Math.min(map[i], max_val);
		}
		return idle_slots > 0 ? idle_slots + tasks.length : tasks.length;
	}

	public static void printArray(int[] arr) {
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + " ");
		}

	}
}
