//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None


class Product_of_Array_Except_Self {
	public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
        	return new int[0];
        
        int[] result = new int[nums.length];
        
        int temp = 1;
        int rP = 1;
        for(int i = 0; i < nums.length; i++)
        {
        	rP *= temp;
        	result[i] = rP;
        	temp = nums[i];
        }
        
        temp = 1;
        rP = 1;
        for(int i = nums.length - 1; i >= 0; i--)
        {
        	rP *= temp;
        	result[i] *= rP;
        	temp = nums[i];
        }
        
        return result;
    }
	
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4};
		Product_of_Array_Except_Self pr = new Product_of_Array_Except_Self();
		
		int[] result = pr.productExceptSelf(nums);
		for(int i : result)
			System.out.print(i + " ");
	}
}