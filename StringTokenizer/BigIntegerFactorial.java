package StringTokenizer;

import java.math.BigInteger;
public class BigIntegerFactorial {
 
    public static void main(String[] args) {
        calculateFactorial(50);
    }
    public static void calculateFactorial(int n) {
         
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + result);
    }
     
}