package com.program.algorithmanddatastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickSortProgramTest {

    QuickSortProgram quickSortProgram;

    @BeforeEach
    public void setUp() {
        quickSortProgram = new QuickSortProgram();
    }

    @Test
    public void test_quickSort_randomElement() {
        int[] nums = {7, 2, 1, 6, 8, 5, 3, 4};
        int start = 0;
        int end = nums.length - 1;
        int[] actualResult = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(quickSortProgram.quicksort(nums, start, end), actualResult);
    }

    @Test
    public void test_quickSort_AllSameElement() {
        int[] nums = {10, 10, 10, 10, 10, 10, 10, 10};
        int start = 0;
        int end = nums.length - 1;
        int[] actualResult = {10, 10, 10, 10, 10, 10, 10, 10};
        Assertions.assertArrayEquals(quickSortProgram.quicksort(nums, start, end), actualResult);
    }

    @Test
    public void test_quickSort_Positive_Negative_Element() {
        int[] nums = {4, 1, -2, -5, 7, 6, -9, 9, 8};
        int start = 0;
        int end = nums.length - 1;
        int[] actualResult = {-9, -5, -2, 1, 4, 6, 7, 8, 9};
        Assertions.assertArrayEquals(quickSortProgram.quicksort(nums, start, end), actualResult);
    }

}
