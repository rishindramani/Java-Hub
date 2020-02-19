package output;

public class output__2013
{
      void recur(int n)
      {
          if(n>1)
          {
              
                  System.out.print(n+" ");
                  if(n%2!=0)
              {
              n=3*n+1;
              System.out.print(n+" ");
              
            }
            recur(n/2);
        }
    }
}