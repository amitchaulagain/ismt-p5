package com.company.collection.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import java.io.*;
public class FilterExample1 {
    public static void main(String[] args) throws IOException {
        File data = new File("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/filehandling/ismt.txt");
        FileInputStream  file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k =0;
        while((k=filter.read())!=-1){
            System.out.print((char)k);
        }
        file.close();
        filter.close();
    }
}