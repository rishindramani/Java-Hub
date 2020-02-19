class Program
{
   static void Main(string[] args)
   {
      int N = 3;
      var A = new string[N][];
      A[0] = new string[]{"a", "b", "c"};
      A[1] = new string[]{"d", "e", "f"};
      A[2] = new string[]{"1", "2", "3"};

      /* We first need to get all possible combinations of the N arrays.
         To do this we consider all integers from 1 to 2 ^ N - 1 expressed
         in binary. The positions of the 1's in these binary strings will tell
         us whether to include a particular array in a given combination or not.
         We order these by the number of 1's in each binary string and then
         reverse the strings so that the results will be presented in the required order.
      */

      int max = (int)Math.Pow(2, N) - 1;
      string[] B = Enumerable.Range(1, max).
                   Select(i -> Convert.ToString(i, 2).PadLeft(N, '0')).
                   OrderBy(s -> s.ToCharArray().Count(c -> c == '1')).
                   Select(s -> new string(s.Reverse().ToArray())).
                   ToArray();                                  

      /* Now get all the combinations by choosing one element from each array specfied
         in each binary string using recursion.
      */
 
      List<string> C = GetCombinations(A, B);
      Console.WriteLine(String.Join(",", C));
      Console.ReadKey();     
   }

   static List<string> GetCombinations(string[][] A, string[] B)
   {
      var C = new List<string>();
      var sb = new StringBuilder();

      for(int x = 0; x < B.Length; x++)
      {
         GetNextLevel(A, B, x, 0, sb, C);
      }

      return C;
   }

   static void GetNextLevel(string[][] A, string[] B, int x, int y, StringBuilder sb, List<string> C)
   {
      if (y < A.Length)
      {
         if (B[x][y] == '1')
         { 
            foreach(string t in A[y])
            {
               sb.Append(t);
               GetNextLevel(A, B, x, y + 1, sb, C);
               sb.Length = sb.Length - 1;
            }
         }
         else
         {
            GetNextLevel(A, B, x, y + 1, sb, C);             
         }
      }
      else
      {
         C.Add(sb.ToString());
      }
   }  
}