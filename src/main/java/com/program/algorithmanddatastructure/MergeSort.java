package com.program.algorithmanddatastructure;

public class MergeSort {

    public int[] mergeSort(int [] nums, int low , int high){
        if(low < high){
            int mid = (low + high) /2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            myMerge(nums,low,mid,high);
        }
        return nums;
    }


    public int[] myMerge(int nums[] , int l , int mid ,int h ){
        int i= l;
        int j = mid +1;
        int arr[] = new int[nums.length];
        int k = l;
        while (i <= mid && j<=h){
            if(nums[i]< nums[j]){
                arr[k] = nums[i];
                k++;
                i++;
            }else{
                arr[k]=nums[j];
                k++;
                j++;
            }
        }
        while(i <= mid){
            arr[k]=nums[i];
            k++; i++;
        }
        while(j<=h){
            arr[k]=nums[j];
            k++;
            j++;
        }

        for(int p=l;p<=h;p++){
            nums[p]=arr[p];
        }
        return nums;
    }


    public int[] merge(int nums[] , int m ){

        int low = 0 , high =m-1;
        int mid = low+high /2 ;
        int i= low;
        int j = mid +1;
        int arr[] = new int[m];
        int k = low;
        while (i <= mid && j<=high){
             if(nums[i]< nums[j]){
                 arr[k] = nums[i];
                 k++;
                 i++;
             }else{
                 arr[k]=nums[j];
                 k++;
                 j++;
             }
        }
        while(i <= mid){
            arr[k]=nums[i];
            k++; i++;
        }
        while(j<=high){
            arr[k]=arr[j];
            k++;
            j++;
        }

        for(int p =0;p<arr.length;p++){
            nums[p]=arr[p];
        }
        return nums;
    }
}
