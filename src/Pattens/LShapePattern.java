package Pattens;

public class LShapePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int i ,j,rows=5,col=5;
		 for(i=0;i<rows;i++) {
			 
			 for(j=0;j<i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}
