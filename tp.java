import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
class tp
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
    static int count2(int aa[],int bb[])
    {
        int i2,c2=0;
          for(i2=0;i2<aa.length;i2++)
           {
               if(aa[i2]==bb[i2])
               c2++;
            }
            return c2;
        }
        
 public static void main(String[] args)
    {
       FastReader s=new FastReader(); 
        int t=s.nextInt(); 
        int i,pr;;
        while(t>0)
        {
            pr=0;
           int n=s.nextInt();
           int q=s.nextInt();
           int a[]=new int[n];
           int b[]=new int[n];
           for(i=0;i<n;i++)
           {
               a[i]=s.nextInt();
              
            }
            for(i=0;i<n;i++)
           {
               b[i]=s.nextInt();
              
            }
            // pr=count2(a,b);
            for(i=0;i<q;i++)
           {
              int x=s.nextInt();
              int y=s.nextInt();
              int z=s.nextInt();
             int  l=x^pr;
             int  r=y^pr;
              int c=z^pr;
            for(i=l-1;i<r;i++)
           {
               a[i]=c;
            }
         //  pr=count2(a,b);
            System.out.println(pr);
                }
        t--;
        }
    }
}
            
            
            
            
          