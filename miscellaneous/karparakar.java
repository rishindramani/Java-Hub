class karparakar
{
void abc(int n)
{
int s=0;
int sq=n*n;
int x=sq;
while(x!=0)
{
int a=x%10;
s=s+a;
x=x/10;
}
if(s==n)
{
System.out.println("karparakar");
System.exit(0);
}
x=sq;
int i=1,t,u,a;
while(x!=0)
{
t=(int)Math.pow(10,i);
a=sq%t;
x=sq/t;
u=a+x;
if(u==n)
{
System.out.println("karparakar");
System.exit(0);
}
i++;
}
System.out.println("not a karparakar");
}}
