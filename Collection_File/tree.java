import java.util.*;

class TREE
{
	public static void main(String ...a)
	{
		Collection<String> j=new TreeSet<String>();
		j.add("A");
		j.add("B");
		j.add("C");
		j.add("A");
		Iterator itr=j.iterator();
		while(itr.hasNext())
		{
			System.out.println(""+itr.next());
		}
	}
}