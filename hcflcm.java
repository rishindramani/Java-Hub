public class hcflcm
{
   public void main(int a,int b)
   {
       int i,h=1;
       for(i=1;i<=a;i++)
       {
        if(a%i==0&&b%i==0)
        {
        h=i;
        }
    }
        System.out.println("hcf="+h);
    int l=1;
for(i=1;i<=(a*b);i++)
{
if(i%a==0&&i%b==0)
{
l=i;
break;
}
}
System.out.println("lcm="+l);
}
}




