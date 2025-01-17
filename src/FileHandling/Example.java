package FileHandling;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		File file=new File("book.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println(" new file created successfully !");
				}else {
					System.out.println("file already exist !");
				}
		}catch(IOException o) {
			o.printStackTrace();
		}
	}
}
