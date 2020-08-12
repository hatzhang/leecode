package com.example.demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoSum {

    public static final int[] NotFound = {-1, -1};

    public static int[] indexOfTarget(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[]{0};
            } else {
                return new int[]{-1};
            }
        }
        int[] result =  quickSearch(nums, target);
        if (Arrays.equals(result, NotFound)) {

            return singleSearch(nums, target);
        }
        return result;
    }



    private static int[] brutalSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return NotFound;
    }

    private static int[] singleSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return new int[]{i, -1};
            }
        }
        return NotFound;
    }


    private static int[] quickSearch(int[] nums, int target) {


        IndexedNum[] numsWithIndex = new IndexedNum[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsWithIndex[i] = new IndexedNum(nums[i], i);
        }
        Arrays.sort(numsWithIndex);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int currentSum = numsWithIndex[i].value + numsWithIndex[j].value;
            if (currentSum == target) {
                break;
            } else if (currentSum < target) {
                i++;
            } else {
                j--;
            }
        }
        if (i == j) {
            return NotFound;
        } else {
            return new int[]{numsWithIndex[i].index, numsWithIndex[j].index};
        }
    }

    static class IndexedNum implements Comparable<IndexedNum>{
        private final int value ;
        private final int index;

        public IndexedNum(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }

        @Override
        public int compareTo(IndexedNum indexedNum) {
            if (indexedNum.value == this.value) {
                return 0;
            } else if (this.value < indexedNum.value) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
