package com.example.demo;

import org.junit.jupiter.api.Test;

import static com.example.demo.TwoSum.indexOfTarget;
import static org.assertj.core.api.Assertions.assertThat;

public class SumsEqualToTargetTest {
    @Test
    public void sumsEqualToTargetTest() {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 13;
        int[] resultIndex = {0, 2};
        assertThat(indexOfTarget(nums, target)).isEqualTo(resultIndex);


    }

    @Test
    public void emptyTest() {
        int[] nums = {};
        assertThat(indexOfTarget(null, 0)).isEqualTo(nums);
        assertThat(indexOfTarget(nums, 2)).isEqualTo(nums);
    }

    @Test
    public void singleTest() {
        int[] nums = {1};
        assertThat(indexOfTarget(nums, 1)).isEqualTo(new int[]{0});
        assertThat(indexOfTarget(nums, 2)).isEqualTo(new int[]{-1});
    }

    @Test
    public void twoTest() {
        int[] nums = {2, 3};
        assertThat(indexOfTarget(nums, 5)).isEqualTo(new int[]{0, 1});
        assertThat(indexOfTarget(nums, 2)).isEqualTo(new int[]{0, -1});
        assertThat(indexOfTarget(nums, 4)).isEqualTo(new int[]{-1, -1});

        nums = new int[]{0, 3};
        assertThat(indexOfTarget(nums, 3)).isEqualTo(new int[]{0, 1});

    }

    @Test
    public void duplicatedTest() {
        int[] nums = {2,5,5,11};
        assertThat(indexOfTarget(nums, 10)).isEqualTo(new int[]{1, 2});


    }
}
