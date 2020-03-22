package com.sandeep.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sandeep.general.FindSecondLargestElement;


public class FindSecondLargestElementTest {
	
	@Test
	public void test_happyPath() {
		int [] numbs = {11,3,7,13,9,8,15,18,6};
		int actual = FindSecondLargestElement.findSecondLargest(numbs);
		Assertions.assertEquals(actual,15);
	}
	
	@Test
	public void test_whenArrayIsEmpty() {
		int [] numbs = {};
		int actual = FindSecondLargestElement.findSecondLargest(numbs);
		Assertions.assertEquals(actual,-1);
	}
	
	@Test
	public void test_whenArrayhas_OnlyOneElement() {
		int [] numbs = {4};
		int actual = FindSecondLargestElement.findSecondLargest(numbs);
		Assertions.assertEquals(actual,numbs[numbs.length - 1]);
	}
	
	@Test
	public void test_whenArrayhas_Positive_Negative_Numbers() {
		int [] numbs = {11,3,7,-13,9,8,15,-18,6};;
		int actual = FindSecondLargestElement.findSecondLargest(numbs);
		Assertions.assertEquals(actual,11);
	}
	
	@Test
	public void test_whenArrayhas_All_Negative_Numbers() {
		int [] numbs = {-11,-3,-7,-13,-9,-8,-15,-18,-6};;
		int actual = FindSecondLargestElement.findSecondLargest(numbs);
		Assertions.assertEquals(actual,-6);
	}

}
