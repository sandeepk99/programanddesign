package com.program.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSumCount {

     static int numberOfPairs(int [] arr,int sum){
        int pairCount=0;
        Map<Integer,Integer> lookUp=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int target = sum - arr[i];
            if(lookUp.containsKey(target)){
                pairCount++;
            }
            lookUp.put(arr[i],target);
        }
        return pairCount;
    }

    static int  frequency(int [] nums, int element){
        int frequencyCount=0;
        Map<Integer,Integer> frequencyMap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!frequencyMap.containsKey(nums[i])){
                frequencyMap.put(nums[i],1);
            }else{
                frequencyMap.put(nums[i],frequencyMap.get(nums[i])+1);
            }
        }
        if(frequencyMap.containsKey(element)){
            frequencyCount=frequencyMap.get(element);
        }
        return frequencyCount;
    }


}
