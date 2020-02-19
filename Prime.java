import java.util.*;
public class Prime 
{ 
    static boolean isprime(int x) 
    { 
        for (int i=2; i*i<=x; i++) 
            if (x%i == 0) 
              
                return false; 
        return true; 
    } 
    static boolean isSumOfKprimes(int N, int K) 
    { 
        
        if (N < 2*K) 
            return false; 
          
       
        if (K == 1) 
            return isprime(N); 
              
        if (K == 2) 
        { 
           
            if (N%2 == 0) 
                return true; 
                  
          
            return isprime(N - 2); 
        } 
          
        
        return true; 
    } 
      
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();int k;
        for(k=1;k<=n;k++)
        {
        if (isSumOfKprimes (n,k)) 
        {
             System.out.print("yes");
            }
            
        else
        {
        System.out.print("No"); 
    } 
} 
}
}