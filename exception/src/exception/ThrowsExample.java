package exception;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			readFile("example.txt");
			
		} catch (IOException e) {
			System.out.println("Exception caught: "+e.getMessage());
			
		}
		
		
		
	}
	public static void readFile(String fileName) throws IOException{
		FileReader file=new FileReader(fileName);
		System.out.println("file read successfully");
	}
	

}
