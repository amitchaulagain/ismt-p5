package com.company.collection.filehandling;
  
import java.io.*;  
public class OutputExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/filehandling/ismt.txt");
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  