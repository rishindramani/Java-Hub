package important;
import java.util.*;
public class Java2r
{
   int value1(String str,char x)
   {
        char c,ch;int i,k,j,in1=0;
        int a[]=new int[1000];
        i=str.length();
        for(c='a'; c<='z'; c++)
        {
            k=0;
            
            for(j=0; j<i; j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
               }
            a[in1]=k;in1++;
        }
        return a[((int)x-97)];
    }
    int value2(String str,char x)
   {
        char c,ch;int i,k,j,in1=0;
        int a[]=new int[1000];
        i=str.length();
        for(c='A'; c<='Z'; c++)
        {
            k=0;
            
            for(j=0; j<i; j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
               }
            a[in1]=k;in1++;
        }
        return a[((int)x-65)];
    }
    int value3(String str,char x)
   {
        char c,ch;int i,k,j,in1=0;
        int a[]=new int[1000];
        i=str.length();
        for(c='0'; c<='9'; c++)
        {
            k=0;
            
            for(j=0; j<i; j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
               }
            a[in1]=k;in1++;
        }
        return a[((int)x-48)];
    }
   void main34(String s)
    {
        char y,z;int i,m,flag=0;String s1="",s2="";
        
        s1=s.substring(0,s.indexOf(' '));
        s2=s.substring(s.indexOf(' ')+1,s.length());
        for(i=0;i<s1.length();i++)
    {
        y=s1.charAt(i);
        if(Character.isLowerCase(y)==true)
        {
          if(value1(s2,y)>=value1(s1,y))
          {
              flag=1;
            }
            else
            {
                flag=0;
                break;
            }
            }
            else if(Character.isUpperCase(y)==true)
            {
                if(value2(s2,y)>=value2(s1,y))
          {
              flag=1;
            }
            else
            {
                flag=0;
                break;
            }
            }
            else
            {
                if(value3(s2,y)>=value3(s1,y))
          {
              flag=1;
            }
            else
            {
                flag=0;
                break;
            }
            }
        }
        if(flag==1)
        System.out.println("Yes");
        else
        System.out.println("No");
    //for(m=0;m<s2.length();m++)
    //{
      //  z=s2.charAt(m);
      //  System.out.println(value1(s2,z));
    }
    void main()
    {
        Java2r e=new Java2r();
        Scanner scan = new Scanner(System.in);
        String ss;
        int n=scan.nextInt();
        while(n>0)
        {
        ss=scan.next();
        e.main34(ss);
        n--;
    }
}
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    