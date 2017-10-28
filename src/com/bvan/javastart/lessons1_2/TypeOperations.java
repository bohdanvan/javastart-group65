package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class TypeOperations {

    public static void main(String[] args) {
        int age = 25;

        age = age + 10; // 35
        age += 10; // 45

        age = age + 1; // 46
        age += 1; // 47
        age++; // 48
        ++age; // 49

        age--; // 48
        --age; // 47

        System.out.println("age = " + age);
    }
}
