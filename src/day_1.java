
/* public class day_1 {
	int i = 4; // does not work 
   public static void main(String args[])
   {
	   System.out.println('hello');
	   Day1 day1 = new Day1(); // this rhs returns a 
	   System.out.println (day1.i);
   }
}
*/
// select all and ctrl + / for comments.

// wap to add 2 nos

//public class day_1
//{
//	int firstno = 4;
//	int secondno = 5;
//	int result ; //here, since result is not assigned any value then '0' will be assigned.
//   public static void main(String args[])
//   {
//	   
//	   day_1 day1 = new day_1(); // Business logic is written inside main()
//	   int result = day1.firstno + day1.secondno ;
//	   System.out.println (result);
//   }
//}

// Multiple Objects
//public class day_1
//{
//	int firstno = 4;
//	int secondno = 5;
//	int result ; //here, since result is not assigned any value then '0' will be assigned.
//   
//	public static void main(String args[])
//    {
//	   
//	   day_1 day1 = new day_1(); 
//	   day_1 day2 = new day_1();
//	   day1.result = day1.firstno + day1.secondno ;
//	   System.out.println (day1.firstno);
//	   System.out.println (day1.secondno);
//	   System.out.println (day1.result);
//	   System.out.println (day2.firstno);
//	   System.out.println (day2.secondno);
//	   System.out.println ( day2.result);
//	   System.out.println (day1.result);
//	   
//	   System.out.println ("after changing states...");
//	   day2.secondno = 100;
//	   day2.result = day2.firstno + day2.secondno ;
//	   System.out.println (day2.firstno);
//	   System.out.println (day2.secondno);
//	   System.out.println (day2.result);
//    }
//}

// add objects from 2 diff nos 

//METHODS

//public class day_1
//{
//   int i = 4;
//   public static void main(String args[])
//   {
//	   
//	   day_1 day1 = new day_1(); 
//	   day1.add();
//	   
//   }
//   
//   void add() {
//	   System.out.println("Hello");
//	   System.out.println(i); // this is legal, control jumps to i and comes back
//	   
//   }
//}

//public class day_1
//{
//   int i = 4;
//   public static void main(String args[])
//   {
//	   
//	   day_1 day1 = new day_1(); 
//	   day_1 day2 = new day_1(); 
//	   
//	   day1.add();
//	   day2.add();
//	   day2.i = 10;
//	   System.out.println( day2.i);
//	   System.out.println("After Updating...");
//	   
//	   day1.add();
//	   day2.add();
//	   
//   }
//   
//   void add() {
//	   
//	   int i = 5;
//	   int j = 6;
//	   System.out.println(i);
//	   System.out.println(j);
//	   System.out.println(this.i);
//	   
//	   
//   }
//}

//RETURN TYPES are used when we want to access the data somewhere else.

//class day_1 {
//
//	int i = 4, j = 5, k;
//
//	public static void main(String args[]) {
//		day_1 a = new day_1();
//		a.add();
//	}
//
//	int add() {
//		int value = 100;
//		k = i + j; // internally it is day2.k
//		system.out.println(k);
//		return value;
//	}
//}

//public class day_1 {
//
//	int i = 4, j = 5, k;
//
//	public static void main(String args[]) {
//		day_1 a = new day_1();
//		int returnedValue = a.add();
//		System.out.println(a.k);
//		System.out.println(returnedValue);
//
//	}
//
//	int add() {
//		int value = 100;
//		value = i + j + k;
//
//		return value;
//	}
//}

// METHOD ARGUMENTS

//public class day_1 {
//
//	public static void main(String args[]) {
//		day_1 a = new day_1();
//		a.add(35, 65);
//
//	}
//
//	void add(int value1, int value2) {
//
//		int result = value1 + value2;
//
//		System.out.println(" Inside add()...." + result);
//
//	}
//}

// STATIC KEYWORD

//public class day_1 {
//
//	int height = 1;
//	int aptitude = 20;
//	int muscularstrength = 10;
//	int firstno = 4, secondno = 10, result;
//
//	public static void main(String[] args) {     //static keyword is used where state of the object is not changing.
//
//		day_1 obj1 = new day_1();
//		System.out.println(obj1.height);
//		System.out.println(obj1.aptitude);
//		System.out.println(obj1.muscularstrength);
//		System.out.println(obj1.firstno);
//		System.out.println(obj1.secondno);
//		System.out.println(obj1.result);
//
//		obj1.studying();
//		obj1.gyming();
//		obj1.gyming();
//
//		System.out.println(obj1.height);
//		System.out.println(obj1.aptitude);
//		System.out.println(obj1.muscularstrength);
//		System.out.println(obj1.firstno);
//		System.out.println(obj1.secondno);
//		System.out.println(obj1.result);
//	}
//
//	void playingBasketball() { // all methods are using global variables
//
//		height++;
//	}
//
//	void gyming() {
//
//		muscularstrength++;
//	}
//
//	void studying() {
//
//		aptitude++;
//	}
//
//	void add() {
//
//		result = firstno + secondno;
//	}
//	
//}

//MULTIPLE CLASSES

//class Arithmetic { // each class has its own global variables and methods.
//	int i = 4;
//
//	void display() {
//		System.out.println(i);
//		day_1 day2 = new day_1();
//		day2.print(); // this is possible.,, as we created an object
//	}
//}
//
//public class day_1 {
//
//	int j = 5, i = 6;
//
//	public static void main(String args[]) {
//
//		Arithmetic arithmetic = new Arithmetic();
//		System.out.println(arithmetic.i);
//		day_1 day2 = new day_1();
//		System.out.println(day2.i);
////	/	 System.out.println( i ); //not possible to access members of other class
//
//	}
//
//	void print() {
//		System.out.println(j);
//	}
//}

// 2 CLASSES

//class Aircraft{
//
//	int altitude = 0;
//
//	void fly() {
//
//		altitude = 35000;
//
//	}
//}
//
//class Human {
//
//	double longitude = 23.45;
//	double altitude = 0;
//	double latitude = 6677.234139;
//
//	void getAltitude() {
//
//		Aircraft aircraft = new Aircraft();
//		aircraft.fly();
//
//	}
//
//	void walk() {
//
//		longitude = longitude + 10.00;
//		latitude = latitude + 4565.23;
//
//	}
//}
//
//class day_1 {
//
//	public static void main(String args[]) {
//		Human human = new Human();
//		System.out.println(human.latitude);
//		System.out.println(human.longitude);
//		System.out.println(human.altitude);
//
//		human.getAltitude();
//		human.walk();
//		System.out.println(human.latitude);
//		System.out.println(human.longitude);
//		System.out.println(human.altitude);
//
//	}
//}

// INHERITANCE

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
//
//class Swift extends Car {
//	int j = 5;
//
//	int average = 15;
//	int mileage = 2000; // here preference is given to local variable.
//
//	void steeringWheel() {
//		
//		int mileage = 20;
//		System.out.println(" inside SteeringWheel of Swift" + " " + average + " " + mileage);
//		System.out.println( mileage + " " +  this.mileage + " " + super.mileage); // parent>>global>>local
//	}
//}
//
//class day_1 {
//
//	public static void main(String args[]) {
//		Swift swift = new Swift();
//		swift.steeringWheel();
//		swift.tyres(); 
//		System.out.println(swift.j);
//		Car car = new Car();
//		car.tyres();
//	//	System.out.println(car.j); not possible
//		System.out.println(car.mileage);
//		System.out.println(swift.average);
//		//System.out.println( swift.steeringWheel()); not possible
//	}
//
//}
