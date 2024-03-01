package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program5 {

	public static void main(String args[]) {

		String path = "c:\\hello/abc1.txt";
		File f= new File(path);
		System.out.println(f.length());
		FileReader fr= null;
		try {
			fr = new FileReader(path);
			int size = (int)f.length();
			
			System.out.println("f.length()");
			char[] c1 = new char[size];
			fr.read(c1);
			System.out.println( c1);
			System.out.println("Reading data is completed");
			fr.close();

		} catch (IOException e) {
			System.out.println("Error in printing the data");
			e.printStackTrace();
		}

	}
}
