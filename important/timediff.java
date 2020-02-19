import java.io.*;
class timediff
{
public static void main() throws IOException
{
DataInputStream dr= new DataInputStream (System.in);
int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int d1,m1,hrs1,min1,d2,m2,hrs2,min2,i,y,h=0,m=0;
 int y1,y2,day=0;
System.out.println("ENTER date 1(d1,m1,hrs1,min1)");
d1=Integer.parseInt(dr.readLine());
m1=Integer.parseInt(dr.readLine());
hrs1=Integer.parseInt(dr.readLine());
min1=Integer.parseInt(dr.readLine());
y1=Integer.parseInt(dr.readLine());
System.out.println("ENTER date 2(d2,m2,hrs2,min2)");
d2=Integer.parseInt(dr.readLine());
m2=Integer.parseInt(dr.readLine());
hrs2=Integer.parseInt(dr.readLine());
min2=Integer.parseInt(dr.readLine());
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
 if (m1==m2)
 {
 day=d2-d1-1;
 }
 else if((m2-m1)==1)
 {
 day=(a[m1]-d1)+(d2-1);
 }
 else if((m2-m1)>1)
  {
   for(i=m1+1;i<m2;i++)
  {
   day=day+a[i];
  }
 day=day+(a[m1]-d1)+(d2-1);
  }
 h=(23-hrs1)+hrs2+(day*24);
  m=(60-min1)+min2;
 if(m>=60)
 {
  m-=60;
  h++;
 }
}
else if((y2-y1)==1)
  {
    for(i=m1+1;i<=12;i++)
  {
   day=day+a[i];
  }
   for(i=1;i<m2;i++)
  {
   day=day+a[i];
  }
 day=day+(a[m1]-d1)+(d2-1);
  
 h=(23-hrs1)+hrs2+(day*24);
  m=(60-min1)+min2;
 if(m>=60)
 {
  m-=60;
  h++;
 }
}
else{
  for(i=m1+1;i<=12;i++)
  {
   day=day+a[i];
  }
   for(i=1;i<m2;i++)
  {
   day=day+a[i];
  }
  int dx=(y2-y1-1)*365;
 day=day+(a[m1]-d1)+(d2-1);
  day=day+dx;
 h=(23-hrs1)+hrs2+(day*24);
  m=(60-min1)+min2;
 if(m>=60)
 {
  m-=60;
  h++;
 }}
System.out.println("DIFERENCE IN hours IS "+h);
System.out.println("DIFERENCE IN minutes IS "+m);
 }
 }
