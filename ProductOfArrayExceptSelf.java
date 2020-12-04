// Time Complexity : O(N), N-> number of elements in input array (nums)
// Space Complexity : O(1), Since no additional space is used
// Did this code successfully run on Leetcode : No
// Three line explanation of solution in plain english: base case: checking whether the input array is empty or not. Maintaing the result(left) array to get the running product. We get the running product by multiplying the input array and result array and storing the result in result array

public class ProductOfArrayExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        
        //base case: checking whether the input array is empty or not
    	if(nums==null || nums.length==0) {
    		return new int[0];
    	}
    	
    	int[] result = new int[nums.length];
    	int pointer = 1,temp=1;
    	
        //maintaing the result(left) array to get the running product
    	for(int i=0;i<nums.length;i++) {
    		pointer = pointer * temp;
    		result[i] = pointer;
    		temp = nums[i];
    	}
    	 temp=1;pointer=1;    //restoring the temp and pointer variables
    	
        //get the running product by multiplying the input array and result array and storing the result in result array
    	for(int i=nums.length-1;i>=0;i--) {
    		pointer = pointer * temp;
    		result[i] = result[i]*pointer;
    		temp = nums[i];
    	}
    	return result;
    }

	public static void main(String[] args) {
		ProductOfArrayExceptSelf ob = new ProductOfArrayExceptSelf();
		int[] nums = {1,2,3,4};
		int[] printRes = ob.productExceptSelf(nums);
		
		for(int i=0;i<printRes.length;i++) {
			System.out.println(printRes[i]);
		}
	}
}