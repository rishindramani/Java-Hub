public class pattren
{
void main(int n)
{
int k,m,t;
int i,j,sp=-1;
for(i=n;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
if(i==n)
{
m=i-1;
}
else
{
m=i;
}
for(t=m;t>=1;t--)
{
System.out.print(t);
}
sp=sp+2;
System.out.println();
}
sp=sp-4;
for(i=2;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
if(i==n)
{
m=i-1;
}
else
{
m=i;
}
for(t=m;t>=1;t--)
{
System.out.print(t);
}
sp=sp-2;
System.out.println();
}
}}
