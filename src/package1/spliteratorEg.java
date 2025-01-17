package package1;

import java.util.ArrayList;
import java.util.Spliterator;

public class spliteratorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		  
		    // Get the spliterator and split it
		    Spliterator<String> it1 = cars.spliterator();
		    Spliterator<String> it2 = it1.trySplit();
		    
		    // Loop through the first spliterator
		    System.out.println("First spliterator");
		    while( it1.tryAdvance( (n) -> { System.out.println(n); } ) );
		    
		    // Loop through the second spliterator
		    System.out.println("\nSecond spliterator");
		    while( it2.tryAdvance( (n) -> { System.out.println(n); } ) );
	}

}
