package important;
import java.util.HashSet;
public class Subsequence {
	
	// set to store all the subsequences
	static HashSet<String> st = new HashSet<>();
static String[] strArr = new String[st.size()];
	// It computes all the subsequence of an string
	static void subsequence(String str)
	{
		// iterate over the entire string
		for (int i = 0; i < str.length(); i++) {
			
			// iterate from the end of the string
			// to generate substrings
			for (int j = str.length(); j > i; j--) {
				String sub_str = str.substring(i, j);
			
				if (!st.contains(sub_str))
					st.add(sub_str);

				// drop kth character in the substring
				// and if its not in the set then recur
				for (int k = 1; k < sub_str.length() - 1; k++) {
					StringBuffer sb = new StringBuffer(sub_str);

					// drop character from the string
					sb.deleteCharAt(k);
					if (!st.contains(sb))
						;
					subsequence(sb.toString());
				}
			}
		}
		String[] strArr = new String[st.size()];
        st.toArray(strArr);
        st.toArray(strArr);
        System.out.println(strArr[1]);
	}
	// Driver code
	public static void main(String[] args)
	{
	    //Scanner ob=new Scanner(System.in);
            //String s;
            
            //s=ob.nextLine();
		String s = "ACAABCCAB";
		subsequence(s);
		//System.out.println(strArr[0]);
	}

    public int tain(String str,char x) 
    {
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) 
        {
                       if(x == str.charAt(i)) 
            {
                ++frequency;
                
            }
            
        }
        return frequency;
        
    }
    
    
    
}
