package com.bvan.javastart.lessons3_4.condition;

/**
 * @author bvanchuhov
 */
public class QuestionOperator {

    public static void main(String[] args) {
        int x = 10;

        String message;
        if (x < 100) {
            message = "OK";
        } else {
            message = "Cancel";
        }
        System.out.println(message);

        String message2 = (x < 100) ? "OK" : "Cancel";
        System.out.println(message2);
    }
}
