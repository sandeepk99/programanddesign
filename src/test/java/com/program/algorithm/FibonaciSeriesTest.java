package com.program.algorithm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonaciSeriesTest {

    FibonaciSeries fibonaciSeries;

    @Before
    public void setUp(){
        fibonaciSeries = new FibonaciSeries() ;
    }
    @Test
    public void test_optimalSolution(){
        int result = fibonaciSeries.fibo_optimal(8);
        assertEquals(result,21);
    }

    @Test
    public void test_recursionSolution(){
        int result = fibonaciSeries.fibo_rec(8);
        assertEquals(result,21);
    }
}
