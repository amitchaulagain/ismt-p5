package com.company;

public class Student implements MoveInterface, BrainInterface {

     static int rollNumber;

    private static String faculty;

    private static String course;

    final double pi;

    public Student() {
        pi = 0;
    }

    public Student(int rollNumber, String faculty, String course) {
        // pi = 3.12;

        this.rollNumber = rollNumber;
        this.faculty = faculty;
        this.course = course;
        this.pi = 3.14;
    }

    @Override
    public final void move() {
        System.out.println(" we are moving");
        // pi=3.12;

    }


    @Override
    public final void reason() {
        System.out.println("we can reason and do critical analysis");


    }

    @Override
    public void think() {
        System.out.println("Lets think");

    }

    @Override
    public  String greet(String name) {
        return "Hello Mr" + "   " + name;
    }

    public  boolean answer() {
        System.out.println("answer ");
        System.out.println(rollNumber);
        return true;
    }
    static {
        System.out.println("THis is under block 2");
        System.out.println("we are inside block two");
    }

    public static void main(String[] args) {
        System.out.println(course);

//        Student s1 = new Student();
//        Student s2 = new Student();
//
//        Student.faculty="IT";
//        System.out.println(s1);
//        System.out.println(s2);
//
//
//        s1.answer();

        Shape.sendSigal();





    }

    public static class InnerClass {

    }

     static {
        System.out.println("THis is under block 1");
        System.out.println("we are inside block one");
    }

}


