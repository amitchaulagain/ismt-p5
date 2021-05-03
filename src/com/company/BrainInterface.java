package com.company;


/*
 * Keyword interface is used to create the interface
 *
 * */

 interface BrainInterface {

    long numberOfNeurones = 1;

     int zzz = 4;

    double x = 3.5D;

    float y = 3.5f;

     void reason();

     void think();

     String greet(String name);



    default void ans(){
        System.out.println("Using the default keyword , then , only , you can implement the methods ");
    }


    //After java 8 , we can now implement the methods

    //Before, we couldnot implement the methods in an interface


}
