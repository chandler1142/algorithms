package com.chandler.offer;

/**
 * 长度为n 的数组里的所有数字都在0到n-1的范围内，数组中有些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。找出数组中任意一个重复的数字。 ｛2，3，1，0，2，5，3｝ 返回2或者3
 * 
 * */
public class offer51 {
	
	/*
	 * 空间复杂度为1
	 */
	public static int solution1(int[] array, int n) {
		
		if (array == null || n <= 0)
			return -1;

		for (int i = 0; i < n; i++) {
			if (array[i] > n - 1)
				return -1;
		}
		
		int duplication = -1;

		for (int i = 0; i < n; ++i) {

			while (i != array[i]) {
				if (array[i] == array[array[i]]) {
					duplication = array[i];
					return duplication;
				}
				int temp = array[i];
				array[i] = array[temp];
				array[temp] = temp;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {2,3,1,0,2,5,3};
		int duplication = solution1(array,7);
		System.out.println(duplication);
	}
}
