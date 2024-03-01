package collections;

import java.util.Scanner;

public class String5 {
	public static void main( String args[]) {
		//to find the sum of nos in alphanumerics
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an alphanumeric");
		String str = sc.next();
		int j =0;
		char[] ch= str.toCharArray();
		for( int i =0; i< ch.length; i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				j+= ch[i]-48;
			}
		}
		System.out.println(j);
	}

}
