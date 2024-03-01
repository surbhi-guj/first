package filehandling;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Program7 {

	public static void main(String args[]) {
		FileInputStream fis = new FileInputStream("C:\\Users\\surbh\\OneDrive\\Documents\\qwerty.txt");
		int i = fis.read();
		while( i!=-1) {
            System.out.println((char) i);	
            i =fis.read();
		}
	}
}
