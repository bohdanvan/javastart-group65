package com.bvan.javastart.lessons4_6.condition;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int x = 18;

        if (x < 20) {
            if (x > 15) {
                System.out.println("3");
            } else {
                System.out.println("4");
            }
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
