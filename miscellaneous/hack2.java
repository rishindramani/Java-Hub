package important;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
class hack2
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
    static int search(int arr[], int se) 
    { 
        for (int i = 0; i < arr.length; i++) 
        { 
            // Return the index of the element if the element 
            // is found 
            if (arr[i] == se) 
                return 1; 
        } 
   
        // return -1 if the element is not found 
        return -1; 
    } 
 public static void main(String[] args)
    {
        FastReader s=new FastReader(); 
        int t=s.nextInt();
        int i,flag=0,x;
        int a[]={6,10, 14, 15, 21, 22, 26, 33, 34, 35, 38, 39, 46, 51, 55, 57, 58, 62, 65, 69, 74, 77, 82, 85, 86, 87, 91, 93, 94, 95, 106, 111, 115, 118, 119, 121, 122, 123, 129, 133, 134, 141, 142, 143, 145, 146, 155, 158, 159, 161, 166, 169, 177, 178, 183, 185, 187, 194};
    while(t>0)
  {
      int n=s.nextInt();
      for(i=0;i<a.length;i++)
      {
          x=0;
          x=n-a[i];
          if(search(a,x)==1)
          {
              flag=1;
              break;
            }
         
        else
        {
            flag=0;
        }
    }
    if(flag==1)
     System.out.println("YES");
     else
      System.out.println("NO");
      
      t--;
      
        }
        }
    }
        
  
      
      
      
      
      
      
      
      
      
      
      
      