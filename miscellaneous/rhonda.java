package important;

public class rhonda
{
static public void main(int n)
{int s=1;
int k=n;
while(k!=0)
{
int a=k%10;
s=s*a;
k/=10;
}
int s1=0;
int i=2;
while(n!=1)
{
if(n%i==0)
{
s1=s1+i;
n=n/i;
}
else
i++;
} s1*=10;
if(s==s1)
System.out.println("rhonda no");
else
System.out.println("not a rhonda no");
}}
