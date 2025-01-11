package Pattens;

public class eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int i,j,row=5;
		//outer for loop for rows
		for(i=1;i<=row;i++) {
			
			//inner for loop for  space
			for (j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			
			//inner for loop for print *
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			// for next line
			System.out.println();
		}	
	}
}
