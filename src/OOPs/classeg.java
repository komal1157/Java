package OOPs;

import java.util.*;

class Emp{
	//dta members
	Scanner sc =new Scanner(System.in);
	int empid;
	String empname;
	String empdept;
	
	//data method
	void accept() {
//		Scanner sc =new Scanner(System.in);
		System.out.println("Enter empid");
		empid=sc.nextInt();
		
	}
	void display() {
		System.out.println("empid :"+empid);
	}
}

public class classeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Emp e1 =new Emp();
//     e1.accept();
//     e1.display();
     
     //differnt object 
     Emp e[] = new Emp[4];
      for(int i=0;i<e.length;i++) {
    	  e[i]=new Emp();
    	  e[i].accept();
    	  
    	  
      }
      System.out.println("\nEmployee Details:");
      for (int i = 0; i < e.length; i++) {
//          System.out.println("\nEmployee " + (i + 1) + ":");
          e[i].display(); // Display employee details
      }
     
	}

}
