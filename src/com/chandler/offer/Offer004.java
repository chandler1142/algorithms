package com.chandler.offer;

/**
 * 输入一个整数数组，数组中只有一个数字出现了1次，其他的数字出现了3次，请找出这个出现一次的数字
 */
public class Offer004 {

    public static void main(String[] args) {
        int[] array = new int[]{
                0, 1, 0, 1, 0, 1, 103
        };
        System.out.println(findNumber(array));
    }

    public static int findNumber(int[] inputs) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int temp_sum = 0;
            for (int j = 0; j < inputs.length; j++) {
                int temp = inputs[j];
                int mask = 1 << i;
                temp_sum += temp & mask;
            }
            if (temp_sum % 3 != 0) {
                result = result + (1 << i);
            }
        }

        return result;
    }

}
