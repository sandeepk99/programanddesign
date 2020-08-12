package com.program.general;

import java.util.List;

public class MergeTwoSortedLists {

    /*
     * arr1={ 3,5,11,16,18,-1,-1,-1,-1 }
     * arr2={ 2,9,13,17 }
     *
     * output - arr1-> {2,3,5,9,11,13,16,17,18}
     *     3,5,11,16,17,-1,-1,-1,18
     */

    public int[] mergeTwoSortedArrays( int arr1[] ,int [] arr2){
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;

        int arr1DeltaLastIndx =arr1Len-arr2Len;

        int count=arr1Len-1;
        int lastInxArr2=arr2Len-1;

        int arr1length=arr1DeltaLastIndx-1;

        while(arr1length >=0 && lastInxArr2 >0){

            if(arr2[lastInxArr2] < arr1[arr1length]){
                arr1[count]=arr1[arr1length];
                arr1[arr1length]=arr2[lastInxArr2];
                lastInxArr2--;
            }else{
                arr1[count]=arr1[lastInxArr2];
                arr1length--;
            }
        }
        return arr1;
    }


    public List<Integer> mergeTwoSortedList(List<Integer> list1 , List<Integer> list2){


        return list1;
    }
}
