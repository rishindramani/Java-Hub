package important;

import java.io.*;
class bugc
{
     
  static int value1(String str,char x)
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
  static  int value2(String str,char x)
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
  static  int value3(String str,char x)
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
   static void main34(String s1,String s2)
    {
        
        char y;int i,m,flag=0;
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
            else if(Character.isDigit(y)==true)
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
            else
            {
                flag=0;
                break;
            }
            
        }
        if(flag==1)
        System.out.println("Yes");
        else
        System.out.println("No");
    
    }
    public static void main(String[] args)throws IOException
    {
       BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
       String ss;int ll,t=0;
       try{
                   if(ob!=null){
                        t=Integer.parseInt(ob.readLine());
                   }
               }catch(NumberFormatException e){

               }
     // jjj=t;
         String s11="",s22="";
                  while(t>0)
           {
                 ss=ob.readLine();
            s11="";s22="";ll=0;
            ll=ss.indexOf(' ');
                s11=ss.substring(0,ll);
        s22=ss.substring(ll+1);
        main34(s11,s22);
         t--;
    }
}
}
