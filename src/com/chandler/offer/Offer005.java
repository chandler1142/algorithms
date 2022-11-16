package com.chandler.offer;

/**
 * 输入一个字符串数组words, 计算不包含相同的两个字符串的长度乘机的最大值。如果所有的字符串都包含至少一个相同字符，返回0.
 * 假设字符串只包含英文小写字母
 * 例如 输入["abcw", "foo", "bar", "fxyz", "abcdef"], 返回 16， 因为abcw和fxyz没有相同字符
 */
public class Offer005 {

    public static void main(String[] args) {
        String[] words = {"abcw", "foo", "bar", "fxyz", "abcdef"};
        System.out.println(maxProduct(words));
    }

    public static int maxProduct(String[] words) {
        int[] flags = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (char ch : words[i].toCharArray()) {
                flags[i] = flags[i] | (1 << (ch - 'a'));
            }
        }

        int result = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((flags[i] & flags[j]) == 0) {
                    int prod = words[i].length() * words[j].length();
                    result = Math.max(prod, result);
                }
            }
        }

        return result;
    }

}
