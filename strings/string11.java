package strings;
public class string11
{
    public static void main(String s)
    {
        int i,j;
        s=s+" ";
        int t=s.length();
        String s1="",s2="";
        for(i=0;i<t;i++)
        {
            char x=s.charAt(i);
            if(x!=' ' )
            {
                s1=s1+x;
            }
            
                else
                {
                    for(j=0;j<s1.length();j++)
                    {
                     if(j==0)
                     {
                         s2=s2+"X";
                        }
                        else
                        {
                            char y=s1.charAt(j);
                            s2=s2+y;
                        }
                    }s1="";s2=s2+" ";
                }}
                System.out.print(s2);
            
        }
    }

                         