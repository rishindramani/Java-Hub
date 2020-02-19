import java.io.*;
 class prime
  {
      public static void main()throws IOException
      {
          int c=0;
          BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the number");
          int a=Integer.parseInt(ob.readLine());
          for(int i=1;i<=a;i++)
          {
              if(a%i==0)
              {
                  c++;
                }
                }
                if(c==2)
                {
                    System.out.print("prime");
            }
        }
    }