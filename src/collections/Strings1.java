package collections;

public class Strings1 {
	
	public static void main( String[] args) {
		
		String s1="java";
		String s2= "JaVa";
		String s3= "java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s="software Engineer";
		System.out.println(s.substring(8));
		System.out.println(s.substring(8, 13));
		
	}

}
