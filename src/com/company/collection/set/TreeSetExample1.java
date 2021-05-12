package com.company.collection.set;


/*
 * An example for two classes to be used in the same java file
 * Ascii values
 * */

import java.util.Iterator;

public class TreeSetExample1 {
    public static void main(String args[]) {
        java.util.TreeSet<String> set = new java.util.TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        set.add("1");
        set.add("A");
        set.add("a");
        set.add("100");
        // set.add(null);
        System.out.println("An initial list of elements: " + set);
        //Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: " + set);


        Iterator i=set.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}