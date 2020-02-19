package important;

import java.util.*;
class cf
{
 public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int k=ob.nextInt();
        String s1="";int i,j,ind=0;
        long a[]=new long[n];long t;//temp,l=0;
        //int b[]=new int[n];
        
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextLong();
        }
         for(i=0;i<n;i++)
        {
            t=a[i];
            for(j=0;j<n;j++)
        {
            if(i==j)
            {
                continue;
            }
            else
            {
            s1=t+""+a[j];
            //s2=a[j]+""+t;
            if(Long.parseLong(s1)%k==0)
            //||Integer.parseInt(s2)%k==0)//&&(Integer.parseInt(s1)!=Integer.parseInt(s2)))
            {
                ind++;
            }
        }
        s1="";
            }
        }
        System.out.println(ind);
            /*else if(Integer.parseInt(s2)%k==0)
            {
                b[ind]=Integer.parseInt(s2);
                ind++;
            }
            else
            {
                ind++;
            }
            */
                    
               // c++;
                //System.out.println(s1+"  "+s2);
            }
            // s1="";s2="";
        /*for(i=0;i<ind;i++)
        {
        for(j=0;j<(ind-1-i);j++)
             {
                 if(b[j]>b[j+1])
                 {
                     temp=b[j];
                     b[j]=b[j+1];
                     b[j+1]=temp;
                    }
                }
            }
            for(i=0;i<ind;i+=c)
            {
                l++;;
            for(j=0;j<ind;j++)
            {
                if(b[i]==b[j])
                {
                    c++;
                }
            }
                    }
                    */
                       
                }