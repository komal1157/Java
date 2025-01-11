
package OOPs;


class Hospitals{
	int hid;
	String hname;
	Hospitals(){
		hid=4;
		hname="vignaharta hospital";
	}
	void display(){
		System.out.println("hid :"+hid);
		System.out.println("hospita name :"+hname);
		
	}
}

class patients extends Hospitals{
	int pid;
	String name;
	int age;
	
	patients(int p,String q,int r){
		super();
       pid=p;
       name=q;
       age=r;
	}
	void display() {
		super.display();
		System.out.println("pid "+pid);
		System.out.println("pname :"+name);
		System.out.println("age :"+age);
	}
}
class legalGuardian extends patients{
	int lgid;
	String lname;
	String Phone;
	legalGuardian(int id,String ln,String phone ,int pid,String name,int age ){
		 super(pid,name,age);
		 lgid=id;
		 lname=ln;
		 Phone=phone;
		 
		 
	}
	void display() {
		System.out.println("Legal Guardian detials  :");
		System.out.println("lid  :"+lgid);
		System.out.println("lname   :"+lname);
		System.out.println("Legal  Guardian phone   :"+Phone);
		super.display();
		
	}
}



public class multilevelInheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
//		Patient p1=new Patient(3,"kamal",11);
//		p1.display();
		
		 legalGuardian l1= new  legalGuardian (1,"9403651157","komal" ,33,"komal navale",2);
		 l1.display();
	}

}
