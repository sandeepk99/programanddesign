package com.program.algorithmanddatastructure;

//@formatter:on

/***
 *
 *  1. when the partition steps results in the index which is near middle of the array (elements are not in
 *     particular order but the partition Index is somehow computed to middle)
 *     Running time -
 *       - Best case & Average case - O(nlogn)
 *         Hint - Resursion tree*
 *         Hint - the pivot is picked eigther first or last element in an array
 *       - Average case - O(nlogn)
 *       - worst case - O(n2) - the array is sorted in ascending or decending order (arrangement of the array
 *         and also partitioning)
 *
 *   2. when
 *        - array is sorted
 *        - pivot is picked as middle element and the partition Index is the in middle
 *        - so for sorted array if the pivot is picked as the middle element
 *          the worst case be turned into best case
 *          Best and Average case - O(nlogn) - for sorted array
 *          worst case - O(n2)
 *  3. when
 *       - pick any Random element as pivot - Randomized quick sort
 *       Best and average case - O(nlogn)
 *       Worst Case - O(n2)
 */
//@formatter:off
public class QuickSortProgram {

    public int[] quicksort(int[] nums, int start, int end) {

        if (start < end) {
            int partitionIndex = partition(nums, start, end);
            quicksort(nums, start, partitionIndex - 1);
            quicksort(nums, partitionIndex + 1, end);
        }
        return nums;
    }
    int partition(int [] nums, int start, int end){
        int pIndx = start;
        int pivot = nums[end];
        for(int i=start;i<end;i++){
            if(nums[i]<=pivot){
                swap(nums,i,pIndx);
                pIndx++;
            }
        }
        swap(nums,pIndx,end);
        return pIndx;
    }

    void swap(int [] aux , int first, int second){
        int temp = aux[first];
        aux[first]=aux[second];
        aux[second]=temp;
    }

}
