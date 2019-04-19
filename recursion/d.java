package recursion;

class d
{
    void fun(int x)
    {
        System.out.println(++x);
        if(x>1)
        fun(x-3);
        System.out.println(x);
    }
}