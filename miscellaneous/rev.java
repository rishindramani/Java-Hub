import java .io.*;
class rev
{
public static void main () throws IOException 
{
DataInputStream obj = new DataInputStream (System.in);
System.out.println ("Enter String");
String s = obj.readLine();
int t=s.length();
int i,s1=0;
for (i=t-1;i>=0;i--)
{
char x = s.charAt(i);
s1 = s1+x;
}
System.out.print (s1);
}
}
