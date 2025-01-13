package OOPs;

import OOPs.SingleInheritance;

class Doctor extends Hospital{
	int did;
	String dname;
	int dage;
	
	
	Doctor(int id,String n,int m){
		super();//to call the parent class constructor 
		did=id;
		dname=n;
		dage=m;
	}
	void display() {
		super.display();
		System.out.println("Doctor id"+ did );
		System.out.println("Doctor name"+dname);
		System.out.println("Doctor age"+dage);
	}
}


public class HeararchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Doctor d1=new Doctor(99,"komal doctor",11);
		d1.display();
		Patient p1=new Patient(22,"komal patient ",44);
		p1.display();
	}

}
