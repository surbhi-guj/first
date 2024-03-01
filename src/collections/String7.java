
//PALINDROME STRING
package collections;

import java.util.Scanner;

public class String7 {
	

	public static void main( String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st = sc.next();
	    String st1="";
	    char ch[] = st.toCharArray();
		for( int i= 0; i< st.length()/2; i++) {
			
			char t= ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i]= t;
		}
		st1 = new String(ch);
		if( st1.equalsIgnoreCase(st)) 
			System.out.println(st + " is palindrome");
		else
		    System.out.println(st + " is not palindrome");
	}

}
