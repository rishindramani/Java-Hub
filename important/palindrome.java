public class palindrome
{
void main(int n)
{
int r=0;
int x=n;
while (n!=0)
{
int a=n%10;
r=r*10+a;
n=n/10;
}
if(r==x)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
