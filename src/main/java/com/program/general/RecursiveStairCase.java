package com.program.general;


/***
 *         0  if n<0
 * f(n)    1  if n=0
 *         f(n-1) + f(n-1)  Otherwise
 *   n - stairs
 *   ---------------------
 *   n    | 1|2|3|4|5|6|7
 *   ---------------------
 *   ways | 1|2|3|5|8|13|21
 *   ---------------------
 */

public class RecursiveStairCase {


    /**
     *
     *   O(n2) - time complexity
     *
     */
    static int findNumberOfwaysRecursive(int n){

        if(n < 0) return 0;

        if(n==0) return 1;

        return findNumberOfwaysRecursive(n-1)+ findNumberOfwaysRecursive(n-2);


    }
    /**
     *
     *   O(n) - time complexity
     *   O(1) - space complexity
     */
    static int findNumberOfwaysOptimal(int n){

        if(n < 0) return 0;

        if(n==0) return 1;

        int sum =0,first =1,second=1,temp=0;
        for(int i =2;i<=n;i++){
            sum = first+second;
            temp = first;
            first=sum;
            second=temp;
        }
        return sum;
    }
}
