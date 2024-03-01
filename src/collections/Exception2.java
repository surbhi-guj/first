package collections;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception2 {
    
	void readData() throws FileNotFoundException {
		FileReader f = new FileReader("abc.txt");
		
	}
	public static void main(String args[]) {
		Exception2 p = new Exception2();
		try {
		   p.readData();
		}
		catch( FileNotFoundException e){
			
			System.out.println("FILE NOT FOUND");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}
}
