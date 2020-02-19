package important;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;  
class hack
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
        String s1 = s.nextLine(); 
        int j,flag=0;
         String s3=s1.substring(0,2)+s1.substring(3,6)+s1.substring(7);
         char z=s1.charAt(2);
         if(z=='A'||z=='E'||z=='I'||z=='O'||z=='U')
            {
                flag=0;
            }
            else
            {
            for(j=0;j<6;j++)
        {
           char x=s3.charAt(j);
            char y=s3.charAt(j+1);
            int t=(Character.getNumericValue(x)+Character.getNumericValue(y));//+Integer.valueOf(y));
             if(t%2==0)
            {
                flag=1;
                
            }
            else
            {
                flag=0;
                break;
            }
        }
    }
    if(flag==0)
    {
        System.out.println("invalid");
    }
    else
    {
        System.out.println("valid");
    }
}
}
           
          
         
           
            
            
            
            
            
            
            
            