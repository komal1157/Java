package package1;

import java.util.ArrayList;

public class addAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> village=new ArrayList<String>();
         village.add("Deolali");
         village.add("Kashti");
         village.add("kada");
         
         ArrayList<String> Student =new ArrayList<String>();
         Student.add("komal");
         Student.add("jalindar");
         Student.add("navle");
	     village.addAll(Student);
        System.out.println(village);
	}

}
