package com.learning.leetcode.medium;

import java.util.HashMap;

public class TinyUrl {
	static HashMap<Integer, String> map = new HashMap<Integer, String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"arrayasdfasdf","arrayasdfasf"};
		for (String ar: arr){
			System.out.println(ar);
			int encode = encode(ar);
			System.out.println(encode);
			String decode = decode(encode);
			System.out.println(decode);
			System.out.println("--------------------");
		}

	}

	// Encodes a URL to a shortened URL.
	public static int encode(String longUrl) {
		int hash = longUrl.hashCode();
		map.put(hash, longUrl);
		return hash;
	}

	// Decodes a shortened URL to its original URL.
	public static String decode(int shortUrl) {
		return map.get(shortUrl);
	}

}
