package com.company;



/*
* Java support multi-level inheritance but not multiple inheritance
*
* */
public class Person extends Mammal {
    private String fName;
    private String lName;
    private int age;


    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String firstName) {
        this.fName = firstName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lastName) {
        this.lName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(){
        super("apppppp");
    }


    public static void main(String[] args) {
        System.out.println("hello World");
    }



}
