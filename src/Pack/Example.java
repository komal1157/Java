
package Pack;
import java.util.*;

public class Example {

	public static void main(String[] args) {
		int row ,col,n=5;
	      int arr[][] = new int [6][6];
	      for (row=1;row<=n;row++){
	          for (col=1;col<=row;col++){
	              if(col==1 || col==row){
	                  System.out.print(arr[row][col]=1);
	              }
	              else{
	                  arr[row][col]=arr[row-1][col-1]+arr[row-1][col];
	                  System.out.print(arr[row][col]);
	              }
	          }
	          System.out.println("");
	      }
		
	}
}




