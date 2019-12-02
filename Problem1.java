// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public static int[] productExceptSelf(int[] ar) {
	        int[] out = new int[ar.length];
			for(int i=0,tmp=1;i<ar.length;i++) {
					out[i]= tmp;
					tmp =tmp*ar[i];
			}
			for(int i=ar.length-1,tmp=1; i >= 0; i--) {
				out[i]= out[i] * tmp;
				tmp = tmp * ar[i];		
			}
			return out;
	    }
