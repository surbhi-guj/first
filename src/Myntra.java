
//COMPILE TIME POLYMORPHISM

public class Myntra {
   
	public void purchase(String product){
		System.out.println( product);
		
	}
	public void purchase(String product, int cost) {
		
		System.out.println( product);
		System.out.println( cost);
	}
	
	
	public void purchase( int cost, String product) {
		
		System.out.println( cost);
		System.out.println( product);
	}
	public static void main( String args[]) {
		
		Myntra m = new Myntra();
		m
		
	}
}

