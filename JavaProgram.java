import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
        int ci, i, j, k,k1,in1=0,in2=0;
        String str, str2;
        char c, ch,ch1;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        str=scan.nextLine();
        str2=scan.nextLine();
        int a[]=new int[1000];
        int b[]=new int[1000];
        i=str.length();
        for(c='a'; c<='z'; c++)
        {
            k=0;
            k1=0;
            for(j=0; j<i; j++)
            {
                ch = str.charAt(j);
              // ch1 = str2.charAt(j);
                if(ch == c)
                {
                    k++;
                }
               /* if(ch1 == c)
                {
                    k1++;
                }*/
            }
            a[in1]=k;in1++;
           // b[in2]=k1;in2++;
           /* if(k>0)
            {
                System.out.println("The character " + c + " has occurred for " + k + " times");
            }*/
        }
        
        for(c='A'; c<='Z'; c++)
        {
            k=0;k1=0;
            for(j=0; j<i; j++)
            {
                ch = str.charAt(j);
               // ch1 = str2.charAt(j);
                if(ch == c)
                {
                    k++;
                }
               /* if(ch1 == c)
                {
                    k1++;
                }*/
            }
             a[in1]=k;in1++;
           // b[in2]=k1;in2++;
            /*if(k>0)
            {
                System.out.println("The character " + c + " has occurred for " + k + " times");
            }*/
        }
        for(c='0'; c<='9'; c++)
        {
            k=0;k1=0;
            for(j=0; j<i; j++)
            {
                ch = str.charAt(j);
                 //ch1 = str2.charAt(j);
                if(ch == c)
                {
                    k++;
                }
              /*  if(ch1 == c)
                {
                    k1++;
                }*/
            }
          a[in1]=k;in1++;
            //b[in2]=k1;in2++;
        }
        
       // for(j=0;j<1000; j++)
         //   {
                System.out.println(a[4]);//System.out.println(b[5]);
         //   }
        
        
   }
}