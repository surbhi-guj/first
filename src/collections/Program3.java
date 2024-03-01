package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Program3 {
	
public static void main(String args[]) {
		
		ArrayList l = new ArrayList();
		l.add(30);
		l.add(20);
		l.add(10);
		l.add(40);
		//before sorting
		for( int i =0; i<l.size(); i++) {
			System.out.println( l.get(i));
		}
        //after sorting
		Collections.sort(l);
		for( int i =0; i<l.size(); i++) {
			System.out.println( l.get(i));
		}
        for ( Object o : l) {
        	System.out.println(o);
        }
	}

}
