import java.io.*;
import java.util.*;
class A
{
	public static void main(String ...b) throws IOException
	{
		
			try
			{ 
				int answer=0;
				FileInputStream fin=new FileInputStream("B.txt");
				while((answer=fin.read())!=-1)
				{
					System.out.print((char)answer);
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception Handled "+e);
			}
				
	}
}//byte oriented 