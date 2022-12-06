//Time Complexity :O(N) where N is the size of input Array
//Space Complexity :O(1) Because the extra space we are using is the result itself so it
//will not count
//Did this code successfully run on LeetCode :Yes
//Any problem you faced while coding this : No 


public class ProductExceptSelf {

	   
    public int[] productExceptSelf(int[] nums) {
  
    int[] result = new int[nums.length];    
    result[0] = 1;
    int leftMultiple = 1;
    
    for(int i=1;i<nums.length;i++){
        leftMultiple = leftMultiple * nums[i-1];
        result[i] = leftMultiple;
    } 
        
    int  rightMultiple = 1; 
        
    for(int i=nums.length-2;i>=0;i--){
        rightMultiple = nums[i+1] * rightMultiple;
        
        result[i] = result[i] * rightMultiple;
    }

    return result;
        
    }
} 
