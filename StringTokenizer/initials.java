package StringTokenizer;

import java.util.*;
public class initials
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("enter string");
        StringTokenizer s=new StringTokenizer(ob.nextLine());
        int n=s.countTokens();//count words
        String a[]=new String[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextToken();
        }
        for(i=0;i<n;i++)
        {
            System.out.print((a[i].charAt(0))+".");
            
              }
    }
}