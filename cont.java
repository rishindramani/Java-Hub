import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
class cont
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }  
    
 public static void main(String[] args)
    {
       FastReader s=new FastReader(); 
        int t = s.nextInt();
        int i;
        while(t>0)
        {
           int n = s.nextInt();
           int k = s.nextInt();
           int a[]=new int[n];
          int ss=k;
           for(i=0;i<n;i++)
           {
               a[i]=s.nextInt();
           //}
            //for(i=0;i<n;i++)
           //{
               if(a[i]<=ss)
               {
                   System.out.print("1");
                   ss=ss-a[i];
                }
                else
                {
                    System.out.print("0");
                }
                
            }
            System.out.println();
                 t--;
        }
    }
}