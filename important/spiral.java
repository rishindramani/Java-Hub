import java.io.*;
class spiral
{
static int n;
public static void main(String ar[])throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE SIZE OF MATRIX");
n=Integer.parseInt(dr.readLine());
f1(n);
f2(n);
}
public static void f1(int m)
{
int n1= m;
int t=1,r=0,c=-1,i,j,l;
int a[][]=new int[m][m];
while(m>0)
{
for(i=1;i<=m;i++)
{
a[r][++c]=t++;
}
for(i=1;i<m;i++)
{
a[++r][c]=t++;
}
for(i=1;i<m;i++)
{
a[r][--c]=t++;
}
for(i=1;i<m-1;i++)
{
a[--r][c]=t++;
}
m=m-2;
}
System.out.println("THE SPIRAL MATRIX IS");
for(i=0;i<n1;i++)
{
for(j=0;j<n1;j++)
{
System.out.print("      "+  a[i][j]);
}
System.out.println();
}
}
public static void f2(int m)
{
int n1= m;
int t,r=0,c=-1,i,j,l;
t=(m*m);
int a[][]=new int[m][m];
while(m>0)
{
for(i=1;i<=m;i++)
{
a[r][++c]=t--;
}
for(i=1;i<m;i++)
{
a[++r][c]=t--;
}
for(i=1;i<m;i++)
{
a[r][--c]=t--;
}
for(i=1;i<m-1;i++)
{
a[--r][c]=t--;
}
m=m-2;
}
System.out.println("THE SPIRAL MATRIX IS");
for(i=0;i<n1;i++)
{
for(j=0;j<n1;j++)
{
System.out.print(" "+  a[i][j]);
}
System.out.println();
}
}

}
