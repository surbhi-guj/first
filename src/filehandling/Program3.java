package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String args[]) {
		   try {
                FileWriter f= new FileWriter("C:\\hello/abc1.txt");    //create a file
		        f.write("hi how are you");
			
				f.flush();  //method used to flush or print the data in the file
				System.out.println("writing data is completed");
				
			}
			catch( IOException e){
			   System.out.println("Error in printing the data");
			   e.printStackTrace();
			}
	
	}
}

