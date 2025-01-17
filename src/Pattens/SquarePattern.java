package Pattens;
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,row ;
		System.out.println("Enter number of row :");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		// outer loop foe number of rows
		for(i=0;i<row;i++) {
			//inner loop for print *
			for(j=0;j<row;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
