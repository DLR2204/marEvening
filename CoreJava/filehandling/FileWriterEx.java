package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter obj = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\November.txt");
	
	     obj.write(1234);
	     
	     obj.write("good morning");
     
//	     obj.write(true);
//	     
//	     obj.write(3.14f);
	     
	     char ch[] = {'a','b','c','d'};
	     
	     obj.write(ch);
	     
	     obj.flush();
	     
	     obj.close();
	     
	     
	     System.out.println("The file is written successfully");
	
	
	}

}
