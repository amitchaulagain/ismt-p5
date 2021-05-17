package com.company.collection;

import java.util.*;
import java.io.*;  
public class Test {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/info.properties");

    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("username"));
    System.out.println(p.getProperty("password"));  
}  
}  