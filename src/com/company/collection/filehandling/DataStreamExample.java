package com.company.collection.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String args[]) throws IOException {
        FileInputStream fin = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fin = new FileInputStream("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/filehandling/ismt.txt");

            bufferedInputStream = new BufferedInputStream(fin);


            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (Exception e) {
            System.out.print(e);
        } finally {
            fin.close();
            bufferedInputStream.close();


        }
    }
}