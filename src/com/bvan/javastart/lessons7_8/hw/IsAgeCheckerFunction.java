package com.bvan.javastart.lessons7_8.hw;

/**
 * @author bvanchuhov
 */
public class IsAgeCheckerFunction {

    public static void main(String[] args) {
        System.out.println(isAge(10) == true);
        System.out.println(isAge(555) == false);
    }

    public static boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }
}
