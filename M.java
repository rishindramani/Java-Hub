import java.util.*;
class M
{
   public static void main(String args[])
  {
  Scanner ob=new Scanner(System.in);
  int t=ob.nextInt();
  int i,c;
  while(t>0)
  {
      c=0;
      int n=ob.nextInt();
      int k=ob.nextInt();
      int a[]=new int[n];
      
      for(i=0;i<n;i++)
      {
          a[i]=ob.nextInt();
        }
        for(i=0;i<n;i++)
      {
          a[i]=a[i]+k;
        }
        for(i=0;i<n;i++)
      {
          
          if(a[i]%7==0)
          {
              c++;
            }
        }
        System.out.println(c);
        t--;
    }
}
}
        
        