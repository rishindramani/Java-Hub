package output;
public class Myprocess
{
    private int z,res;
    
    Myprocess()
    {
        z=1;
    }
    void readdata(int a,int b)
    {
        res=result(a,b);
        System.out.println(res);
    }
    int result(int m,int n)
    {
        if(n<=0)
        {
             return z;
            }
            else
            {
                return (m*result(m,n-1));
            }
        }
    }
