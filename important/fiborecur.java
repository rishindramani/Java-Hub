public class fiborecur
{
  void codex(int a,int b,int n)
  {
    if(n<1)
    System.out.print(0);
    else{
        System.out.print(a);
        System.out.print(b);
        codex(b,(a+b),n--);
    }}
    public static void main(int n)
    {
        fiborecur q=new fiborecur();
        q.codex(0,1,n);
    }}