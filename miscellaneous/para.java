package important;

import java.io.*;
import java.util.*;
class para
{
public static void main()throws IOException
{
DataInputStream obj=new DataInputStream(System.in);
String str;
int i,j,n=0;
String temp;
System.out.println("enter paragraph");
str=obj.readLine();
StringTokenizer txt=new StringTokenizer(str);
n=txt.countTokens();
String a[]=new String[n];
for(i=0;i<n;i++)
{
a[i]=txt.nextToken();
}
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1;j++)
{
if(a[j].compareTo(a[j+1])>0)
{
temp=a[i];
a[i]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}