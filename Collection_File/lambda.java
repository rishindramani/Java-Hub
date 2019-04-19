interface A
{
	void run();
}
class B
{ 
	public static void main(String str[])
	{
		A obj=()->
		{
		 System.out.println("Lambda Expression ");
		};
		obj.run();
	}
}