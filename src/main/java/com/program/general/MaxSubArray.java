package com.program.general;

/***
 *
 * Kadane's algorithm 
 *
 */
public class MaxSubArray {

    public int maximumElement(int[] arr) {

        if(arr==null || arr.length==0){
            return 0;
        }

        int max_g = arr[0], max_c = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max_c = Math.max(arr[i], arr[i] + max_g);
            if (max_c >= max_g) {
                max_g = max_c;
            }
        }
        return max_g;

    }
}
