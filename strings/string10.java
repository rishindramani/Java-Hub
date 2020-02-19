package strings;
public class string10
{
    public static void main(String s)
    {
        int i;
        int t=s.length();
        for(i=0;i<t;i++)
        {
            char y=s.charAt(i);int as=(int)y;
            if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u'||y=='A'||y=='E'||y=='I'||y=='O'||y=='U')
            {
                System.out.print(y);
            }
            else
            {
                as++;
                if(as>90)
                {as=as-26;
                }
                if(as<65)
                {
                    as=as+26;
                }
                System.out.print((char)as);
            }
        }
    }
}
                
            