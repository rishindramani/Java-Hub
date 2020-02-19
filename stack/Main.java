package stack;

/*class Superclass 
{ Superclass() 
	{
        System.out.println("Printed in Superclass.");
    	}
}
class Subclass extends Superclass 
{   // overrides printMethod in Superclass
  	  Subclass() 
	{		super();
System.out.println("Printed in Subclass");
    	}
 public static void main(String[] args) 
{      Subclass s = new Subclass();
}}
*/
class Base { 
  int x; 
  Base(int _x) { 
    x = _x; 
  } 
} 
  
class Derived extends Base { 
  int y; 
  Derived(int _x, int _y) { 
    super(_x); 
    y = _y; 
  } 
  void Display() { 
    System.out.println("x = "+x+", y = "+y); 
  } 
} 
  
public class Main { 
  public static void main(String[] args) {   
    Derived d = new Derived(10, 20); 
    d.Display(); 
  } 
}
