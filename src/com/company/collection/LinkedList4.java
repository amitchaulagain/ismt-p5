package com.company.collection;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String args[]) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        //Traversing the list of elements in reverse order
        Iterator i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("--------Ascending ---------");
        Collections.sort(ll);
        Iterator j = ll.iterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }


        System.out.println("--------Descending ---------");
        Collections.reverse(ll);
        Iterator k = ll.iterator();
        while (k.hasNext()) {
            System.out.println(k.next());
        }



    }
}
