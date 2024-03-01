package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program8 {

	
	public static void main( String args[]) {
		
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		for (Integer i : l) {
			System.out.println(i);
		}
		LinkedList<String> l1= new LinkedList();
		l1.add("java");
		l1.add("sql");
		l1.add("web");
	    
		for( String s: l1) {
			System.out.println(s);
		}
		
		
	}	
}
