package Package2;

import java.util.LinkedList;

public class retainsAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String>str=new LinkedList<String>();
    str.add("India");
    str.add("maharashtra");
    str.add("pune");
    str.add("satara");
    
    LinkedList<String> str1=new LinkedList<String>();
    str1.add("satara");
    str1.add("pune");
    str1.add("India");
    str1.add("kada");
    str.retainAll(str1);
    System.out.println(str);
    
	}

}
