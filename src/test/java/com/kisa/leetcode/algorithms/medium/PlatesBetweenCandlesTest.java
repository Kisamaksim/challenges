package com.kisa.leetcode.algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatesBetweenCandlesTest {

    @Test
    public void shouldSuccessCountPlates() {
        int[][] queries = {{2, 5}, {5, 9}};
        String s = "**|**|***|";

        int[] result = PlatesBetweenCandles.platesBetweenCandles(s, queries);

        assertEquals(result.length, 2);
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void shouldSuccessCountPlatesTwo() {
        int[][] queries = {{1,17},{4,5},{14,17},{5,11},{15,16}};
        String s = "***|**|*****|**||**|*";

        int[] result = PlatesBetweenCandles.platesBetweenCandles(s, queries);

        assertEquals(result.length, 5);
        assertEquals(9, result[0]);
        assertEquals( 0, result[1]);
        assertEquals( 0, result[2]);
        assertEquals( 0, result[3]);
        assertEquals( 0, result[4]);
    }

    @Test
    public void shouldSuccessCountPlatesThree() {
        int[][] queries = {{2,2}};
        String s = "*|*";

        int[] result = PlatesBetweenCandles.platesBetweenCandles(s, queries);

        assertEquals(result.length, 1);
        assertEquals(0, result[0]);
    }
}