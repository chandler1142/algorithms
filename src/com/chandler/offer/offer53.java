package com.chandler.offer;

/**
 *	正则表达式的匹配 "." ,"*"
 *	 
 * '.' 表示任意一个字符，'*'表示它前面的字符可以出现任意次数（含0次）
 * 
 */
public class offer53 {

	
	static boolean match(char[] str,char[] pattern) {
		if( str == null || pattern == null) return false;
		
		return matchCore(str,0,pattern,0);
	}
	
	static boolean matchCore(char[] str, int index1,char[] pattern,int index2) {
		
		if( str.length  == index1  && pattern.length == index2 ) return true;
		
		//if(index1 >= str.length || index2 >= pattern.length) return false;
		
		if( str.length  >  index1 && pattern.length == index2  ) return false;
		
		if( index2 < pattern.length-1 && pattern[index2+1] == '*'){
			
			if(str[index1] == pattern[index2] || (index1 < str.length  && pattern[index2] == '.')) {
				return matchCore(str,index1+1,pattern,index2+2)
						|| matchCore(str,index1+1,pattern,index2)
						|| matchCore(str,index1,pattern,index2+2);
			} else {
				return matchCore(str,index1,pattern,index2+2);
			}
		}
		if(index1 < str.length && str[index1] == pattern[index2] || (pattern[index2] == '.' && index1 < str.length)) {
			return matchCore(str,index1+1,pattern,index2+1);
		}
		return false;
	}
	public static void main(String[] args) {
		String a = "a";
		String pattern1 = "a.a";
		String pattern2 = ".";
		
		System.out.println(match(a.toCharArray(), pattern2.toCharArray()));
		//System.out.println(match(a.toCharArray(), pattern2.toCharArray()));
	}

}
