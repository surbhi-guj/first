
// CUSTOM EXCEPTIONS
package collections;
import java.util.Scanner;
class Exception3 {
	  public static void main( String args[]) {
		   Scanner sc = new Scanner(System.in);
		   int balance = 5000;
		   System.out.println("Enter an amount");
		   int amt= sc.nextInt();
		   if( amt <= balance) {
			   System.out.println("withdrawal successful");
		   }
		   else {
			   try {
				   InsufficientBalanceException i = new InsufficientBalanceException();
				   throw i;
			   }
			   catch(InsufficientBalanceException e){
				   System.out.println("not enough balance");
			   }
		   }
		   
     }

}
