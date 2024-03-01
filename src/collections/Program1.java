package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program1 {
	
	public static void main(String args[]) {
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a + " " + a.size());
		LinkedList l = new LinkedList();
		l.addAll(a);
		l.add(20);
		l.add(40);
		l.add(50);
		System.out.println(l + " "+ l.size());
		System.out.println(l.containsAll(a));
		l.removeAll(a);
		System.out.println(l);
		
		
	}

}
