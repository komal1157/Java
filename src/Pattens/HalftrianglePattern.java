package Pattens;

import java.util.*;

public class HalftrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int i,j,row;
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter two size  :");
		row=sc.nextInt();
		
		//outer loop for number of rows
		
		for(i=1;i<=row;i++) {
			
			// inner loop for space
			
			for (j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			
			// second inner loop for print * 
			for (j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
