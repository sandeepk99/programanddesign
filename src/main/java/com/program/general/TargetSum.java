package com.program.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetSum {

    /*
      Time Complexity - O(n)
      Space Complexity - O(n)
     */
    public  int[] twoNumberSum(int[] arr, int target) {

        Map<Integer,Boolean> lookUp = new HashMap<Integer,Boolean>();
        int [] result = new int[2];
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            int targetSum = target-ele;
            if(lookUp.containsKey(targetSum)){
                result[0]=targetSum;
                result[1]=ele;

                return result;
            }else{
                lookUp.put(ele,false);
            }
        }

        return new int [0];
    }

    public  int[] twoNumberSum_another_approach(int[] arr, int target) {

        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{arr[left],arr[right]};
            }
            else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return new int [0];
    }
}
