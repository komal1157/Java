package package1;

import java.util.ArrayList;

public class removeIfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer>Number=new ArrayList<Integer>();
		
		Number.add(9);
		Number.add(2);
		Number.add(5);
		Number.add(6);
		Number.removeIf(n -> n%2==0);
		
			System.out.println(Number);
		
		
		
	}

}
