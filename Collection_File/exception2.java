import java.util.*;
class A

{
	public static void main(String ...args)
	{
		try
		{
			int C=50/0;
			System.out.println("Output after division 50/0"+C);
		}
		
		
		catch(ArithmeticException a)
		{
			System.out.println("Output after division  gives error "+a);
		}
		try
		{
			int b[]=new int[3];
			b[4]=4;
		}
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("Output after gives error "+c);
	
		}
	}
}