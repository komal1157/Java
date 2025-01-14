package FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file =new File("Logcat1.txt");
			FileReader reader =new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			if(!file.exists()) { 
				file.createNewFile();
				System.out.println("new file created");
			}
			else {
				System.out.println("file already exits");
			}
			
			System.out.println("read "+br.read());//  for read single character 
			
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line); 
			}
			
		}catch(IOException obj){
		System.out.println("Error :");
		obj.printStackTrace();
		}	
	}
}
