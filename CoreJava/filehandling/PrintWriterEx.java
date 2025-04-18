package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw  = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\November.txt");
	
		pw.println(1234);
		
		pw.println(true);
		
		pw.println(3.14f);
		
		pw.println("good morning");
		
		char ch[] = {'a','c','f','r'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("The file is writted successfully");
		
		
	}

}
