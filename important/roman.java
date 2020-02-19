import java.io.*;
class roman
{
public static void main(String s)
{
s=s+" ";
char a[]={'I','V','X','L','C','D','M'};
int a1[]={1,5,10,50,100,500,1000};
int tot=0;
int t=s.length();
int i,j,l=0,m=0;
for(i=0;i<(t-1);i++)
{
char x=s.charAt(i);
char y=s.charAt(i+1);
for(j=0;j<7;j++)
{
if(x==a[j])
{
l=a1[j];
break;
}
}
for(j=0;j<7;j++)
{
if(y==a[j])
{
m=a1[j];
break;
}
}
if(l>=m)
{
tot=tot+l;
}
else
{
int h=m-l;
tot+=h;
i++;
}}
System.out.println(tot);
}
}