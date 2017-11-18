package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class MinExample {

    // Client
    public static void main(String[] args) {
        int x = min(10, 20); // вызов метода
        int y = min(200, 100);
        System.out.println(x + y);
    }

    // Creator
    public static int min(int a, int b) {
        int min;
        if (a < b){
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
