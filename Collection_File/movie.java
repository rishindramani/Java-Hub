import java.util.*;
class Movie implements Comparable<Movie>
{
	String name;
	int rating;


	Movie(String n,int d)
	{
		name=n;
		rating=d;
	}
	public String toString()
	{
		return " Name "+name+" Rating = "+rating;
	}
	public int compareTo(Movie M)
	{
		return M.rating-this.rating;
	}
}
class compare
{
	public static void main(String ...a)
	{
		ArrayList<Movie> s=new ArrayList<Movie>();
	s.add(new Movie("Bahubali",4));
	s.add(new Movie("Gully Boy",5));
	s.add(new Movie("Why cheat India",3));
	Collections.sort(s);
	//System.out.println(s);
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}
	