package Pattens;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
     int i,j,row=5;
     
     //outer loop for rows
     for(i=0;i<=row;i++) {
    	 // inner loop for space 
    	 for(j=0;j<=row-i;j++) {
    		 System.out.print(" ");
    		 }
    	 // second inner loop for print *
    	 for(j=0;j<=i;j++) {
    		 System.out.print("* ");
    	 }
    	 System.out.println();
     }
		
	}
}
