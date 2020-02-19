import java.util.*;
class j
{
   public static void main(String args[])
  {
  Scanner ob=new Scanner(System.in);
  int t=ob.nextInt();
  int i,j,k,max,in;  
  String s;
  char x,y;
  int a[]=new int[10000000];
   while(t>0)
  {
         s=ob.next();
         s=s+" ";
         k=0;
         for(i=0;i<s.length();i++)
         {
             x=s.charAt(i);
             for(j=0;j<s.length();j++)
         {
            y=s.charAt(j);
            if(x==y)
            {
                in=j-i;
                a[k]=in;
                k++;
            }
            else
            {
                a[k]=0;
                k++;
            }
        }
    }
   max=a[0];
     for(i=0;i<k;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
        
    t--;
}
}
}
 
                     