package OOPs;

// method overloading means two or more method with same method name but different inparametr or data type 
class A{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A obj_1=new A();
       System.out.println(obj_1.add(12, 20));
       
       System.out.println(obj_1.add(12, 20, 30));		
		
	}

}
