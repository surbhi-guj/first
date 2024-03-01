package collections;

import java.util.Objects;
public class Emp {
    int id;
    String name;
  public Emp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
    }
  public String toString() { // used to recieve the contents of the objects.
	  return id+" "+ name;
  }
   @override
   public int hashCode() {
	   return Objects.hash(id,name);
   }
   @Override
   public boolean equals(Object obj) {
	   
	   Emp e = (Emp)obj;
	   return id ==e.id && Objects.equals( name, e.name);
   }
}
