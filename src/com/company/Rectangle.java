package com.company;


public class Rectangle extends Shape {
    public static void main(String args[]) {
        Rectangle obj = new Rectangle();

        obj.calculateArea(2, 3);

    }


    @Override
    public void calculateArea(int length, int breadth) {

    }

    @Override
    public void volume(int length, int breadth, int height) {

    }
    //@Override
    public void sendSignal(){
        System.out.println("problem while overriding");

    }

}

