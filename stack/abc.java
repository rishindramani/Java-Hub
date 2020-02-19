package stack;
import java.util.*;
public class abc
{
    
public static void f1()
{
Scanner ob=new Scanner(System.in);
int i;
System.out.println("enter no");
int a=ob.nextInt();
int b[]={1,2,3,4,5};
	try 
	{ 
 for(i=0;i<5;i++)
{

         if(a==b[i])
{
     
throw new Exception();
	
	}
}
}
 catch (Exception e) 
	{ 
System.out.println("Exception occured....Reenter");
	}

}
public static void main(String args[])
{
abc e=new abc();
e.f1();
}

}
