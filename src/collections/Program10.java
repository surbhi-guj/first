package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program10 {
public static void main( String args[]) {
		
		LinkedList<Emp> l= new LinkedList();
		l.add(new Emp(101, "tom"));
		l.add(new Emp(102, "ana"));
		l.add(new Emp(103, "charles"));
		
		l.add(new Emp(104, "sana"));
		for (Emp e : l) {
			System.out.println(e);
		}
}
}
