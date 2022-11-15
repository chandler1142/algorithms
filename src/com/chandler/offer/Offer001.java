package com.chandler.offer;

/**
 * 输入两个整型变量，利用+/-法来实现求商
 */
public class Offer001 {


    public static void main(String[] args) {
        System.out.println(divide(17, 2));
    }

    public static int divide(int dividend, int divisor) {
        int result = 0;

        while (dividend > divisor) {
            int temp_value = divisor;
            int count = 1;
            while(dividend >= temp_value * 2) {
                temp_value *= 2;
                count *= 2;
            }
            result += count;
            dividend -= temp_value;
        }

        return result;
    }


}
