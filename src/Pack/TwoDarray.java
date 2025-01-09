package Pack;

import java.lang.*;
import java.util.*;
import java.io.*;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int i,j, row=5,col=5;	
    Scanner sc =new Scanner(System.in);
    int arr[][]=new int [row][col];//dynamic
    
    int arr1[][]= {{1,2,3},{4,5,6}};// stati declaration 
    
    for(i=0;i<row;i++) {
    	for(j=0;j<col;j++) {
    		System.out.print("enter element"+i+j+":");
    		arr[i][j]=sc.nextInt();    		
    	}
    	System.out.println();
    }
    for(i=0;i<row;i++) {
    	for(j=0;j<col;j++) {
    		System.out.print(arr[i][j]+" ");
    		
    	}
    	System.out.println();
    }
	}
}
