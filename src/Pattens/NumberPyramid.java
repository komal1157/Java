package Pattens;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,j,row=5,number=1;
      // outer loop for rows
      for(i=1;i<=row;i++) {
    	  // inner loop for print number
    	  for(j=1;j<=i;j++) {
    		  System.out.print(number+" ");
    		  number++;
    	  }
    	  System.out.println();
      }
	}

}
