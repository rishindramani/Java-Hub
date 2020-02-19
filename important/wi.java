public class wi
{
void witty(String n,int p)
{
if(p<0)
System.out.println("");
else
{
System.out.println(n.charAt(p)+".");
witty(n,--p);
System.out.print(p);
}}} 