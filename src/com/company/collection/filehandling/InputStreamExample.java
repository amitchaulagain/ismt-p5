package com.company.collection.filehandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class InputStreamExample {
    public static void main(String args[]) throws Exception {
        FileInputStream input1 = new FileInputStream("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/filehandling/ismt.txt");
        FileInputStream input2 = new FileInputStream("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/filehandling/facts.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        int j;
        while ((j = inst.read()) != -1) {
            System.out.print((char) j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}  