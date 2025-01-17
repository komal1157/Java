package package1;

import java.util.ArrayList;

public class replaceAllEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> Numbers =new ArrayList<Integer>();
     Numbers.add(1);
     Numbers.add(2);
     Numbers.add(3);
     Numbers.add(4);
     Numbers.replaceAll(n ->n*2);
	 System.out.print(Numbers);
	}
}
