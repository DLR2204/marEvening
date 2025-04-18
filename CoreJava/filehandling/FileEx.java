package filehandling;

import java.io.File;
import java.io.IOException;

public class FileEx {
	
	 public static void main(String[] args) throws IOException {
		
		 File obj = new File("C:\\Users\\PRADEEP GOUD\\Desktop\\November.exe"); 
		 
		 obj.createNewFile();
		 
		 System.out.println("File is created successfully");
	}

}
