package com.company.collection.filehandling;
  
import java.io.*;    
class Input1{    
  public static void main(String args[])throws Exception{    
   FileInputStream fin1=new FileInputStream("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/filehandling/ismt.txt");
   FileInputStream fin2=new FileInputStream("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/filehandling/facts.txt");
   FileOutputStream fout=new FileOutputStream("/Users/admin/hero/tutorials/spring-boot-modules/ismt-p5/src/com/company/collection/filehandling/combined.txt");
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fout.write(i);        
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close();       
   System.out.println("Success..");  
  }    
}    