package com.company.collection;

import java.util.Optional;

public class JavaExceptionExample {

    static int x = 0;

    public static void main(String args[]) {
        System.out.println("we are here");


        int y = 0;
        try {
            Integer x = null;

            if (x != null) {
                y = x.intValue();

            }

            System.out.println("Value of y: " + y);
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("rest of the code...");
    }
}  