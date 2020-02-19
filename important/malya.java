public class malya
{
int ispalin(String s)
{
String s1="";
int t=s.length();
for(int i=0;i<t;i++)
{
char x=s.charAt(i);
s1=x+s1;
}
if(s.equals(s1))
return 1;
else
return 0;
}
void abc(String str)
    {
    int l=str.length();
    int c=0,j=0;
    String s="";
    int t=l;
    for(int i=0;i<=(l/2);i++)
    {
    for(j=i;j<t;j++)
    {
        char x=str.charAt(j);
    s=s+x;
    c++;
    if(ispalin(s)==1&&c>1)
    {
        System.out.println(s);
                c=0; }}s="";
c=0;
t--;
}}}  