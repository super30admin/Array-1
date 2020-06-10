// Time Complexity : O(n). n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
       if (nums == null || nums.length == 0)
			return new int[0];

		int runningProd = 1, beforeValue = 1;
		int[] result = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			runningProd=runningProd*beforeValue;
			result[i] = runningProd;
			beforeValue=nums[i];
		}
		runningProd=1;int afterValue=1;
		for (int i = nums.length-1; i >=0; i--) {
			runningProd=runningProd*afterValue;
			result[i]=result[i]*runningProd;
			afterValue=nums[i];
			
		}
		return result;
    }
}
