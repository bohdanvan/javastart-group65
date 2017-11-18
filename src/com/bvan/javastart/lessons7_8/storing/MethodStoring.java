package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class MethodStoring {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int sum = sum(x, y);

        System.out.println(sum);
    }

    private static int sum(int x, int y) {
        int s = x + y;
        return s;
    }
}
