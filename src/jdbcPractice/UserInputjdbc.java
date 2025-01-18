package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



class Employee{
	int empid;
	int empsalary;
	String empname;
	String empDept;
	Scanner sc=new Scanner(System.in);
	
	Employee(){
		System.out.println("Ente empid :"+empid);
		empid=sc.nextInt();
		System.out.println("Enter empsalary :"+empsalary);
		empsalary=sc.nextInt();
		System.out.println("Enter emoname :"+empname);
		empname=sc.next();
		System.out.println("Enter empDept :"+empDept);
		empDept=sc.next();
//		
		
	}
}


public class UserInputjdbc {

	public static void main(String[] args) {
       
		//class loader 
		  try {
	        	 Class.forName("com.mysql.cj.jdbc.Driver");
	         }catch(ClassNotFoundException obj) {
	        	 obj.printStackTrace();
	         }
		
		 //connection is interface
		  try {
 	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","root"); 
      Statement st=con.createStatement();
      
//      String str="create table info(empid int ,empsalary int , empname varchar(20),empDept varchar(20))";
//      st.executeUpdate(str);
 
      String s ="insert into info "+"(empid,empsalary,empname,empDept)"+"values(?,?,?,?)";
      
      Employee e1=new Employee();
      PreparedStatement ps =con.prepareStatement(s);
      ps.setInt(1,e1.empid);
      ps.setInt(2,e1.empsalary);
      ps.setString(3,e1.empname);
      ps.setString(4,e1.empDept);
      ps.executeUpdate();
      
     
      
   
           
      
      con.close();
      
	}catch(SQLException obj) {
 	 obj.printStackTrace();
  }
      System.out.println("table created successfully !");
		
		System.out.println("run successfully ");
	}
}
