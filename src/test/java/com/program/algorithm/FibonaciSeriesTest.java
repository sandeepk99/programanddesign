package com.program.algorithm;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class FibonaciSeriesTest {

	FibonaciSeries fibonaciSeries;

	@BeforeEach
	public void setUp() {
		fibonaciSeries = new FibonaciSeries();
	}

	@Test
	public void test_optimalSolution() {
		int result = fibonaciSeries.fibo_optimal(8);
		Assertions.assertEquals(result, 21);
	}

	@Test
	public void test_recursionSolution() {
		int result = fibonaciSeries.fibo_rec(8);
		Assertions.assertEquals(result, 21);
	}
}
