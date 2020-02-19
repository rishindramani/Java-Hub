package output;

public class output__2002
{
      int r(int n)
      {
          int i,k;
                if(n%2==0)
              {
                  i=n/2;
              k=1;
              
            }
            else
            {
                k=n;
                n--;
                i=n/2;
            }
            while(i>0)
            {
                k=k*i*n;
                i--;
                n--;
            }
            return k;
        }
    }   
            