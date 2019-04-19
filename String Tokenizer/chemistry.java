package StringTokenizer;
import java.util.*;
public class chemistry
{
 public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        String s1="",s;
        s=ob.nextLine();
           int i,b,j;
         String a[]=s.split(" ");
        for(i=0;i<a.length;i++)
        {
            a[i]=a[i]+" ";
            b=a[i].length();
            
            for(j=0;j<b-1;j++)
        {
              char x=a[i].charAt(j);
              if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')//||x=='p'||)//&&(j!=0)&&(j!=(b-2))&&((a[i].charAt(j+1)==a[i].charAt(j-1))||(a[i].charAt(j+1)==a[i].charAt(j-1))||(a[i].charAt(j+1)==a[i].charAt(j-1))||(a[i].charAt(j+1)==a[i].charAt(j-1))||(a[i].charAt(j+1)==a[i].charAt(j-1))))
             {
                 s1=s1+x;
                 j+=2;
                }
                 else
              s1=s1+x;
        }
        if(i==a.length-1)
        System.out.print(s1);
        else
        System.out.print(s1+" ");
        s1="";
    }
    
    }
}
            
        
        
        
