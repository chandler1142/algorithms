package com.chandler.offer;

import java.util.Arrays;

/**
 * 输入一个数字，返回一个数组，数组中包含从0到这个数字，每个数字的二进制形式包含1的个数
 */
public class Offer003 {

    public static void main(String[] args) {
        Arrays.stream(countBits(5)).forEach(System.out::println);
    }

    public static int[] countBits(int num) {
        int[] results = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            results[i] = results[i >> 1] + (i & 1);
        }
        return results;
    }
}
