package package1;

import java.util.ArrayList;

public class ensureCapacityMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> str=new ArrayList<Integer>();
     str.ensureCapacity(10);
     for(int i=1;i<=10;i++) {
    	 str.add(i);
     }
     System.out.println(str);
	}
}
