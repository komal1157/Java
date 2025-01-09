package Pack;
import java.util.*;
import java.io.*;
public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= new int [5];
		
		Scanner sc=new Scanner(System.in);
		
        // finding element in the array 
		int num[]= {4,2,5,3,1};
		System.out.println("Enter the nmber to find ");
		int key=sc.nextInt();
		for(int i=0;i<5;i++) {
			if(arr[i]==key) {
				System.out.println("key :"+key+" found at position "+i);
			}
			else {
				System.out.println("key :"+key+"not found ");	
			}
		}
	}

}
