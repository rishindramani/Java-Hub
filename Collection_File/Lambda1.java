interface A
{
	void sum();
	
}
interface C
{
	void sum(int a);
}
interface D
{
	void add(int a,int b);
}
interface E
{
	int add(int a,int b);
}
interface F
{
	int add();
}
class B
{ 
	public static void main(String str[])
	{
		A obj=()->
		{
		 System.out.println("Lambda Expression no ret no arg ");
		};
		obj.sum();
		C obj1=(int a)->
		{
		 System.out.println("Lambda sum one arg no ret"+a);
		};
		obj1.sum(7);
	
		D obj2=(a,b)->
		{
		 System.out.println("Lambda no ret 2 arg "+(a+b));
		};
		obj2.add(7,9);
		
		E obj3=(a,b)->
		{
		 System.out.println("Lambda ret 2 arg "+(a+b));
		 return 0;
		};
		obj3.add(7,9);
		
		F obj4=()->
		{
		 System.out.println("Lambda with return no arg ");
		 return (7+9);
		};
		obj4.add();
	}
}