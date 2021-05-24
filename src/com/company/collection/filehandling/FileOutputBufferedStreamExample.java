package com.company.collection.filehandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputBufferedStreamExample {
    public static void main(String args[]) throws IOException {

        FileOutputStream fout = null;


        try {
            fout = new FileOutputStream("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/filehandling/ismt.txt");


            BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(fout,20);

            String s = "Welcome to javaTpoint. With BufferedOutputStream ";
            byte b[] = s.getBytes();//converting string into byte array
            bufferedOutputStream.write(b);
            bufferedOutputStream.flush();

            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fout.close();
        }
    }
}  
