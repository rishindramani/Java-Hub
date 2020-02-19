public class last
{
void main(int n)
{
int x=n;int r=0;int i;
while(n!=0)
{
i=n%10;
r=r*10+i;
n=n/10;
}
System.out.println(r);
}
}