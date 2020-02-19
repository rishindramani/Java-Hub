 
public class FACILITYNO
{
    public static String rem(String s)
    {
        int t=s.length(),k;String s1="";
        for(k=0;k<t;k++)
        {
            char x=s.charAt(k);
            if(x!='0')
            {
                s1=s1+x;
        }
    }
    return s1;
}
    public static void main(int n)
    {
         int i,j;
           String a=String.valueOf((n*1));
        String b=String.valueOf((n*2));
        String c=String.valueOf((n*3));
         String s=a+b+c;
         String s1="0123456789";int d=0,flag=0;
          String s2=rem(s);
       int t2=s2.length();
       
         for(i=49;i<=57;i++)
         {       d=0;
             for(j=0;j<s.length();j++)
             {
                   char x=s.charAt(j);
                   
                   if((char)i==x)
                   {
                       d++;
                    }
                }
                    if((d>1)||(d==0))
                    {
                        flag=1;
                        break;
                    }
                }
      
                if(flag==0)
                {
                    System.out.println(n+" IS A FACILITY NUMBER");
                }
               
            }
        }
    