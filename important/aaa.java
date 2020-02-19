public class aaa
{
void main(int n)
{
int s=0;
int a;
int x=n;
while(n!=0)
{
a=n%10;
s=s+(a*a*a);
n=n/10;
}
if (s==x)
System.out.println("armstrong");
else
System.out.println("not armstrong");
}
}