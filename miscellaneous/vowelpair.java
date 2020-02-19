import java.io.*;
class vowelpair
{
void abc(String str)
{
char u[]={'a','e','i','o','u'};
char v[]={'A','E','I','O','U'};
int t,i,j,k,c,d=0,s=0;
char ch,ch1;
int a[][]=new int[5][5];
t=str.length();
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
a[i][j]=0;
}
}
for(i=0;i<(t-1);i++)
{
ch=str.charAt(i);
c=0;
for(j=0;j<5;j++)
{
if(ch==u[j]||ch==v[j])
{
c=1;
break;
}}
if(c==1&&d==1)
{
for(j=0;j<5;j++)
{
ch1=str.charAt(i-1);
if((ch1==u[j])||(ch1==v[j]))
{
break;
}
}
for(k=0;k<5;k++)
{
if((ch==u[k])||(ch==v[k]))
{
break;
}
}
a[j][k]++;
}
d=c;
}
for(i=0;i<5;i++)
{
System.out.print("\t"+u[i]);}
System.out.println();
for(i=0;i<5;i++)
{
System.out.print(u[i]+"\t");
for(j=0;j<5;j++)
{
System.out.print(a[i][j]);
System.out.print("\t");
s=s+a[i][j];
}
System.out.println();
}
System.out.println(s);
}
}


