package important;
public class vampire
{
public void main(int n)
{
int f=0;
for(int m=n;m>0;m=m/10)
f++;
f=(int)f/2;
int m=(int)Math.pow(10,f);
int n1=n%m;
int n2=n/m;
int fact=1;
for(int i=1;i<=f;i++)
fact=fact*i;
int a[]=new int[fact];
int b[]=new int[fact];
int k=f-1;
int a1[]=new int[f];
int b1[]=new int[f];
for(int t=n1;t>0;t=t/10)
{
a1[k]=t%10;
k--;
}
k=f-1;
for(int t=n2;t>0;t=t/10)
{
b1[k]=t%10;
k--;
}
k=0;
for(int i=0;i<f;i++)
{
for(int j=0;j<(f-1);j++)
{
int temp=a1[j];
a1[j]=a1[j+1];
a1[j+1]=temp;
temp=b1[j];
b1[j]=b1[j+1];
b1[j+1]=temp;
int y=0;
int z=0;
int k1=0;
for(int r=f-1;r>=0;r--)
{
int d1=(int)Math.pow(10,r);
int d2=d1;
d1=d1*a1[k1];
y=y+d1;
d2=d2*b1[k1];
z=z+d2;
k1++;
}
a[k]=y;
b[k]=z;
k++;
}}
for(int i=0;i<fact;i++)
{
for(int j=0;j<fact;j++)
{
if(a[i]*b[j]==n)
{
System.out.println(n+" is a vampire number");
System.out.println("Required pair="+a[i]+"*"+b[j]);
System.exit(0);
}}}
System.out.println(n+" is not a vampire number");
}}
