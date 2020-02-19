import java.io.*;
class set
{
static int n,i,j,t=1,x,c=0,b1,k;
public static void main(String ar[])throws IOException
{
BufferedReader dr= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of elements in the array");
n=Integer.parseInt(dr.readLine());
int a[]=new int[n];
System.out.println("Enter the array");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(dr.readLine());
}
for(i=0;i<n;i++)
{
t=t*2;
}
int b[][]=new int[t][n];
for(i=0;i<t;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=0;
}
}
for(i=0;i<t;i++)
{
x=i;
k=n-1;
while(x!=0)
{
b1=x%2;
b[c][k]=b1;
k--;
x=x/2;
}
c++;
}
for(i=0;i<t;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]);
}
System.out.println();
}
int ch;
for(i=0;i<t;i++)
{
ch=0;
for(j=0;j<n;j++)
{
if(ch==0)
{
System.out.print("{");
}
if(b[i][j]==1)
{
ch=1;
System.out.print(a[j]+",");
}

}
System.out.print("},");
System.out.println();
}
}
}


























