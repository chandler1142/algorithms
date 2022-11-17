package com.chandler.offer;

/**
 * 和小于或者等于K的最长子数组
 * 输入一个正整数组成的数组和一个正整数K,求数组中和小于或者等于K的连续子数组的最长长度是多少？
 * 如果不存在所有数字之和大于或等于k的子数组, 则返回0
 * 例如, 输入数组[7, 1, 4, 2, 1, 5], k的值为7,和小于或者等于7的最长连续子数组是[4, 2, 1],因此输出长度为3
 */
public class Offer008_extend01 {

    public static void main(String[] args) {
        int[] inputs = new int[]{7, 1, 1, 2, 1, 5};
        System.out.println(getLongestArray(inputs, 7));
    }

    public static int getLongestArray(int[] inputs, int k) {
        int left = 0;
        int sum = 0;
        int maxLen = Integer.MIN_VALUE;
        for (int right = 0; right < inputs.length; right++) {
            sum += inputs[right];
            if (sum > k && left <= right) {
                sum -= inputs[left++];
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }

}
