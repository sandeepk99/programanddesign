package com.program.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxSubArrayTest {

    MaxSubArray maxSubArray;

    @BeforeEach
    public void setUp() {
        maxSubArray = new MaxSubArray();
    }

    @Test
    public void  testMaxElementInSubArray(){
        int [] arr = {-2,3,2,-1};
        int expected = 5;
        int actual = maxSubArray.maximumElement(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  testMaxElementInSubArray_allNegative_Numbers(){
        int [] arr = {-2,-3,-2,-1};
        int expected = -1;
        int actual = maxSubArray.maximumElement(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  testMaxElementInSubArray_allPositive_Numbers(){
        int [] arr = {2,3,2,1};
        int expected = 8;
        int actual = maxSubArray.maximumElement(arr);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  testMaxElementInSubArray_EmptyArray(){
        int [] arr = {};
        int expected = 0;
        int actual = maxSubArray.maximumElement(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  testMaxElementInSubArray_NullArray(){
        int [] arr = null;
        int expected = 0;
        int actual = maxSubArray.maximumElement(arr);
        Assertions.assertEquals(expected, actual);
    }
}
