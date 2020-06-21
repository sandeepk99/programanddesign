package com.program.general;

public class FindSecondLargestElement {

	public static int findSecondLargest(int[] numbs) {

		if (numbs.length == 0) {
			return -1;
		}
		if (numbs.length == 1) {
			return numbs[numbs.length - 1];
		}

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < numbs.length; i++) {
			if (numbs[i] >= firstLargest) {
				int temp = firstLargest;
				firstLargest=numbs[i];
				secondLargest=temp;
			}else{
				if(secondLargest<=numbs[i]){
					secondLargest=numbs[i];
				}				
			}
		}
		return secondLargest;
	}

}
