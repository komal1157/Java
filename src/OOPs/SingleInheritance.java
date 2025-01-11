package OOPs;


class Hospital{
	int hid;
	String hname;
	Hospital(){
		hid=4;
		hname="vignaharta hospital";
	}
	void display(){
		System.out.println("hid :"+hid);
		System.out.println("hospita name :"+hname);
		
	}
}

class Patient extends Hospital{
	int pid;
	String name;
	int age;
	
	Patient(int p,String q,int r){
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



public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Patient p1=new Patient(3,"kamal",11);
		p1.display();
		
	}

}
