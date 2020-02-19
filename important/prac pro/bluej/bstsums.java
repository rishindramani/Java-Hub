import java.io.*;
 class bstsums
  {
      public static void main()throws IOException
      {
          BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the limit");
          int n=Integer.parseInt(ob.readLine());
          int array[]=new int[n];
          System.out.println("Enter the nos");
          int chk[]=new int[100];
          int pq=0;
          for(int i=0;i<n;i++)
          {
              array[i]=Integer.parseInt(ob.readLine());
            }
            System.out.println("Enter the k");
            int k=Integer.parseInt(ob.readLine());
            System.out.println("Enter the p");
            int p=Integer.parseInt(ob.readLine());
            for(int j=0;j<n;j++)
            {
                int c=array[j];
                for(int u=(j+1);u<n;u++)
                {
                    c=c+array[u];
                    if(c%p==k)
                    {
                        chk[pq]=c;
                        pq++;
                    }
                }
    }
for(int pm=0;pm<(pq-1);pm++)
 {
     for(int q=(pm+1);q<pq;q++)
     {
         int temp=chk[pm];
         chk[pm]=chk[q];
         chk[q]=temp;
        }
    }
    System.out.print(chk[0]);
}
}

    


                    