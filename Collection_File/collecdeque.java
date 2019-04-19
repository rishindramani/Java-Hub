import java.util.*;

class B
{
	public static void main(String ...a)
	{
		Deque j=new ArrayDeque();
		j.offerFirst("A");
		j.addFirst("B");
		j.offer("C");
		j.add("A");
		j.add("D");
		System.out.println(" "+j);
		j.poll();
		System.out.println(" "+j);
		j.remove();
		System.out.println(" "+j);
		j.pollFirst();
		System.out.println(" "+j);
		j.removeFirst();
		System.out.println(" "+j);
		System.out.println(" ................... ");
//
		System.out.println(""+j.getFirst());
		System.out.println(""+j.peekFirst());
		System.out.println(""+j.peekLast());
		Iterator itr=j.iterator();
		while(itr.hasNext())
		{
			System.out.println(""+itr.next());
		}
	}
}