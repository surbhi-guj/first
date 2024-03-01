package filehandling;

import java.io.File;
import java.io.IOException;

public class Program2 {

	public static void main(String args[]) {
		File f = new File("C:\\hello/abc.txt");    //create a file
		if (f.exists()== false) {   //tofile is already present or not
			try {
				f.createNewFile();  //create a file
				System.out.println("file created");
				
			}
			catch( IOException e){
				e.printStackTrace();
			}
		}
		else {
			System.out.println("folder already exists");
		}
	}
}
