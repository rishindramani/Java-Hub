import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
     String smallest="";
    String largest="";
    for(int i = 0;i<=s.length()-k;i++){
        String subString = s.substring(i,i+k);
        if(i == 0){
            smallest = subString;
        }
        if(subString.compareTo(largest)>0){
            largest = subString;
        }else if(subString.compareTo(smallest)<0)
            smallest = subString;
    }         
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.next();
        int a[] =new int[n];
        for(i=0;i<n;i++)
        { 
            
            a[i]=scan.nextInt();
        }
        for(i=0;i<n;i++)
        {
            l=n-1;
            s1=s1+a[i];
            for(j=n-1;j>i;j--)
            {
            s2=s2+a[j];
        }
            if(
       
    }
}