
public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int [] result = productExceptSelf(nums);
		int [] result1 = optimizedProductExceptSelf(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.println(result[i]);
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(result1[i]);
		}
	}
/**
 * Space Optimized Logic: Consider two passes one from beginning and another from the end
 * In result array calculate the forward pass first and then backward pass while multiplying the existing values
 * Time: O(n)
 * Space: O(1) Const space
 * Leetcode accepted: yes
 */
	private static int[] optimizedProductExceptSelf(int[] nums) {
		if(nums == null || nums.length == 0) return new int[1];
		int[] result = new int[nums.length];
		// Initialize runningProduct to facilitate the runningProduct at first index
		int temp, runningProduct = 1;
		for(int i=0; i<nums.length; i++) {
			temp = nums[i];
			result[i] = runningProduct;
			runningProduct = temp*runningProduct;
		}
		runningProduct = 1;
		for(int i=nums.length-1; i>=0; i--) {
			temp = nums[i];
			result[i] = result[i] * runningProduct;
			runningProduct = temp*runningProduct;
		}
		return result;
	}
	
	/**
	 * Logic: Consider two passes one from beginning and another from the end
	 * In forward pass calculate the product until the left element of current element
	 * In backward pass calculate the product until the right element of current element
	 * Time: O(n)
	 * Space: O(n) 
	 * Leetcode accepted: yes
	 */
	private static int[] productExceptSelf(int[] nums) {
		if(nums == null || nums.length == 0) return new int[1];
		int[] result = new int[nums.length];
		int[] forward = new int[nums.length];
		int[] backward = new int[nums.length];
		
		int temp, runningProduct = 1;
		for(int i=0; i<nums.length; i++) {
			temp = nums[i];
			forward[i] = runningProduct;
			runningProduct = temp*runningProduct;
		}
		runningProduct = 1;
		for(int i=nums.length-1; i>=0; i--) {
			temp = nums[i];
			backward[i] = runningProduct;
			runningProduct = temp*runningProduct;
		}
		
		for(int i=0; i<nums.length; i++) {
			result[i] = forward[i] * backward[i];
		}
		return result;
	}

}
