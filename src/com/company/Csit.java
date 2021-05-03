package com.company;


public class Csit {



    public static void main(String[] args) {
        Csit csit = new Csit();
        Fruit fruit = csit.set("Mustang");
        // System.out.println(fruit.getName() + " " + fruit.getColor() + " " + fruit.getWeight());

    }

    Fruit set(String name) {
        System.out.println("seven");

        Fruit fruit = new Fruit();
       // fruit.setName(name);
        // fruit.setColor("green");
        return fruit;

    }
}
