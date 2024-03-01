package collections;

import java.util.Scanner;

public class String6 {
  
	public static void main( String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str= sc.nextLine();
	    int count=0;
		for( int i= 0; i< str.length(); i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=="I" ....) {
				
				count++;
				System.out.println(str.charAt(i));
			}
			
		}
		
		System.out.println("No of vowels present are :" + count);
	}
}
