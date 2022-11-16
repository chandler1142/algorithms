package com.chandler.offer;

/**
 * 输入一个递增的数组和一个值k，在数组中找出两个和为k的数字并返回他们的下标
 * 假设数组中只有一对符合条件的数字
 */
public class Offer006 {

    public static void main(String[] args) {
        int[] inputs = {1, 2, 4, 6, 8 , 10};
        System.out.println(getTwoSum(inputs, 8));
    }

    public static int[] getTwoSum(int[] inputs, int k) {
        int first = 0;
        int last = inputs.length - 1;
        while (first < last && inputs[first] + inputs[last] != k) {
            if (inputs[first] + inputs[last] > k) {
                last--;
            } else {
                first++;
            }
        }

        System.out.println(first);
        System.out.println(last);
        return new int[]{first, last};
    }


}
