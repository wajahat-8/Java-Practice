package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyExample {
	public static void main(String[] args) {
		FileReader file=null;
		try {
			file = new FileReader("example.txt");
			System.out.println("Filed open successfully");
		}
		catch (FileNotFoundException e) {
		System.out.println("File not found:"+e.getMessage());
		}
		finally {
			if (file!=null) {
				try {
					file.close();
					System.out.println("file closed");
				} catch (IOException e) {
					System.out.println("Error closing the file");
				}
			}
		}
		
	}
	

}
