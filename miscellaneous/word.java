package important;


class word
{
  void fun(String n)
{

int l=n.length();
int t=l;
for(int j=0;j<=l/2;j++)
{
String s="";
for(int i=j;i<t;i++)
{
s=s+n.charAt(i);
if(pal(s)==1 && s.length()>1)
  System.out.println(s);
     }

t--;
}

}

int pal(String s1)
{
String d="";
int l1=s1.length();
for(int i=0;i<l1;i++)
d=s1.charAt(i)+d;

if(d.equals(s1))
 return 1;
 else 
 return 0;
}

}
