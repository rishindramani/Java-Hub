package StringTokenizer;
import java.util.*;
public class chemistry2 
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
            a[i]=" "+a[i]+" ";
            b=a[i].length();
            
            for(j=0;j<b-2;j++)
        {
              char x=a[i].charAt(j);
              if((x=='p')&&(j!=0)&&(j!=(b-3)&&(((a[i].charAt(j+1)=='a')||(a[i].charAt(j+1)=='e')||(a[i].charAt(j+1)=='i')||(a[i].charAt(j+1)=='o')||(a[i].charAt(j+1)=='u'))&&((a[i].charAt(j-1)=='a')||(a[i].charAt(j-1)=='e')||(a[i].charAt(j-1)=='i')||(a[i].charAt(j-1)=='o')||(a[i].charAt(j-1)=='u')))))
              ++j;
              else if(x==' ')
              ++j;
              else
              s1=s1+x;
        }
        if(i==a.length-2)
        System.out.print(s1);
        else
        System.out.print(s1+" ");
        s1="";
    }
    
    }
}
            
        
        
        
