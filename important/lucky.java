import java.io.*;
public class lucky
{
    public static void main(String args[])throws IOException
    {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("Enter the limit");
            int l=Integer.parseInt(br.readLine());
            int a[]=new int[l];
            int c=1;
            for(int i=0;i<l;i++)
            {
                a[i]=c;
                c++;
            }
            for(int i=2;i<l;i++)
            {
                for(int j=1;j<l;j++)
                {
                    if(j%i==0)
                        a[j-1]= 0;
                } }  
                for(int i=0;i<l;i++)
                {
                    if(a[i]!=0)
                    {
                        System.out.println(a[i]);
                    }
                }
            }
            }