package com.program.algorithm;


public class FibonaciSeries {
    //0 1 1 2 3 5 8 13 21 34
    //fib(n) -> fib(n-1) + fib(n-2)

    public static void main(String[] arg) {
        int result = fibo_rec(9);
        System.out.println(" Recursion Way: " + result);
        result = fibo_optimal(9);
        System.out.println(" Optimal Way: " + result);
        result=fibo_memo(9);
    }

    //TBD
    private static int fibo_memo(int i) {
        return -1;
    }

    private static int fibo_optimal(int num) {

        int n2 = 1;
        int n1 = 1;
        if (num == 0) {
            return 0;
        }
        if (num == 1 ) {
            return 1;
        }
        for (int i = 2; i < num; i++) {
            int temp = n1;
            n1 = n1 + n2;
            n2 = temp;
        }
        return n1;
    }

    private static int fibo_rec(int num) {

        if (num == 0) {
            return 0;
        }
        if (num == 1 ) {
            return 1;
        }
        return fibo_rec(num - 1) + fibo_rec(num - 2);
    }
}
