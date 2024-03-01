package collections;

import java.util.Scanner;

public class Exception4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name= sc.next();
		System.out.println("Enter a password");
		int pwd = sc.nextInt();
		if(name.equalsIgnoreCase("Smith")) {
			if (pwd == 12345) {
				System.out.println("login successful");
			}
			else {
				try {
					InvalidPasswordException i = new InvalidPasswordException();
					throw i;
				}
				catch(InvalidPasswordException e){
					System.out.println("invalid password");
				}
			}
			
		}
		else {
			try {
				throw new InvalididException();
			}
			catch(InvalididException e){
				System.out.println("Invalid id");
			}
		}
		sc.close();
	}
}
