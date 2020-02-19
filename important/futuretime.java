import java.io.*;
class futuretime
{
public static void main() throws IOException
{
DataInputStream dr= new DataInputStream (System.in);
int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int d1,mo1,h1,m1,h2,m2;
 int y1;
System.out.println("ENTER date 1(d1,mo1,hrs1,min1,y)");
d1=Integer.parseInt(dr.readLine());
mo1=Integer.parseInt(dr.readLine());
h1=Integer.parseInt(dr.readLine());
m1=Integer.parseInt(dr.readLine());
y1=Integer.parseInt(dr.readLine());
System.out.println("ENTER hrs2,min2 for future time");
h2=Integer.parseInt(dr.readLine());
m2=Integer.parseInt(dr.readLine());
 if(y1%4==0)
  {
   a[2]=29;
  }
 else
 {
 a[2]=28;
  }
  int h=h2%24;
  int d=h2/24;
  d1=d1+d;
  h=h1+h;
  int m=m1+m2;
  if(m>=60)
  {
      m-=60;
      h++;
    }
    if(h>24)
    {
        h-=24;
        d1++;
    }
    while(d1>a[mo1])
    {
        d1-=a[mo1];
        mo1++;
    }
 System.out.println(d1+ " "+h+" "+m);
}}