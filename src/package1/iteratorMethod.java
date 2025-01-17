package package1;

import java.util.ArrayList;
import java.util.ListIterator;

public class iteratorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> Number=new ArrayList<Integer>();   
		Number.add(3);
		Number.add(7);
		Number.add(6);
		Number.add(4);
		
		ListIterator<Integer> it=Number.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
