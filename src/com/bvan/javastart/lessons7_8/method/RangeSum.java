package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class RangeSum {

    // Client
    public static void main(String[] args) {
        int x = rangeSum(10, 5);
        System.out.println(x);
    }

    // Creator
    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from should not be greater then to");
        }

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
