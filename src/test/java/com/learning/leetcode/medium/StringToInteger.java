package com.learning.leetcode.medium;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringToInteger("-6147483648"));
	}

	public static int stringToInteger(String str) {
		int out = 0;
		boolean nNum = false;
		boolean nstarted = false;
		for (char c : str.toCharArray()) {
			if ('0' <= c && c <= '9') {
				int tempout = out * 10 + (c - '0');
				if (tempout/10 != out) {
					if (nNum) {
						return Integer.MIN_VALUE;
					}else {
						return Integer.MAX_VALUE;
					}
				}
				out = tempout;
				nstarted = true;
			} else if (!nstarted && (c == '-' || c == '+')) {
				nstarted = true;
				if (c == '-') {
					nNum = true;
				}
			} else if (!nstarted && c== ' ') {
				continue;
			}else if (nstarted){
				break;
			}else {
				return 0;
			}
		}

		if (nNum) {
			return out - 2 * out;
		} else {
			return out;
		}
	}

}
