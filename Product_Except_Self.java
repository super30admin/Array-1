/**************************** Brute force approach**********************/
// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes (Time Limit Exceeded)
// Three line explanation of solution in plain english

 /* Iterating over the array with 2 loops and if indexes are different, then multiply with current value and store in the array */

import java.util.Arrays;

public class Product_Except_Self {
	public static int[] productExceptSelf_bruteForce(int[] nums) {
		
		int[] result = new int[nums.length];
		for(int i=0 ; i<nums.length; i++) {
			int product = 1;
			for (int j= 0; j< nums.length; j++) {
				
				if(i != j)
					product = product * nums[j];
				
				result[i] = product;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] result = productExceptSelf_bruteForce(nums);
		System.out.print(Arrays.toString(result));

	}

}



/**************************** Left and right product Approach**********************/
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*We will make the product of all the numbers to the left of i(left array)and
 *multiply it by the product of all the numbers to the right array. 
 *This will give us the product of all the numbers except the one at the given index i
 */

public class Product_Except_Self {
	public static int[] productExceptSelf(int[] nums) {
		if(nums == null || nums.length == 0)
            return new int[0];
        
        int[] left = new int[nums.length];	//left array to store all the products to the left of i
        int[] right = new int[nums.length];	//right array to store all the products to the right of i
        int[] result = new int[nums.length];	// result to store the product of two arrays
        
        left[0] = 1;	// initializing to 1, since there are no elements the left of 1st number
        for(int i=1; i<nums.length; i++)
            left[i] = nums[i -1] * left[i-1];
        
        right[nums.length-1] = 1;	// initializing to 1, since there are no elements to the right of last number
        for(int i=nums.length-2; i>=0; i--)
            right[i] = nums[i + 1] * right[i + 1];
        
        for(int i =0; i<nums.length; i++)
            result[i] = left[i] * right[i];
        
        return result;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] result = productExceptSelf(nums);
		System.out.print(Arrays.toString(result));
	}
}


/**************************** Left and right product Approach with O(1) Space complexity**********************/
// Time Complexity : O(n)
// Space Complexity : O(1); using only the result array to compute the product of left and right arrays
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*Same approach as above, instead of having two separate arrays for left and right to compute product,
 * we will be using result array
 */

public class Product_Except_Self {
	public static int[] productExceptSelf(int[] nums) {
		if(nums == null || nums.length == 0)
            return new int[0];
        
        int[] result = new int[nums.length];
        
        result[0] = 1;	// initializing to 1, since there are no elements the left of 1st number
        //  store all the products to the left of i in result array
        for(int i=1; i<nums.length; i++)
            result[i] = nums[i -1] * result[i-1];
        
        int right = 1;	// instead of having separate array, using variable to initialize to 1, since there are no elements to the right of 1ast number
        for(int i=nums.length-1; i>=0; i--){
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        return result;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] result = productExceptSelf(nums);
		System.out.print(Arrays.toString(result));
	}
}