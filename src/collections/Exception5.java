package collections;

import java.util.Scanner;

public class Exception5 {
 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if( age>=18) {
			System.out.println("get your DL");
		}
		else {
			try {
				throw new AgeInvalidException("not 18 yet");
			}
			catch( AgeInvalidException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
