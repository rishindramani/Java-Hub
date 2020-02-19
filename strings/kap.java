package strings;
public class kap
{
    public static void main(int n)
    {
        int i,j=1;
        
        String s1,s,s2;
        int sq=n*n,flag=0,n1,n2;
        s=String.valueOf(sq);
        for(i=0;i<s.length();i++)
        {
            s1=s.substring(i,j);
            s2=s.substring(j);
            j++;
            n1=Integer.valueOf(s1);
            n2=Integer.valueOf(s2);
            if((n1+n2)==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("kap");
        }
        else
        {
            System.out.println("not kap");
        }
    }
}

        