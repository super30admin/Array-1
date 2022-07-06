//LeetCode Problem 238
//Time Complexity: O(n)
//Space Complexity: O(1), as problem itself requires an array output, no extra space utilized.
//Code run successfully on LeetCode.

public class Problem1 {
	
	 public int[] productExceptSelf(int[] nums) {
		 
		 int n = nums.length;
		 int rp = 1;
		 
		 int[] result = new int[n];
		 
		 result[0] = 1;
		 
		 for(int i =1; i < n; i++) {
			 
			 rp = rp * nums[i-1];
			 result[i] = rp;
		 }
		 
		 rp = 1;
		 
		 for(int i = n-2; i>=0; i--) {
			 
			 rp = rp * nums[i+1];
			 result[i] *= rp;
		 }
	     return result;
	    }

}
