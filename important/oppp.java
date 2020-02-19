public class oppp
{
public void num(int n)
{if(n>0)
{
System.out.print(n+" ");
num(n-1);
System.out.print(n+" ");
}}
public String numbers1(int n)
{
if(n<=0)
return "";
return n+" "+numbers1(n-1);
}
}
