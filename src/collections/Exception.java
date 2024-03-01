package collections;

public class Exception {

	
	static void display() throws InterruptedException
	{
		for( int i =0;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(300); //will delay for some ms
			
		}
	}
	public static void main( String args[]) {
		try {
			display();
		}
		catch( InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}
