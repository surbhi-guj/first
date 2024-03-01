package collections;

public class Mobile {
   public static void main( String srgs[]) {
	   Mobile m= new Mobile();
	   System.out.println(m);
	   System.out.println(m.toString());
	   System.out.println(m.hashCode());
	   Mobile m1 = new Mobile();
	   Mobile m2 = new Mobile();
	   System.out.println( m1.equals(m2));
	   System.out.println( m1== m2);
   }
}
