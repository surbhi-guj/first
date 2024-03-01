package collections;

import java.util.LinkedHashSet;

public class Program11 {

public static void main( String args[]) {
		
		LinkedHashSet<String> t = new LinkedHashSet();
		t.add("java");
		t.add("java");
		t.add("sql");
		t.add("sql");
		t.add("10");
		System.out.println(t);
		for( Object o : t) {
			
			System.out.println(o);
		}
}		
		
		
}
