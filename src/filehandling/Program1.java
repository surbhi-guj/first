package filehandling;

import java.io.File;

public class Program1 {

	public static void main(String args[]) {
		File f = new File("c:\\hello");    //create a folder
		if (f.exists()== false) {
			f.mkdir(); //create a folder
			System.out.println("folder created");
			
		}
		else {
			System.out.println("folder already exists");
		}
	}
	
}
