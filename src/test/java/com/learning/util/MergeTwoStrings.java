package com.learning.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MergeTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(mergeStrings("abe","def"));
//		String[] arr = {"Alex","Michael",
//				"Harry",
//				"Dave",
//				"Michael",
//				"Victor",
//				"Harry",
//				"Alex",
//				"Mary",
//				"Mary"} ;
//		System.out.println(electionWinner(arr));
		System.out.println(missingWords("I am using hackerrank to improve programming", "am hackerrank to improve"));
	}
	
	 static String mergeStrings(String a, String b) {
	        StringBuilder sb = new StringBuilder();
	        int l = Math.min(a.length(), b.length());
	        for (int i=0;i<l;i++){
	            sb = sb.append(a.charAt(i));
	            sb = sb.append(b.charAt(i));
	        }
	        for (int i=l;i<a.length();i++){
	            sb = sb.append(a.charAt(i));
	        }
	        for (int i=l;i<b.length();i++){
	            sb= sb.append(b.charAt(i));
	        }
	        return sb.toString();
	    }
	 
	 static String electionWinner(String[] votes) {

		    HashMap<String, Integer> map = new HashMap<String, Integer>();
		    int maxVotes = 0;
		    for (String a: votes){
		        if (map.containsKey(a)){
		            int voteCount = map.get(a) + 1;
		            map.put(a, voteCount);
		            if (voteCount>maxVotes){
		                maxVotes = maxVotes+1;
		            }
		        }else{
		           map.put(a, 1); 
		        }
		    }
		        ArrayList<String> voters = new ArrayList<String>();
		        for (String key:map.keySet()){
		            if (map.get(key)==maxVotes){
		                voters.add(key);
		            }
		        }
		        Collections.sort(voters);
		        if (voters.size()>0){
		          return voters.get(0);  
		        }
		        return null;
		    }

	 static List<String> missingWords(String s, String t) {
	        String[] ss = s.split(" ");
	        String[] st = t.split(" ");
	        ArrayList<String> output = new ArrayList<String>();
	        int j = 0;
	        for (int i=0;i <ss.length;i++){
	        	if (j<st.length) {
	        		output.add(ss[i]);
	        	}else if (!ss[i].equals(st[j])){
	            	 output.add(ss[i]);
	            }else{
	                j++;
	            }
	        }
	        return output;
	    }
}
