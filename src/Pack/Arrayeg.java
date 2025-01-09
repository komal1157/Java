package Pack;

import java.util.Scanner;

public class Arrayeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
        int arr []=new int[5];
        int i;
        System.out.print("Enter array element : ");
        for( i=0;i<arr.length;i++){
             int a =s.nextInt();
              arr[i]=a;
        }
          System.out.print("User enter array element are  : ");
        for( i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nCoose one element in the array to replace another number :");
        int b=s.nextInt();
         for( i=0;i<arr.length;i++){
             if(b==arr[i]){
               System.out.print(" Enter new number to replace the number :"); 
               int c =s.nextInt();  
               arr[i]=c;
             }
        }
        System.out.print("Updated array are : ");
        for( i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }  
		
	}

}
