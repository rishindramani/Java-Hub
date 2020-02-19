package recursion;

class ff2
{
    int fun(int x)
{
    if(x<10)
     return x*x+5;
        return x%10*x%10+fun(x/10)+7;
    }
}