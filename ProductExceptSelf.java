// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class ProductExceptSelf {
	 public int[] productExceptSelf(int[] nums) {
	     int[] leftProduct=new int[nums.length];
	        int[] result=new int[nums.length];
	         for(int i=0;i<nums.length;i++){
	           leftProduct[i]=1;   
	        }
	        findLeftProduct(nums,leftProduct);
	       
	        int rightProduct=1;
	        for(int i=nums.length-1;i>=0;i--){
	           leftProduct[i]=leftProduct[i]*rightProduct;
	            rightProduct=rightProduct*nums[i];
	            
	        }
	        return leftProduct;
    }
    
    public void findLeftProduct(int[] nums,int[] leftProduct){
        for(int i=1;i<nums.length;i++){
           leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }
    }
}
