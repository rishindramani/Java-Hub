import java.util.*;
class Student implements Comparable<Student>
{
	String name;
	int rollno;
	double cgpa;
	Student(){}
	Student(String n,int r,double c)
	{
		name=n;rollno=r;cgpa=c;
	}
	public String toString()
	{
		return "name="+name+ "rollno =" +rollno+ "cgpa="+cgpa ;
	}
	public int compareTo(Student s)
	{
		return this.rollno - s.rollno;
	}
}
class GH
{
	public static void main(String args[])
	{
		ArrayList<Student> l=new ArrayList<Student>();
		l.add(new Student("Akaur",110,6.67));
		l.add(new Student("rohit",102,9.57));
		l.add(new Student("jack",112,7.57));
		l.add(new Student("archit",100,5.97));
		l.add(new Student("josh",128,6.57));
		
		Collections.sort(l);
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
		