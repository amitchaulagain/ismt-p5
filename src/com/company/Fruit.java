package com.company;

public final class Fruit  {


    /*
     * Final keyword can be used in three levels as well , level in a sense , it can be used in property level, method level and class level
     * this  is the keyword that simply points the current object
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * */
    //  public final Double pi;

    private String name;

    private Integer weight;


    public Fruit(String color, String name, Integer weight) {


        this.name = "hello";

    }



    public Fruit() {

        this.name = name;
        this.weight = weight;
        // pi = 3.14;
    }


    public final String getName() {
        return name;
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
