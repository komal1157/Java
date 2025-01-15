package FileHandling;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file =new File("Log.txt");
			if(!file.exists()) { 
				file.createNewFile();
				System.out.println("new file created");
			}
			else {
				System.out.println("file already exits");
			}
			
			//writing  file 
			
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			Scanner sc =new Scanner(System.in);
			String var;
			System.out.println("Enter text :");
			var=sc.next();
			bw.write(var);
			bw.close();
		}catch(IOException obj){
		System.out.println("Error :");	
		obj.printStackTrace();
		}		
	}

}
