package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter obj = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\November.txt");

		BufferedWriter bw = new BufferedWriter(obj);

		bw.write(1234);
		
		bw.newLine();

		bw.write("good morning");
		
		bw.newLine();

//	     bw.write(true);
//	     
//	     bw.write(3.14f);

		char ch[] = { 'a', 'b', 'c', 'd' };

		bw.write(ch);

		bw.flush();

		bw.close();

		System.out.println("The file is written successfully");

	}
}
