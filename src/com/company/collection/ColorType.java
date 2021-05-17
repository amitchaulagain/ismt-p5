package com.company.collection;

import java.util.EnumSet;
import java.util.Set;

public enum ColorType {
    RED,
    YELLOW,
    GREEN,
    BLUE,
    BLACK;


    public static void main(String[] args) {
        Set vals= EnumSet.of(ColorType.RED,ColorType.BLUE);

    }
}


enum StatusType {
    ACTIVE,
    INACTIVE,
    IN_PROGRESS,
    DELETED,
    WORKING
}


