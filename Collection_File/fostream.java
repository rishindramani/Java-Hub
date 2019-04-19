import java.io.*;
import java.util.*;
class A
{
	public static void main(String ...b) throws IOException
	{
		
			FileOutputStream obj=new FileOutputStream("C:\\Users\\Manish\\Desktop\\Java Programmin\\C.txt");
			//File obj=new File("B.txt");
			Scanner sc = new Scanner(System.in);
			String s= sc.nextLine();
			s=s+sc.nextLine();
			byte a[]=s.getBytes();
			obj.write(a);
			obj.close();
			System.out.println("Saved to all named file");
			
	}
}//TO file save if file not there create and copy input taken to the file created