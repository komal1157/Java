package Package2;

import java.util.LinkedList;

public class removeIfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Integer>Number=new LinkedList<Integer>();
     Number.add(1);
     Number.add(2);
     Number.add(3);
     Number.add(4);
     Number.add(5);
     Number.add(6);
     Number.removeIf(n ->  n % 2==0);
     System.out.println(Number);
	}

}
