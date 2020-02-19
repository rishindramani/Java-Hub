import java.util.*;
class code2
{
   public static void main(String args[])
  {
  Scanner ob=new Scanner(System.in);
     long j,a,b,c,d,e,hcf=1,t;
     t=ob.nextLong();
     
   while(t>0)
   {    a=0;b=0;c=0;d=0;e=0; 
       hcf=1;
         a=ob.nextLong();
         b=ob.nextLong();
         c=ob.nextLong();
         d=(long)Math.pow(a,c)+(long)Math.pow(b,c);
         e=Math.abs(a-c);
        for(j=1;j<=e;j++)
       {
        if(d%j==0&&e%j==0)
        {
        hcf=j;
        }
    }
    System.out.println(hcf%1000000007);
    t--;
}
}
}