package com.bvan.javastart.lessons5_6.condition;

/**
 * @author bvanchuhov
 */
public class Comparing {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int res;
//        if (a < b) {
//            res = -1;
//        } else if (a == b) {
//            res = 0;
//        } else {
//            res = 1;
//        }

        int res = (a < b) ? -1 : ((a == b) ? 0 : 1);

        System.out.println("res = " + res);
    }
}
