package important;

import java.io.*;
class truthtable
{
static int t=1,n,k,j1=0,x,i,b,i1,j=0;
public static void main(String ar[])throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE VALUE OF N");
n=Integer.parseInt(dr.readLine());
for(i1=0;i1<n;i1++)
{
t=t*2;
}
int a[][]=new int[t][n];
for(i=0;i<t;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=0;
}
}
for(i=0;i<t;i++)
{
x=i;
k=n-1;
while(x!=0)
{
b=(x%2);
a[i][k]=b;
k--;
x= x/2;
}
}
for(i=0;i<t;i++)
{int s=0;
for(j=0;j<n;j++)
{s=s+a[i][j];
System.out.print(a[i][j]+" ");
}
if(s!=0)
System.out.print("0");
else
System.out.print("1");
System.out.println();
}
}
}




