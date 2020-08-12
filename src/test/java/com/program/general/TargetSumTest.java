package com.program.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TargetSumTest {

    TargetSum targetSum;

    @BeforeEach
    public void setUp() {
        targetSum = new TargetSum();
    }

    @Test
    public void  testMaxTargetSum1(){
        int [] arr = {3,5,-4,8,11,1,-1,6};
        int []  expected = new int[2];
        int target = 10;
        expected[0]=11;
        expected[1]=-1;
        int[] actual = targetSum.twoNumberSum(arr,target);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void  testMaxTargetSum2(){
        int [] arr = {4, 6};
        int []  expected = new int[2];
        int target = 10;
        expected[0]=4;
        expected[1]=6;
        int[] actual = targetSum.twoNumberSum(arr,target);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void  testMaxTargetSum3(){
        int [] arr = {3,5,-4,8,11,1,-1,6};
        int []  expected = new int[2];
        int target = 10;
        expected[0]=-1;
        expected[1]=11;
        int[] actual = targetSum.twoNumberSum_another_approach(arr,target);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void  testMaxTargetSum4(){
        int [] arr = {4, 6};
        int []  expected = new int[2];
        int target = 10;
        expected[0]=4;
        expected[1]=6;
        int[] actual = targetSum.twoNumberSum_another_approach(arr,target);
        Assertions.assertArrayEquals(expected,actual);
    }
}
