package com.company;



/*
* Java support multi-level inheritance but not multiple inheritance
*
* */
public class Person extends Mammal {
    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
