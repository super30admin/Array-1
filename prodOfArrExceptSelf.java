//238. Product of Array Except Self
//Time Complexity :O(n) as iterating through all n elements
//Space Complexity : O(1) i.e. as no extra space is required to store array elements while processing 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*Step 1: check for array if it's empty or values are null in it then return empty array. Otherwise return array with products of element except self. 
 * Step 2: For finding he product in O(n) time complexity. Let's take element at index 1 and keep calculating and storing products in result array
 *  the product towards it's left side. 
 * Step 3: Now, multiply the second last element of "nums" array with last element of result array and update the product in result array. Return result array
 */

public class prodOfArrExceptSelf {

	 public static int[] productExceptSelf(int[] nums) {
	        if(nums.length == 0 || nums == null) return new int[]{};
	        
	        int[] result=new int[nums.length];
	        int prod=1;
	        result[0]=1;
	        //starting from left calculating current product
	        for(int i=1; i<nums.length;i++)
	        {
	            prod=prod*nums[i-1];
	            result[i]=prod;
	        }
	        prod=1;
	        //result[nums.length-1]=1;
	        for(int j=nums.length-2; j>=0; j--)
	        {
	            prod=prod*nums[j+1];
	            result[j]=prod*result[j];
	        }
	        return result;     
	    }
	 
	public static void main(String[] args) {
		int[] nums=new int[] {-1,1,0,-3,3};
		int[] res= new int[nums.length];
		res=productExceptSelf(nums);
		for(int i=0; i<nums.length;i++) {
			System.out.print(res[i]+ " ");
		}

	}

}
