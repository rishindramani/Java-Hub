package strings;
public class string9
{
    public static void main(String s)
    {
        int i,v,c,j;
        s=s+" ";
        int t=s.length();
        String s1="";
        for(i=0;i<t;i++)
        {
            char x=s.charAt(i);
            if(x!=' ' )
            {
                s1=s1+x;
            }
            
                else
                {
                    v=0;
                    c=0;
                    for(j=0;j<(s1.length());j++)
                    {
                       char y=s1.charAt(j);
                       if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u'||y=='A'||y=='E'||y=='I'||y=='O'||y=='U')
                       {
                           v++;
                        }
                        else
                        {
                            c++;
                        }
                    }
                    System.out.println("word="+s1+"vowels="+v+"consonants="+c);
                    s1="";
                }
            }
        }
    }