package com.company.collection.list;

import java.util.*;
public class LinkedList1{
    public static void main(String args[]){

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr=al.iterator();

        System.out.println(al.size());
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}