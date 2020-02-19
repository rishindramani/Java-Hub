package functions;
public class function1__sum_of_factorial_series_up_to_n
{    
    public static int fact(int n)
    {int i,f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void sum(int n)
    {    int s=0;
        for(int j=1;j<=n;j++)
        {
             int t=fact(j);
             s=s+t;
            }
            System.out.println(s);
        }
    }

    