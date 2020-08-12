package com.example.demo;

public class QuickSort {

    public static int[] sort(int[] input) {

        return quickSort(input);
    }

    private static int[] quickSort(int[] input) {
        if (input.length == 0 || input.length == 1) {
            return input;
        } else if (input.length == 2){
            if (input[0] > input[1]) {
                return new int[]{input[1], input[0]};
            } else {
                return input;
            }
        } else {
            int pivot = input[0];
            int leftLength = 0, rightLength = 0;
            for (int i = 1; i < input.length; i++) {
                if (input[i] > pivot) {
                    rightLength++;
                } else {
                    leftLength++;
                }
            }
            int[] left = new int[leftLength];
            int[] right = new int[rightLength];
            for (int i = 1,x=0,y=0; i < input.length; i++) {
                if (input[i] > pivot) {
                    right[x++] = input[i];
                } else {
                    left[y++] = input[i];
                }
            }
            return getInts(pivot,  quickSort(left), quickSort(right));
        }
    }


    private static int[] getInts(int pivot, int[] sortedLeft, int[] sortedRight) {
        int[] result = new int[sortedLeft.length+ sortedRight.length+1];
        for (int i = 0; i < sortedLeft.length; i++) {
            result[i] = sortedLeft[i];
        }
        result[sortedLeft.length] = pivot;
        for (int i = 0; i < sortedRight.length; i++) {
            result[sortedLeft.length + 1 + i] = sortedRight[i];
        }
        return result;
    }


}
