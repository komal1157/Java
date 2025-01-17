package Package2;

import java.util.LinkedList;

public class subListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<String> str=new LinkedList<String>();
       str.add("komal");
       str.add("sakshi");
       str.add("rohini");
       str.add("rutuja");
     
       System.out.println(str.subList(0, 2));
	}

}
