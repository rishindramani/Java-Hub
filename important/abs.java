class abs
{
public static void main (String s)
{
s=s+" ";
int t = s.length();
int min=t;
String s1="";String s2="";
for (int i=0;i<t;i++)
{
char x=s.charAt(i);
if (x!=' ')
{
s1=s1+x;
}
else 
{
if (s1.length()<min)
{
min = s1.length();
s2=s1;
}
s1=" ";
}
}
System.out.print (s2);
}
}
