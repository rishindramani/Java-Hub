import java.io.*;
import java.util.*;
class A
{
	public static void main(String ...b) throws IOException
	{
		
			FileInputStream fin=new FileInputStream("B.txt");
			//File obj=new File("B.txt");
			byte answer[]=new byte[fin.available()];
			fin.read(answer,0,answer.length);
			for(int i=0;i<answer.length;i++)
			{
				System.out.println((char)answer[i]);
		*	}
	}
}
