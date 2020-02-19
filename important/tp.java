 package important;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class tp//
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
        int n = s.nextInt(); 
        long a[]=new long[n];
        int i,j,c=0,flag=0;;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextLong();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                    c++;
                
                    if(c>3)
                    {
                      break;
                }
                           
            }
        }
            if(c==3)
            {
               System.out.println("YES"); 
                
            }
             else
            {
                System.out.println("NO");
            }
           }
}
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        