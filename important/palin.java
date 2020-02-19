public class palin
{
int pal(String str)
{
int l=str.length();
char x;
String s="";
for(int i=l-1;i>=0;i--)
{
x=str.charAt(i);
s=s+x;
}
if(s.equals(str))
return 1;
else
return 0;
}
void xyz(String st)
{
String s2="";
char x,y;
int r;
int t=st.length();
for(int i=0;i<t/2;i++)
{
x=st.charAt(i);
s2=x+s2;
for(int j=i+1;j<t;j++)
{
y=st.charAt(j);
s2=s2+y;
r=pal(s2);
if(r==1&&s2.length()>1)
{
System.out.println(s2);
}
}
s2="";
}}}