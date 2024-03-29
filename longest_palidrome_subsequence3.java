package hello;

public class longest_palidrome_subsequence3 {
	//top down memoized approach;

	static int calculate_lps(char s[],int start,int end) {
		int n=s.length;
		 int lps[][] = new int[n][n] ;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			lps[i][j]=0;
		}
		}
	    int i=start;
	    int j=end;
	    if(lps[i][j]==0) {
	        if(i==j)
	            return lps[i][j]=1;
	        else if(s[i]==s[j] && i+1==j)
	            return lps[i][j]=2;
	        else if(s[i]==s[j])
	            return lps[i][j]=calculate_lps(s,i+1,j-1)+2;
	        else
	            lps[i][j]=Math.max(calculate_lps(s,i+1,j),calculate_lps(s,i,j-1));
	    }
	     return lps[i][j];

	}
	public static void main(String []args) {
		 String s = "ABBDCACB"; 
	        int n = s.length(); 
	        System.out.print(calculate_lps(s.toCharArray(), 0, n - 1)); 
	}
}
