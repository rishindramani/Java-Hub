package important;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
class cfcf
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
        int k = s.nextInt(); 
        String s1="";int i,j,ind=0;
        long a[]=new long[n];long t;//temp,l=0;
        //int b[]=new int[n];
        
        for(i=0;i<n;i++)
        {
            a[i]=s.nextLong();
        }
         for(i=0;i<n;i++)
        {
            t=a[i];
            for(j=0;j<n;j++)
        {
            if(i==j)
            {
                continue;
            }
            else
            {
            s1=t+""+a[j];
            //s2=a[j]+""+t;
            if(Long.parseLong(s1)%k==0)
            //||Integer.parseInt(s2)%k==0)//&&(Integer.parseInt(s1)!=Integer.parseInt(s2)))
            {
                ind++;
            }
        }
        s1="";
            }
        }
        System.out.println(ind);
      
            }
                
                }