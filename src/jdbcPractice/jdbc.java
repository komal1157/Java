package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Dept {
	 int deeptid ;
	 String name;
	 Dept(int id ,String n ){
		 deeptid=id;
		 name=n;
	 }
}

public class jdbc {
    public static void main (String[] args) {
    	
    	try {
       	 Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException obj) {
       	 obj.printStackTrace();
        }
        
        try {
       	 
       	 //connection is interface
       	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","root"); 
            Statement st=con.createStatement();
            String q1 ="create table Dept1(deeptid int not null,name varchar(20))";
//            st.executeUpdate(q1);
            
            // insert 
            Dept d1= new Dept(1,"Engg");
            Dept d2= new Dept(2,"Engg 2");
            Dept d3= new Dept(3,"Enggineering");
            String q2="insert into dept1 (deeptid ,name) values(?,?)";
            PreparedStatement ps =con.prepareStatement(q2);
            ps.setInt(1,d1.deeptid);
            ps.setString(2, d1.name);
            ps.executeUpdate(); 
            ps.setInt(1,d2.deeptid);
            ps.setString(2, d2.name);
            ps.executeUpdate(); 
            ps.setInt(1,d3.deeptid);
            ps.setString(2, d3.name);
            ps.executeUpdate(); 
            
            //update 
            String q3="update dept1 set deeptid=? where name=?";
            PreparedStatement ps1=con.prepareStatement(q3);
            ps1.setInt(1, 0);
            ps1.setString(2,"Engg");
            ps1.executeUpdate();
            
            //delete
            String q4="delete from dept1 where name=?";
            PreparedStatement ps2=con.prepareStatement(q4);
            ps2.setString(1, "Engg");
            ps2.executeUpdate();
            
            //select 
            ResultSet rs=st.executeQuery("select * from Dept1");
            while (rs.next()) {
           	 System.out.println("deptid ="+rs.getInt(1));
           	 System.out.println("deprname ="+rs.getString(2));
            }
           
            rs.close();
            st.close();
            con.close();
            
        }catch(SQLException obj) {
       	 obj.printStackTrace();
        }
        System.out.println("program excuted successfully !");
    }
	
}
