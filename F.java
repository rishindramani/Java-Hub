class f
{
    int e[]=new int[50];
    
    int cap,f,r;
    f()
    {
        for(int i=0;i<200;i++)
        {
            e[i]=0;
        }
    }
    f(int nx,int nf,int nr)
    {
        cap=nx;
        f=nf;
        r=nr;
    }
    void push(int num)
    {
        if(r<cap)
        {
            e[++r]=num;
        }
        else
        {
            System.out.println("full");
        }
    }
}