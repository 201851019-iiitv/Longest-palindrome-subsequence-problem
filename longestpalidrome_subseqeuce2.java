package hello;

public class longestpalidrome_subseqeuce2 {
 //bottom up approach	
		
		public static int LCSLength(String X, String Y, int n, int[][] T)
		{
		
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					
					if (X.charAt(i - 1) == Y.charAt(j - 1)) {
						T[i][j] = T[i - 1][j - 1] + 1;
					}

					
					else {
						T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
					}
				}
			}
			return T[n][n];
		}

	
		public static void main(String[] args)
		{
			String X = "ABBDCACB";

			
			String Y = new StringBuilder(X).reverse().toString();

		
			int[][] T = new int[X.length() + 1][X.length() + 1];
			System.out.println( LCSLength(X, Y, X.length(), T));
		}
	}
	

