package com.bvan.javastart.lessons3_4.object;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";

        int length = s.length();
        System.out.println("length = " + length); // 4

        char c = s.charAt(1);
        System.out.println("c = " + c);

        char lastChar = s.charAt(s.length() -1);
        System.out.println("lastChar = " + lastChar);

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        boolean startsWithJ = s.startsWith("J");
        System.out.println("startsWithJ = " + startsWithJ);

        String substring = s.substring(2, 11);
        System.out.println("substring = " + substring);

        int indexOfA = s.indexOf('a');
        System.out.println("indexOfA = " + indexOfA);

        String reversedString = new StringBuilder(s).reverse().toString();
        System.out.println(reversedString);
    }
}
