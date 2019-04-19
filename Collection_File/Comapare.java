import java.util.*;
class Student implements Comparable<Student>
{
	String name;
	int roll;
	double cgpa;


	Student(String n,int r,double d)
	{
		name=n;
		roll=r;
		cgpa=d;
	}
	public String toString()
	{
		return " Name "+name+" Roll No= "+roll+" CGPA "+cgpa;
	}
	public int compareTo(Student s)
	{
		return this.roll-s.roll;
	}
}
class compare
{
	public static void main(String ...a)
	{
		ArrayList<Student> s=new ArrayList<Student>();
	s.add(new Student("Manish",1,7.8));
	s.add(new Student("Vishal",2,9.8));
	s.add(new Student("Intesab",3,9.9));
	Collections.sort(s);
	System.out.println(s);
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}
	