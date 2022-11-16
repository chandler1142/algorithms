package com.chandler.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组中和为0的3个数字
 * 输入一个数组，找出数组中所有和为0的3个数字的三元组
 * 返回值不得包含重复的三元组。例如，在数组中[-1, 0, 1, 2, -1, -4]中有两个三元组的和为0, [-1, 0, 1] [-1, -1, 2]
 */
public class Offer007 {

    public static void main(String[] args) {
        int[] inputs = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(inputs));
    }

    public static List<List<Integer>> threeSum(int[] inputs) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Arrays.sort(inputs);
        int i = 0;
        while (i < inputs.length - 2) {
            twoSum(inputs, i, results);
            int temp = inputs[i];
            while (inputs[i] == temp && i < inputs.length) {
                ++i;
            }
        }

        return results;
    }

    public static void twoSum(int[] inputs, int i, List<List<Integer>> results) {
        int j = i + 1;
        int k = inputs.length - 1;
        while (j < k) {
            if (inputs[i] + inputs[j] + inputs[k] == 0) {
                results.add(Arrays.asList(inputs[i], inputs[j], inputs[k]));
                int temp = inputs[j];
                while (inputs[j] == temp && j < k) {
                    j++;
                }
            } else if (inputs[i] + inputs[j] + inputs[k] < 0) {
                j++;
            } else {
                k--;
            }
        }
    }

}
