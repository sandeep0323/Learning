package com.learning.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import com.learning.util.Common;

/**
 * https://leetcode.com/problems/exclusive-time-of-functions/description/
 * 
 * @author z993415
 *
 */
public class ExclusiveTimeOfFunctions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //String[] logs = {"0:start:0", "1:start:2", "1:end:5", "0:end:6"};
		String[] logs = {"0:start:0","0:start:2","0:end:5","1:start:7","1:end:7","0:end:8"};
		//String[] logs = { "0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7" };
		Common.printArray(exclusiveTime(2, Arrays.asList(logs)));
	}

	// This is time taking
	public static int[] exclusiveTime(int n, List<String> logs) {
		int[] output = new int[n];
		Arrays.fill(output, 0);
		Stack[] stacks = new Stack[n];
		for (int i = 0; i < n; ++i)
			stacks[i] = new Stack();

		for (String str : logs) {
			String[] sp = str.split(":");
			int fun_id = Integer.parseInt(sp[0]);
			String proc = sp[1];
			int time = Integer.parseInt(sp[2]);
			if (proc.equals("start")) {
				if (stacks[fun_id].isEmpty()) {
					stacks[fun_id].push(time);
				}
				// Other functions should close here
				for (int i = 0; i < n; i++) {
					if (i != fun_id) {
						if (!stacks[i].isEmpty()) {
							output[i] = output[i] + time - (int) stacks[i].pop();
						}

					}
				}
			} else if (proc.equals("end")) {
				int temp = time;
				if (!stacks[fun_id].isEmpty()) {
					temp = (int) stacks[fun_id].pop();
				}
				output[fun_id] = output[fun_id] + time - temp + 1;

			}
		}
		return output;
	}

}
