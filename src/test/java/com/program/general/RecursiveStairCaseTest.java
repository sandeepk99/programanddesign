package com.program.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveStairCaseTest {

    @Test
    public void test_Recursion() {

        int actual = RecursiveStairCase.findNumberOfwaysRecursive(5);
        Assertions.assertEquals(8,actual);
    }

    @Test
    public void test_Optimal() {

        int actual = RecursiveStairCase.findNumberOfwaysOptimal(7);
        Assertions.assertEquals(21,actual);
    }
}

