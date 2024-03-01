package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Program6 {
	public static void main(String args[]) {
		   
             FileReader f= new FileReader("C:\\Users\\surbh\\OneDrive\\Documents\\qwerty.txt");    
		     BufferedReader br = new BufferedReader(f);
			 String s="";
			 PrintWriter wr = new PrintWriter();
				
			 while( s!=null) {
				 
				 System.out.println(s);
				 s = br.readLine();
				 System.out.println(s);
		      }
	}
}
