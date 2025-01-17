package package1;

import java.util.ArrayList;

public class retainAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> str= new ArrayList<String>();
        str.add("komal");
        str.add("nikita");
        str.add("sanika");
        
        ArrayList<String> str1=new ArrayList<String>();
        str1.add("komal");
        str1.add("monika");
        str1.add("sanika");
        
        str.retainAll(str1);
        System.out.println(str);
		
		
	}

}
