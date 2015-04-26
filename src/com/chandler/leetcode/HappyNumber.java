package com.chandler.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Write an algorithm to determine if a number is "happy".
 * 
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 * 
 * Example: 19 is a happy number
 * 
 * 12 + 92 = 82 82 + 22 = 68 62 + 82 = 100 12 + 02 + 02 = 1
 */
public class HappyNumber {

	public static boolean isHappy(int n) {
		if (n > 0) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(n);
			int count = 0;
			while (n != 1) {
				while (n > 0) {
					count += Math.pow(n % 10, 2);
					n = n / 10;
				}
				n = count;
				count = 0;
				//System.out.println(n);
				if (list.contains(n)) {
					return false;
				} else {
					list.add(n);
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		isHappy(2);
		// System.out.println(Math.pow(2, 3));
	}

}
