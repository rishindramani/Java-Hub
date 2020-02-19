






import java.util.*;
class Student
{
  
    int marks;
  public static void main(String args[])
  {
   Scanner ob=new Scanner(System.in);
    Student std[] = new Student[3];  
     int i;
for(i=0;i<3;i++)
{
               std[i] = new Student();           
    }
for(i=0;i<3;i++)
{
  std[i].marks=ob.nextInt();
}
 for(i=0;i<3;i++)
{
System.out.println(std[i].marks);
}
}
}
    
 









