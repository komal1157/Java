package OOPs;

public class Employee {

	public String name;
	public String dept;
	public int empid;
	private double salary;
	
	//default constructor
	Employee (){
		empid=1;
		name="founder";
		salary=0.00;
		dept="none";
		
	}
	
	// parametrize constructor
	
	Employee (int id,String x ,String y,double z){
		empid=id;
		name=x;
		salary=z;
		dept=y;
		
	}
	void display() {
		System.out.println("empid "+empid);
		System.out.println("name "+name);
		System.out.println("salary "+salary);
		System.out.println("dept "+ dept);
	}
	
	
}
