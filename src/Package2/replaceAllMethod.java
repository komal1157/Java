package Package2;

import java.util.LinkedList;

public class replaceAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer> Number=new LinkedList<Integer>();
       Number.add(3);
       Number.add(8);
       Number.add(2);
       Number.add(4);
       Number.replaceAll((n) -> n = n *2);
       System.out.println(Number);
	}

}
