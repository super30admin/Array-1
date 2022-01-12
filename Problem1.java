// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//we construct the left product of the array and then maintain a running product variable to calculate the product in result array. Final result
// is calculated using running product(r)* result[i].

// Your code here along with comments explaining your approach
public class Problem1 {
	public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] result =new int[n];
        
        result[0] =1;
        int r = 1;
        
        for(int i = 1;i<n;i++){
            result[i] = result[i-1] * nums[i-1]; 
        }
        
        for(int i = n-1;i>=0;i--){
            result[i] = result[i]*r;
            r *= nums[i]; 
        }
        return result;
    }
}
