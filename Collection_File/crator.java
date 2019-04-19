import java.util.*;
class Student
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
		return "name="+name+ "rollno =" +rollno+ "cgpa="+cgpa;
	}
	public int compareTo(Student s)
	{
		return this.rollno = s.rollno;
	}
class sort implements Comparator<Student>
	
}
class GH
{
	public static void main(String args[])
	{
		ArrayList<Student> l=new ArrayList<Student>();
		l.add(new Student("Akaur",110,9.67));
		l.add(new Student("rohit",102,9.57));
		
		Collections.sort(l);
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
		