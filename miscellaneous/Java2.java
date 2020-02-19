package important;
import java.io.*;

public class Java2
{
     //Scanner ob= new Scanner(System.in);
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
   void main34(String s1,String s2)
    {
        
        char y,z;int i,m,flag=0;
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
    public void main(String[] args)throws IOException
    {
       BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(ob.readLine());
        //int t=ob.nextInt();
       //int t=ob.nextInt();
        //Java2 e=new Java2();
        String ss;int ll,i;
               // String ss[]=new String[n];    
               String s11="",s22="";//int ii;
       // for(ii=0;ii<n;ii++)
        //
            while(t>0)
           {
           
            ss=ob.readLine();
        
            //for(ii=0;ii<n;ii++)
        
           s11="";s22="";ll=0;
           for(i=0;i<ss.length();i++)
                  {
                      if(ss.charAt(i)!=' ')
                      {
                          s11=s11+ss.charAt(i);
                        }
                        else
                        {
                            ll=i;
                            break;
                        }
                    }
                     for(i=ll+1;i<ss.length();i++)
                  {
                          s22=s22+ss.charAt(i);
                        }
                       
                  // ll=ss.indexOf(' ');
                   //System.out.println(ll);
        //s11=ss.substring(0,ll);
        //s22=ss.substring(ll);
        main34(s11,s22);
      //   t--;
    //
       // s11="";s22="";
        t--;
    }
}
}






        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    