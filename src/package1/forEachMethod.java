package package1;

import java.util.ArrayList;

public class forEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> Number = new ArrayList<Integer>();
      Number.add(2);
      Number.add(3);
      Number.add(9);
      Number.add(8);
      Number.forEach( (n) -> {System.out.println(n); });
   
	}

}
