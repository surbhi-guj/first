package collections;

import java.util.HashSet;

public class set {

	public static void main( String args[]) {
		
		HashSet h = new HashSet();
		h.add(10);
		h.add(10);
		h.add("java");
		h.add("java");
		h.add(11.22);
		h.add(null);
		
		System.out.println(h.size());
		 for( Object o:h) {
			 System.out.println(o);
		 }
	}
}
