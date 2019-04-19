import java.util.*;

class B
{
	public static void main(String ...a)
	{
		Map<Integer,String> obj=new HashMap<Integer,String>();
		obj.put(1,"a");
		obj.put(2,"b");
		obj.put(3,"c");
		obj.put(4,"d");
		for (Map.Entry p:obj.entrySet())
		{
			System.out.println(p);
		}
		for (Map.Entry p:obj.entrySet())
		{
			System.out.println(p.getKey());
		}
		for (Map.Entry p:obj.entrySet())
		{
			System.out.println(p.getValue());
		}
	}
}