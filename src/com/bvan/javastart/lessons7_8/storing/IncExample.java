package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class IncExample {

    public static void main(String[] args) {
        int n = 10;
        n = inc(n);
        System.out.println(n);
    }

    public static int inc(int n) {
        return n + 1;
    }
}
