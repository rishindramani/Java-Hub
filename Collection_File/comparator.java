import java.util.*;
class Student 
{
	String name;
	int Roll;
	double Cgpa;


	Student(String n,int r,double d)
	{
		name=n;
		Roll=r;
		Cgpa=d;
	}
	public String toString()
	{
		return " Name "+name+" Roll No= "+Roll+" CGPA "+Cgpa;
	}

}
class SortByCgpa implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return(s1.Cgpa>s2.Cgpa?1:-1);
	}
}
class B	
{
	public static void main(String ...a)
	{
		ArrayList<Student> s=new ArrayList<Student>();
	s.add(new Student("Manish",1,7.));
	s.add(new Student("Vishal",2,6));
	s.add(new Student("Intesab",3,8));
	//Collection.Sort(s,new SortByRoll());
	//System.out.println(s);
	Collections.sort(s,new SortByCgpa());
	System.out.println(s);
	
	}
}
	