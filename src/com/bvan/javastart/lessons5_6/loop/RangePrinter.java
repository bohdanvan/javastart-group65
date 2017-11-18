package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class RangePrinter {

    public static void main(String[] args) {
        int from = 1;
        int to = 10;

        if (from % 2 != 0) {
            from++;
        }
        for (int n = from; n <= to; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();

//        for (int n = min; n <= max; n++) {
//            if (n % 2 == 0) {
//                System.out.print(n + " ");
//            }
//        }
//        System.out.println();
    }
}
