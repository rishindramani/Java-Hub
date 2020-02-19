package arrays;

import java.util.*;

public class MyInsertionSort {
 public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println();
  int array[]={1,5,7,5,4,6,9,1,2};
     
     
     int n = array.length;
  for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
while((i > -1)&&(array[i]> key ) ) {
   array [i+1] = array [i];
                i--;
            }
array[i+1] = key;
for(i =0;i<array.length; i++) {
 System.out.print(array[i] + ", ");
        }
        System.out.println("\n");
        }
    }
}