
public class ProductExceptSelf {
	
	//	Time:  O(n) 
	//	Space O(n) -extra array
	//	LeetCode: yes
	
	 public int[] productExceptSelf(int[] nums) {     
	       int length = nums.length;        
	       int[] ans = new int[length];
	       ans[0] = 1;
	       //maintaining a running product
	       for (int i = 1; i < length; i++) {     
	           ans[i] = nums[i - 1] * ans[i - 1];
	       }
	       int right = 1;
	       for (int i = length - 1; i >= 0; i--) {
	           ans[i] = ans[i] * right;
	           right *= nums[i];
	       }
	       return ans;
	   }

}
