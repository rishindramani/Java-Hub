package StringTokenizer;
import java.util.*;
public class swap_first_and_last_letter_of_each_word 
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        String s=ob.nextLine();
        StringTokenizer str=new StringTokenizer(s," ,.,?,!");
        int n=str.countTokens();
        String a[]=new String[n];
        int i,b,k=0;String c[]=new String [n];String s1="";
        for(i=0;i<n;i++)
        {
            a[i]=str.nextToken();
        }
        for(i=0;i<n;i++)
        {
            b=a[i].length();
            char x=a[i].charAt(0);
            if(b>1)
            {
            char y=a[i].charAt(b-1);
            
            s1=y+a[i].substring(1,(b-1))+x;
        }
        else
        {
            s1=s1+x;
        }
            c[k]=s1;
            k++;
            s1="";
        }
        for(i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
    }
}
            
        
        
        
