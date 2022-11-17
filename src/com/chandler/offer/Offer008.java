package com.chandler.offer;

/**
 * 和大于或等于K的最短子数组
 * 输入一个正整数组成的数组和一个正整数K,求数组中和大于或等于K的连续子数组的最短长度是多少？
 * 如果不存在所有数字之和大于或等于k的子数组, 则返回0
 * 例如, 输入数组[5, 1, 4, 4, 2], k的值为7,和大于或等于7的最短连续子数组是[4, 4],因此输出长度为2
 */
public class Offer008 {

    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 4, 4, 2};
        System.out.println(getShortestArray(array, 7));
    }

    public static int getShortestArray(int[] inputs, int k) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < inputs.length; right++) {
            sum += inputs[right];
            while (left <= right && sum >= k) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= inputs[left++];
            }
        }

        return minLen == Integer.MAX_VALUE?0:minLen;
    }


}
