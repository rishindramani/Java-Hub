import java.util.*;
public class Point
{
int x;int y;
Point()
{
x=0;
y=0;
}
void input()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter coordinates");
x=ob.nextInt();
y=ob.nextInt();
}
void display()
{
System.out.println("x="+x);
System.out.println("y="+y);
}
Point mid(Point A,Point B)
{
Point C= new Point();
C.x =(A.x+B.x)/2;
C.y =(A.y+B.y)/2;
return C;
}
void main()
{
Point ob1 = new Point();
Point ob2 = new Point();
Point ob3 = new Point();
ob1.input();
ob2.input();
ob3= mid(ob1,ob2);
ob3.display();
}
}
  