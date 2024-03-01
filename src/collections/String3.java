package collections;

import java.util.Scanner;

// To count the no of characters present in string
public class String3 {
   
	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a alphanumeric");
		String str=sc.next();
		int count =0;
		for( int i =0; i<str.length(); i++) {
			char ch[] = str.toCharArray();
			if( ch[i]>= 65 && ch[i]<=122 || ch[i]>=48 && ch[i]<=57 && ch[i]!=' ' && ch[i]!=',' && ch[i]!='.');
			{
				count++;
			}
		}
		System.out.println("No of characters are : "+ count);
		
		}

}
