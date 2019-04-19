import java.io.*;
class A
{
	public static void main(String ...a) throws IOException
	{
		
			File obj=new File("C:\\Users\\Manish\\Desktop\\Java Programmin\\B.txt");
			//File obj=new File("B.txt");
			obj.createNewFile();
			PrintWriter output = new PrintWriter(obj);
			output.print("Java file");
			output.println(40);
			output.close();
	
	}
}//to write to the file