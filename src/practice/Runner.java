// HASHMAP IMPLEMENTATION

//make your methods public and variables private.this is encapsulation.


package practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



import employee.Employee;

class Runner{
	
	   public static void main( String args[]) {
		
		Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
		
		List<Employee> list = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(45000, "Surbhi" );
		Employee emp2 = new Employee(55000, "Manan" );
		Employee emp3 = new Employee(65000, "Anwesha" );
		
		
		
		
		map.put(1, emp1);
		map.put(2, emp2);
		map.put(3, emp3);
		
		Set<Integer> keyset = employees.keySet();
		for ( int key : keyset) {
			
			if( employees.get(key).getsalary() > 50000){  //cant access salary here directly
			  list.add( employees.get(key));
			}
		}
		for( Employee employee: list) {
			
	  }
	
    }

}




