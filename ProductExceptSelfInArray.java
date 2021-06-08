package Array1;
//Time Complexity : o(2n) - O(n)
//Space Complexity :o(1), no extra space is used
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this :No

//Your code here along with comments explaining your approach

import java.util.Arrays;

public class ProductExceptSelfInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		
		int result[] = productExceptSelfInArray(nums);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] productExceptSelfInArray(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		int[] result = new int[n];
		//edge case
		if(nums == null || nums.length == 0) return result;
		//running product
		int rp = 1; 
		result[0] = 1;
		//find left running prd
		for(int i = 1; i < nums.length; i++) {
			rp = rp * nums[i-1];
			result[i] = rp;
		}
		//reset rp to find right rp
		rp = 1;
		for(int i = n-2; i>=0; i--) {
			rp = rp * nums[i+1];
			result[i] = result[i] * rp;
		}
		return result;
	}

	
	
}
