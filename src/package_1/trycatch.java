//package package_1;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class trycatch {
//
//	public static void main(String args[]) throws Exception {
//
//		ArrayList<String> list = ExceptionCheck.numberCheck("1234f");
//		System.out.println( list);
//		String filename = ExceptionCheck.fileCheck("av.txt");
//		System.out.println(filename);
//		
//	}
//
//}
//
//class ExceptionCheck {
//
//	List<String> numberCheck(String str) {
//
//		List<String> list = new ArrayList<String>();
//
//		for (int i = 0; i < str.length(); i++) {
//
//			try {
//				if (Character.isDigit(str.charAt(i))) {
//
//					list.add(" " + str.charAt(i));
//				} else {
//
//					String errorStr = "For input string:" + "\"" + str.charAt(i) + "\"";
//					list.add(errorStr);
//					throw new NumberFormatException();
//
//				}
//			}
//
//			catch (Exception e) {
//				System.out.println("inside catch...");
//			}
//		}
//		return list;
//
//	}
//
//	String fileCheck(String filename) {
//	
//	  File file = new File(filename);
//	  String message= "filename";
//	  try {
//		  if( file.exists()) {
//			  message = "File Found";
//		  }
//		  else {
//			  throw new FileNotFoundException("File not found exception");
//		  }
//	  }
//		 
//	  catch (Exception e) {
//			 
//		  }
//		  return message;
//	  }
//	
//}
