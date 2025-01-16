package FileHandling;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Emp{
	int id;
	String name;
	int age;
	public Emp(int i,String n,int a) {
		
		id=i;
		name=n;
		age=a;
	}
	public String toString() {
		return ("empid "+id+" name "+name+" age "+age);
	}
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       File file=new File("w.txt");
       
       Emp e1=new Emp()
       
       try {
    	   if(!file.exists()) {
    	   file.createNewFile();
    	   System.out.println("file created");
    	   }else {
    		   System.out.println("File already exists");  
    	   }
       }
       catch(IOException obj) {
    	   obj.printStackTrace();
       }
       
       try {
    	   
    	   FileWriter fw=new FileWriter(file);
    	   BufferedWriter bw=new BufferedWriter(fw);
    	   bw.append(obj.toString());
    	   
    	   bw.close();
       }
       catch(IOException obj2){
    	   obj2.printStackTrace();
       }
	}

}
