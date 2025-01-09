package Pack;

import java.io.*;
import java.lang.*;
import java.util.*;

public class TwoDArrayReplaceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int row =5,col=5,i,j,temp,flag;
        int arr[][]=new int [row][col];
        Scanner sc =new Scanner(System.in);
        for(i=0;i<row;i++) {
        	for(j=0;j<col;j++) {
        		System.out.println("Enter element "+i+j+" :");
        		arr[i][j]=sc.nextInt();
        	}
        	System.out.println();
        }
        System.out.println("2 D matrix are :");
        for(i=0;i<row;i++) {
        	for(j=0;j<col;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("Enter a element to replace : ");
        temp=sc.nextInt();
        flag=sc.nextInt();
        for(i=0;i<row;i++) {
        	for(j=0;j<col;j++) {
        		if(temp==arr[i][j]) {
        			arr[i][j]=flag;
        		}
//        		else if(arr[i][j]==arr[4][4]) {
//        			System.out.println("element not found");
//        		}
        	}
        	System.out.println();
        }
        System.out.println("after replace element : ");
        for(i=0;i<row;i++) {
        	for(j=0;j<col;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }   
	}
}
