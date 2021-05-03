package com.company;

import java.util.ArrayList;
import java.util.List;

public class Collections  {


    public static void main(String[] args) throws Exception {

        List<String> values1 = new ArrayList<>();


        values1.add("apple");
        values1.add("apple");
        values1.add("ball");
        values1.add("cat");




        for (String singleValue : values1) {
            System.out.println(singleValue);

        }

    }
}
