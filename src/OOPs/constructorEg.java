package OOPs;
import OOPs.Employee;


public class constructorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Employee e1=new Employee();
		Employee e2=new Employee(33,"komal","developer",330000);
		e1.display();
		e2.display();
	}

}
