package com.company.collection;

public class JavaExceptionExample {

    static int x = 0;

    public static void main(String args[]) {
        System.out.println("we are here");


        int y = 0;
        try {
            Integer x = null;

            y = x.intValue();


            System.out.println("Value of y: " + y);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("This code block runs");
            System.out.println("in spite of");
            System.out.println("exceptions");
        }


        System.out.println("rest of the code...");
    }
}  