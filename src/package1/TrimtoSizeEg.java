package package1;
import java.util.ArrayList;

public class TrimtoSizeEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> Numbers=new ArrayList<Integer>();
         Numbers.add(2);
         Numbers.add(1);
         Numbers.add(3);
         Numbers.add(9);
         Numbers.add(5);
         Numbers.trimToSize();
         System.out.println(Numbers);
	}	
}
