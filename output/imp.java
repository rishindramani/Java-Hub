package output;
public class imp
{
    void work(String s,int v)
    {
        if(v<s.length())
        {
            char ch=s.charAt(v);
            System.out.print(ch+" ");
            work(s,v+1);
            System.out.println("\n"+ch+"@");
        }
    }
}