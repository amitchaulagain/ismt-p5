package com.company;

public class University extends Student {

    static int x;
    static Integer y;

    //@Override
//    public void answer() {
//        System.out.println("answer ");
//    }

    public static void main(String[] args) {

        System.out.println(x);
        System.out.println(y);

    }

    public static void helloSystem() {

        System.out.println(x);
        University university = new University();

        System.out.println(university.y);
    }

}
