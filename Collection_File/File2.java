import java.io.*;
class A
{
	public static void main(String ...a) throws IOException
	{
		
			File obj=new File("C:\\Users\\Manish\\Desktop\\Java Programmin\\B.txt");
			//File obj=new File("B.txt");
			obj.createNewFile();
			System.out.println(obj.getName());
			System.out.println(obj.getPath());
			System.out.println(obj.isAbsolute());
			System.out.println(obj.getParent());
			System.out.println(obj.isFile());
			System.out.println(obj.canRead());
			System.out.println(obj.canWrite());
			System.out.println(obj.length());
	
	}
}