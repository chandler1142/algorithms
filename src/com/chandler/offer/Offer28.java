package com.chandler.offer;

import java.util.ArrayList;
import java.util.List;

public class Offer28 {

	public static void permutation(String str) {
		
		if(str.length() <= 0) return;
		int index = 0;
		permutation(new StringBuffer(str),index);
	}
	public static void permutation(StringBuffer str,int index) {
		
		if(index == str.length()-1){
			System.out.println(str);
			return;
		} else {
			for(int i=index;i<str.length();i++) {
				char p = str.charAt(i);
				char temp = str.charAt(index);
				str.setCharAt(i, temp);
				str.setCharAt(index, p);
				
				permutation(str,index+1);
				
				p = str.charAt(i);
				temp = str.charAt(index);
				str.setCharAt(i, temp);
				str.setCharAt(index, p);
			}
		}
	}
	
	public static void combination(String str) {
		int i = 1 ,length = str.length();
		
		//i表示要排列的字符串长度
		for(;i<=str.length();i++) {
			combination(str,i,new StringBuffer());
		}
	}
	public static void combination(String str,int index,StringBuffer result) {
		
		if(index == 0) {
			System.out.println(result);
			return;
		}
		if(str == null || str.equals("")) return;
		
		result.append(str.charAt(0));
		combination(str.length()>1?str.substring(1):"",index-1,result);
		result.deleteCharAt(result.length()-1);
		combination(str.length()>1?str.substring(1):"",index,result);
	}
	public static void main(String[] args) {
		String s = "abcd";
		permutation(s);
	}

}
