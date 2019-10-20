package hello;

public class longest_palidrome_subsequence {
	//recursive approach;
	 static int max(int x, int y) { 
	       if(x>y)
	    	   return x;
	       else
	    	   return y;
	    }   
	  
	    static int lps(char s[], int i, int j) { 
	        if (i == j) { 
	            return 1; 
	        }  
	        if (s[i] == s[j] && i + 1 == j) { 
	            return 2; 
	        }  
	        if (s[i] == s[j]) { 
	            return lps(s, i + 1, j - 1) + 2; 
	        } 
	        return max(lps(s, i, j - 1), lps(s, i + 1, j));
	        
	    } 
	  
	    public static void main(String[] args) { 
	        String s ="ABBDCACB"; 
	        int n = s.length(); 
	        System.out.print( lps(s.toCharArray(), 0, n - 1)); 
	  
	    } 
	} 

