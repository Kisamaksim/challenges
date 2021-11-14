package com.kisa.leetcode.algorithms.medium;

/**
 * <a href="https://leetcode.com/problems/plates-between-candles/">2055. Plates Between Candles</a>
 */
public class PlatesBetweenCandles {

    public static void main(String[] args) {
        int[][] queries = {{2, 5}, {5, 9}};
        String s = "**|**|***|";

        int[] result = platesBetweenCandles(s, queries);
    }

    public static int[] platesBetweenCandles(String s, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][i];
            int right = queries[i][i + 1];
            char[] sub = s.substring(left, right + 1).toCharArray();
            for (int j = 0; j < sub.length; j++) {
                if (sub[j] == '|') {

                }
            }
        }
        return result;
    }
}
