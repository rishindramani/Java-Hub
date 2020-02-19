import java .io.*;
class prime
{
public static void main () throws IOException 
{
DataInputStream obj = new DataInputStream (System.in);
System.out.println ("enter no");
int n=Integer.parseInt(obj.readLine());
int s,i;
s=0;
for(i=1;i<=n;i++)
{
if (n%i==0)
s=s+1;
}
if (s==2)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}