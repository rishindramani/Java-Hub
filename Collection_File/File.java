import java.io.*;
class A
{
	public static void main(String ...a)
	{
		try
		{
			File obj=new File("B.txt");
			obj.createNewFile();
		}
		catch(IOException b)
		{
			System.out.print("IO Error"+b);
		}
	}
}