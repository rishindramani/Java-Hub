package strings;
public class pair_of_adjacent_letters_reversed
{
    public static void main(String s)
    {
        int i,j,k=0,newl;
        int t=s.length();
        char a[]=new char[t];
        if(t%2==0)
        {
            newl=t;
        }
        else
        {
            newl=t-1;
        }
     for(i=0;i<newl;i++)
        {
            char x=s.charAt(i);
            char y=s.charAt(i+1);
            a[k]=y;
            k++;
            a[k]=x;
            k++;
            i++;
                }
                for(i=0;i<k;i++)
        {
            System.out.print(a[i]);
        }
   if(t%2!=0)
   {
       System.out.print(s.charAt(t-1));
    }
}
}
                
                         