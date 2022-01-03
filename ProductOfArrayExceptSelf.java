package array1;

public class ProductOfArrayExceptSelf {
	//Time Complexity : O(n), where n is the length of array nums
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Multiplying the array except that number
	public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        
        for(int i=1; i<nums.length; i++)
            left[i] = left[i-1] * nums[i-1];
        
        int right = 1;
        for(int i=nums.length - 1; i>=0; i--) {
            left[i] *= right;
            right *= nums[i];
        }
        
        return left;
    }
	
	//Time Complexity : O(n), where n is the length of array nums
	//Space Complexity : O(n) used by 2 arrays left and right
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Multiplying the array except that number
	public int[] productExceptSelf1(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        
        for(int i=1; i<nums.length; i++)
            left[i] = left[i-1] * nums[i-1];
        
        int[] right = new int[nums.length];
        right[nums.length - 1] = 1;
        
        for(int i=nums.length - 2; i>=0; i--)
            right[i] = right[i+1] * nums[i+1];
        
        for(int i=0; i<nums.length; i++)
            left[i] *= right[i];
        
        return left;
    }
}
