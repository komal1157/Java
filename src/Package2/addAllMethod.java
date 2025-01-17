package Package2;

import java.util.LinkedList;

public class addAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Float> Number= new LinkedList<Float>();
       Number.add(9.9f);
       Number.add(7.7f);
       Number.add(2.3f);
      
       LinkedList<Float> Number1=new LinkedList<Float>();
       Number1.add(2.4f);
       Number1.add(4.5f);
       Number1.add(1.9f);
       
       Number.addAll(Number1);
       System.out.println(Number);
       
       
       
	}

}
