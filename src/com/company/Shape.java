package com.company;


abstract class Shape {
    /*
     * In abstract class there is an abstract method
     * Abstract class cannot be instantiated
     * Instantiation -> the process of making object ,   new keyword is used to instantiate the object
     * So how to use the abstract class
     * It can be used by the subclass
     *
     *
     *
     *
     *
     *
     * */

    {
        System.out.println("This is the block one  ");
        System.out.println("under block one  ");
        if(true){
            System.out.println("done");

        }

    }

    Integer area;

    Integer volume;

    final Double PI;

    protected Shape() {
        PI = 3.11;
    }


    abstract public void calculateArea(int length, int breadth);

    abstract public void volume(int length, int breadth, int height);


    public static void sendSigal() {
        //this.area=12;
        System.out.println("sending signal");
        System.out.println(Student.rollNumber);
    }

    //inner class

    class Utility {
        int x;
        int y;
    }

    class Utility2 {
        int x;
        int y;
    }



    {
        System.out.println("This is the block two  ");
    }


    public static void main(String[] args) {
        {
            System.out.println("block three");
        }
    }

}

