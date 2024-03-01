package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Program5 {
	
	public static void main( String args[]) {
		
		ArrayList l1= new ArrayList(50);
		ArrayList l= new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		LinkedList l2= new LinkedList(l);
		l2.add(30);
		l2.add(40);
		System.out.println(l2);
		Vector v = new Vector(l2);
		v.add(50);
		v.add(60);
		System.out.println(v);
		LinkedList l3= new LinkedList(v);
		l3.add(70);
		l3.add(80);
		System.out.println( l3);;
		for( Object o: l2) {
			System.out.println( o);
		}
		
		
		
	}

}
