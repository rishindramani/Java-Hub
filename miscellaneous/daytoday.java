package important;

import java.io.*;
class daytoday
{
public static void main() throws IOException
{
DataInputStream dr= new DataInputStream (System.in);
int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int d1,m1,d2,m2,i,y,h=0,m=0;
 int y1,y2,day=0;
System.out.println("ENTER date 1(d1,m1,y1)");
d1=Integer.parseInt(dr.readLine());
m1=Integer.parseInt(dr.readLine());
y1=Integer.parseInt(dr.readLine());
System.out.println("ENTER day");
String s=(dr.readLine());
System.out.println("ENTER date 2(d2,m2,y2)");
d2=Integer.parseInt(dr.readLine());
m2=Integer.parseInt(dr.readLine());
y2=Integer.parseInt(dr.readLine());
 if(y1%4==0)
  {
   a[2]=29;
  }
 else
 {
 a[2]=28;
  }
  if(y1==y2)
  {
   for(i=m1+1;i<m2;i++)
  {
   day=day+a[i];
  }
 day=day+(a[m1]-d1)+(d2-1);
  }
System.out.println("DIFERENCE IN days IS "+ (++day));
String w[]={"","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday"};
int in=0;
for(i=1;i<=10;i++)
{
if(w[i].equals(s))
{
in=i;
break;
}}
int x1=day%7;
x1=x1+in;
if(x1>7)
{
x1-=7;
}
System.out.println("New day"+w[x1]);

 }
 }
