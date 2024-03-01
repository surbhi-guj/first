package collections;


import java.util.ArrayList;
import java.util.Collections;

public class Program4 {
	
public static void main(String args[]) {
		
		int a[]= {10,20,30};
		
		for( int i =0; i< a.length; i++) {
			System.out.println( a[i]);
		}
        for ( int i :a) {
        	System.out.println(i);
        }
        double d[]= {1.2, 2.3, 3.4};
        for ( double e : d) {
        	System.out.println(e);
        }
        String[] name= {"tom", "sana", "smith"};
        for ( String s : name) {
        	System.out.println(s);
        }
	}

}
