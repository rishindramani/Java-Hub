package important;

import java.io.*;
class merg
{
public static void main()throws IOException
{
DataInputStream obj=new DataInputStream(System.in);
int m,n=0,i,j,p=0,q=0,k=0;
System.out.println("Enter size of 1st array");
m=Integer.parseInt(obj.readLine());
System.out.println("Enter size of 2nd array");
n=Integer.parseInt(obj.readLine());
String a[]=new String[m];
String b[]=new String[n];
String c[]=new String[m+n];
System.out.println("enter m elements");
for(i=0;i<m;i++)
{
a[i]=obj.readLine();
}
System.out.println("enter n elements");
for(j=0;j<n;j++)
{
b[j]=obj.readLine();
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(a[i].compareTo(b[j])<0)
{
c[k]=a[i];
p++;
k++;
}
else
{
c[k]=b[q];
q++;
k++;
}
}
while (p<m&&q<n)
{
for(i=k;k<(m+n)&&p<m;i++)
{
c[i]=a[p];
p++;
k++;
}
for(j=k;k<(m+n)&&q<n;j++)
{
c[j]=b[q];
q++;
k++;
}
for(i=0;i<(m+n);i++)
System.out.println(c[i]);
}
}
}
}