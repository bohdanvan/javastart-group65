package com.bvan.javastart.lessons3_4.condition;

/**
 * @author bvanchuhov
 */
public class AgeCategory {

    public static void main(String[] args) {
        int age = 100;

        String category;
        if (age < 12) {
            category = "child";
        } else if (age <= 18) {
            category = "teenager";
        } else if (age <= 60) {
            category = "adult";
        } else {
            category = "old";
        }
        System.out.println(category);
    }
}
