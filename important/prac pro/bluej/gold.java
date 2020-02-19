import java.io.*;
 class gold
  {
      public static void main()throws IOException
      {
          BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the limit");
          int n=Integer.parseInt(ob.readLine());
          System.out.print("Enter the elements");
          int a[]=new int[n];
          int np=0;
          for(int i=0;i<n;i++)
          {
              a[i]=Integer.parseInt(ob.readLine());
            }
            for(int pq=0;pq<n;pq++)
            {
                np=a[pq];
          int c=0;
          for(int u=3;u<n;u=(u+2))
          {
          for(int i=3;i<n;i=(i+2))
          {
              c=0;
              c=u+i;
            }
            if(c==np)
            {
                System.out.print("Goldbach's conjecture");
            }
            else
            {
                System.out.print("Not Goldbach's conjecture");
            }
            
        }
        System.out.println();
    }
}
}