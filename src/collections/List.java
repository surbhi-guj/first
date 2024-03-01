package collections;

import java.util.ArrayList;
public class List {

	public static void main(String args[]) {
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(11.22);
		l.add(11.22);
		l.add("java");
		l.add("java");
		l.add("java");
		l.add(null);
		l.add('$');
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(2));
		//System.out.println(l.get(250));//index is out of bounds or range
		System.out.println(l.contains(20));
		System.out.println(l.contains(999));
		System.out.println(l);
		l.remove(l);
		System.out.println(l);
        System.out.println(l.indexOf(10));
        System.out.println(l.indexOf(888));
        System.out.println(l.lastIndexOf(10));
        System.out.println(l.isEmpty());
        l.clear(); //removes all the elements in the list
        System.out.println(l.isEmpty());
		
	}
}
