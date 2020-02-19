public class kjhgk
{
void cal(String str)
{
int i,j,k,d=str.length(),t=0,a[]=new int [d];
//char ch[]=new char[d],s=' ';
/*for(i=0;i<d;i++)
{
ch[i]=str.charAt(i);
a[i]=(int)str.charAt(i);
//System.out.print(ch[i]+" ");
}
System.out.print(ch);
for(i=0;i<d-1;i++)
{
for(j=i+1;j<d;j++)
{
if(a[i]>a[j])
{
t=a[i];
s=ch[i];
a[i]=a[j];
ch[i]=ch[j];
a[j]=t;
ch[j]=s;
}}}*/
int c=0;
for(i=0;i<(d/2+1);i++)
{
for(j=0;j<(d/2+1);j++)
{
for(k=0;k<(d/2);k++)
{
if(i!=j&&j!=k&&k!=i)
{
System.out.print(str.charAt(i)+""+str.charAt(j)+""+str.charAt(k)+""+" ");
c++;
}
}}}
System.out.print("total"+c);
}}

