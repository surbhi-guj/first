//class Car {
//	
//	void tyres() {
//		
//	}
//}
//
//class Swift extends Car {
//	
//	void steeringWheel() {
//		
//		System.out.println("inside steeringWheel() of Swift ");
//	}	
//}
//
//public class Day3 {
//	public static void main(String[] args) {
//		Car car1 = new Car();         
//		Swift swift = new Swift();
//		Car car2 = new Swift();      
//		car2.tyres();    
//		car2.steeringWheel; // this is illegal since I am trying to call method 
		                    // "steeringWheel" on reference variable which is of car type 
		                    // so it will look for steeringWheel method in the car class and 
//	}
//}	
 
 
//class Car {
//	
//	void tyres() {
//		
//	}
//}
//
//class Swift extends Car {
//	
//	void steeringWheel() {
//		
//		System.out.println("inside steeringWheel() of Swift ");
//	}	
//}
//
//public class Day3 {
//	public static void main(String[] args) {
//
//    Car c1 = new Car();    Car c2 = new Car();      Car c3 = new Car();
//    
//    Car[] cars = {c1, c2, c3};
//    for (int i = 0; i < cars.length; i++) {
//    	System.out.println(cars[i]);
//    	cars[i].tyres();
//    }
//
//
//	}
//}	
 
 
//class Car {
//	
//	void tyres() {
//		System.out.println("inside tyres() of Car");
//	}
//}
//
//class Swift extends Car {
//	
//	void steeringWheel() {
//		
//		System.out.println("inside steeringWheel() of Swift ");
//	}	
//}
//
//public class Day3 {
//	public static void main(String[] args) {
//
//    Swift swift1 = new Swift(); Swift swift2 = new Swift();  Swift swift3 = new Swift();
//    
//    Swift swifts[] = {swift1, swift2, swift3};
//    for (Swift value : swifts) {
//    	value.tyres();
//    	value.steeringWheel();
//    }
//
//
//	}
//}	
 
 
//class Car {
//	
//	void tyres() {
//		System.out.println("inside tyres() of Car");
//	}
//}
 
//class Swift {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		
//		System.out.println("inside steeringWheel() of Swift ");
//	}	
//}
//
//public class Day3 {
//	public static void main(String[] args) {
//
//    Swift swift1 = new Swift(); Swift swift2 = new Swift();  Swift swift3 = new Swift();
//    
//    Swift swifts[] = {swift1, swift2, swift3};
//    swift1.i = 50;        swift3.i = 10;
//    int sum = 0;
//    for (Swift value : swifts) {
//    	
//    	value.steeringWheel();
//    }
//
//    System.out.println(sum);
//
//	}
//}	


// c1 c2 c3 are just instances or references.
//ARRAY OF OBJECTS

//class Car {
//	int i = 4;
//	int mileage = 4000;
//
//	void tyres() {
//
//		System.out.println("Inside tyres of car");
//
//	}
//}
//class Swift extends Car {
//	int j = 5;
//
//	int average = 15;
//	int mileage = 2000; // here preference is given to local variable.
//
//	void steeringWheel() {
//		int mileage = 20;
//		System.out.println(" inside SteeringWheel of Swift" + average + mileage);
//		System.out.println(mileage + this.mileage + super.mileage); // parent>>global>>local
//	}
//}
//public class second {
//	
//	public static void main(String args[]) {
//		Swift swift1 = new Swift();
//		swift1.steeringWheel();
//		swift1.tyres(); 
//		System.out.println(swift1.j);
//		Car car = new Car();
//		car.tyres();
//		System.out.println( swift.j);
//		System.out.println(car.mileage);
//		System.out.println(swift1.average);
//		System.out.println( swift1.steeringWheel());
//		
//		
//		
//   
//}


//ASSIGNMENT

//println method prints the text and gives a new line

//public class second {
//	 
//	public static void main( String args) {
//		
//		arr[][] = { {1,2,3}, {4,5,6}, {7,8,9}};
//		int new_arr[][] = new int[3][3];
//		
//		for( int i = 0; i< arr.length; i++  ) {
//			
//			for( int j = 0; j<arr.length; j++) {
//				
//				new_arr[] = 
//			}
//		}
//	}
//}
//

// METHOD OVERRIDING 
// IT SAYS THAT EVERYTHING

//SIGNATURE OF A METHOD - METHOD ARGS, METHOD RETURN TYPE AND 
//class Car( ) {
//	
//}
//class Swift extends Car {
//	
//}
//
//public class second {
//	
//}
//
//
//// RUNTIME POLYMORPHISM it checks on the basis of parent class and runs child. it checks on the basis of reference variable and runs the object.
//
//class Car( ) {
//	void tyres() {  //this is overriden method
//	
//}
//class Swift extends Car {   //this is overriding method
//	
//	void tyres() {
//		sopln("inside tyres of swift");
//	}
//}
//
//public class second {
//	psvm (sa){
//		
//	}
//}


//final keyword

//class Car( ) {
//	final void tyres() {  //this is overriden method
//	 sopln("inside tyres() of car")
//}
//class Swift extends Car {   //this is overriding method
//	
//	void tyres() {
//		sopln("inside tyres() of swift");  //here it is illegal since i am trying to override the final method in parent class.
//	}
//}
//
//public class second {
//	psvm (sa){
//		
//	}
//}

//string class is final. As it cannot be extended means cant have a child class.


// final class Car( ) {
//	final void tyres() {  
//	 sopln("inside tyres() of car")
//}
//class Swift extends Car {   
//	
//	void tyres() {
//		sopln("inside tyres() of swift");  
//	}
//}
//
//public class second {
//	psvm (sa){
//		
//	}
//}

// FINAL KEYWORD WITH VARIABLE

//class Car( ) {
//	final void tyres() {  //this is overriden method
//	 sopln("inside tyres() of car")
//}
//class Swift extends Car {   //this is overriding method
//	
//	final int i = 20;
//	void tyres() {
//		
//	    i = 20; // you cannot assign any new value to final variable. final says you cant reassign its value.
//		sopln("inside tyres() of swift");   
//	}
//}
//
//public class second {
//	public static void main(String[] args){
//		
//	}
//}


// final int i ; // it is not possible to create uninitialized final variable.

// METHOD OVERLOADING

// public class Arithmetic( ) {
//	  
//	void add( int i, int j) {  
//	  sopln( i + j);
//	  }
//	void add( int i. int j, int k) {
//		sopln( i + j +k);
//	}
//	
//	void add( double i, int j) {
//		
//		sopln(i + j);
//	}
//}
//
//
//public class second {
//	psvm (sa){
//		
//		Arithmetic arithmetic = new Arithmetic();
//		arithmetic.add( 10, 30);
//		arithmetic.add( 10, 30, 10);
//	    arithmetic.add( 18.5, 45);	
//	}
//}

// IN OVERLOADING. METHOD NAME MUST BE SAME IN A CLASS AND METHOD ARG LIST MUST BE DIFFERENT, BUT RETURN TYPE MIGHT CHANGE.


// method inside method is not allowed, but nested classes are allowed.
// 	NEW CLASS JAVA PRACTICE
//public class Second{
//	
//	
//	 static {  //multi line static initializer- this automatically executes.
//		 
//	 }
//	 public static void main(String[] args) {
//		 
//		 char c = 'a';
//		 double d = c;
//		 System.out.println( d);
//		//EXPLICIT TPYE CASTING
//		 
//		 int a = 237;
//		 byte b = (byte) a;
//		 System.out.println( b);
//		 
//	 }
//}

public class Father{
	 int height;
	 
	 void function1(){
		 System.out.println( height);
	 }
	 
}
public class Son extends Father{
	
	int weight;
	void function2(){
		
		System.out.println(weight);
		System.out.println(height);
		
	}
}

public class Second{
	
	public static void main(String[] args) {
		 
		 Son son1 = new Son();
		 son1.function1();
		 son1.function2();
		 System.out.println( );
		 System.out.println( );
		 
	 }
}

//Abstract class

package day1;
public abstract class A{
	
	abstract public void m1();
	
	public void m2() {
		System.out.println("cg");
	}
	//2 properties
}

package day1;
public abstract class B extends A{
	
	abstract public void m2();
	//3 properties

}

package day1;
public class C extends B{
	
	@override
	public void m1() {
		
		System.out.println(cg1);
	}
	@override
	public void m3() {
		
		System.out.println(cg2);
		
	}
}


//interfaces
package day1{
	
	public inteface A3{
		
		void m2();
	}
}



























