package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortTest {
    @Test
    public void quickSortTest() {
        int[] input = {4, 5, 3, 2, 7, 9, 0, 1, 8, 6};
        int[] output = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = QuickSort.sort(input);
        assertThat(result).isEqualTo(output);
    }

    @Test
    public void simpleTest() {
        int[] zeroSize = new int[0];
        assertThat(zeroSize.length).isEqualTo(0);
    }

    @Test
    public void test() {
        assertThat(5 % 3).isEqualTo(2);
    }
}
