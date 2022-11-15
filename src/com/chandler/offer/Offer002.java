package com.chandler.offer;

/**
 * 实现二进制字符串的加法
 */
public class Offer002 {

    public static void main(String[] args) {
        System.out.println(binaryPlus("101", "100"));
    }

    public static String binaryPlus(String input1, String input2) {
        StringBuffer result = new StringBuffer();
        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int digit1 = i >= 0 ? input1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? input2.charAt(j--) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            result.append(sum);
        }
        if(carry == 1) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

}
