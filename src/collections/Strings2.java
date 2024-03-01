package collections;

public class Strings2 {
   public static void main( String args[]) {
	   String s1= "core";
	   String s2= "javaa";
	   System.out.println(s1+ " "+ s2);
	   s1 = s1+s2;
	   s2 = s1.substring(0, s1.length()-s2.length());
	   s1 = s1.substring(s2.length());
	   System.out.println(s1 + " " +s2);
	   String s3= "string";
	   String s4 = s3.substring(0, s3.length()-2) + s3.charAt(s3.length()-1)+ s3.charAt(s3.length()-2);
	   System.out.println( s3);
	   System.out.println( s4);
	   
			   
   }
}
