//package package_1;
//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//// Class name should be "Source",
//// otherwise solution won't be accepted
//class Utility {
//	public static int fahrenheitToCelcius(double farhenheit) {
//
//		int temp_celsius = int((farhenheit- 32) * 5/9);
//		return temp_celsius;
//
//	}
//	
//	
//	public static String getLevel(int[] array) {
//
//		int sum=0;
//		for( int i = 0; i< array.length;i++){
//			sum = sum + array[i];
//		}
//		if (sum >=100){
//			return "HIGH";
//		}
//		else if (sum >=70){
//			return "MEDIUM";
//		}
//		else {
//			return "LOW";
//		}
//	}
//
//
//}
//public class tempchange {
//	public static void main(String args[] ) throws Exception {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		if ( i == 1){
//			
//			double temp = sc.nextDouble();
//			int temp_celsius = fahrenheitToCelcius( temp);
//			System.out.println( temp_celsius);
//
//		}
//		else if ( i ==2){
//
//			int n = sc.nextInt();
//			int array[] = new int[n];
//			for (int j = 0; j<n; j++){
//				array[j]= sc.nextInt();
//			}
//			String result = getLevel(array);
//			System.out.println( result);
//
//		}
//		else{
//			System.out.println( "Invalid Option");
//		}
//	}
//}
