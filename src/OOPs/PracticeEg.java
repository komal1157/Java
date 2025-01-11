package OOPs;
import java.util.*;

class Salary {
	double basicPay;
	String name;
	String dept;
	Float Profit;
	Scanner sc=new Scanner(System.in);
	
	void accept() {
	   System.out.println("Enter name : ");
	   name =sc.next();
	   System.out.println("Enter dept  :");
	   dept =sc.next();
	   System.out.println("Enter BaciPay  : ");
	   basicPay =sc.nextDouble();
	   System.out.println("Enter Profit  : ");
	   Profit =sc.nextFloat();
			   }
//	System.out.print(" user detials :");
	void display() {
		System.out.println("name : "+ name);
		System.out.println("department : "+dept);
		System.out.println("Basicpay : "+basicPay);
		System.out.println("Profit : "+Profit);
	}
	
}

public class PracticeEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary e[]=new Salary [2];
		
		  for(int i=0;i<e.length;i++) {
	    	  e[i]=new Salary();
	    	  e[i].accept();
	    	  
	    	  
	      }
	      System.out.println("\n Salary  Details:");
	      for (int i = 0; i < e.length; i++) {
	          e[i].display(); // Display employee details
	      }

	}

}
