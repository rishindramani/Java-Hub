import java.io.*;
import java.util.*;
class A
{
	public static void main(String ...a) throws IOException
	{
		
			File obj=new File("C:\\Users\\Manish\\Desktop\\Java Programmin\\B.txt");
			//File obj=new File("B.txt");
			Scanner input = new Scanner(obj);
			while(input.hasNext())
			{
				String s=input.nextLine();
				System.out.println(s);
			}
	
	}
}//