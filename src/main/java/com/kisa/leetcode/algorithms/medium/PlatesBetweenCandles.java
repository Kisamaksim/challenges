package com.kisa.leetcode.algorithms.medium;

import java.util.Map;
import java.util.TreeMap;

/**
 * <a href="https://leetcode.com/problems/plates-between-candles/">2055. Plates Between Candles</a>
 */
public class PlatesBetweenCandles {

    public static void main(String[] args) {
        String s = "|||||*|||*|||*||||*||||**|*|||**|**||**|||*|||*||***||*|*||";
        int[][] queries = {{1, 55}, {2, 32}};

        platesBetweenCandles(s, queries);
    }

    public static int[] platesBetweenCandles(String s, int[][] queries) {
        TreeMap<Integer, Integer> counts = new TreeMap<>();
        for (int i = 0, count = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                counts.put(i, count);
            } else {
                count++;
            }
        }
        int[] results = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            Map.Entry<Integer, Integer> leftCandle = counts.ceilingEntry(left);
            Map.Entry<Integer, Integer> rightCandle = counts.floorEntry(right);
            results[i] = rightCandle == null || leftCandle == null ? 0 : Math.max(rightCandle.getValue() - leftCandle.getValue(), 0);
        }
        return results;
    }
}
