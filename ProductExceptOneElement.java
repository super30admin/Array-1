//Time Complexity: O(n)
//Space Complexity: O(1)
// Description of approach: we make 2 passes and get the product of all the elements except the current element
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        if(nums == null || nums.length ==0){
            return result;
        }
        
        int runningProduct = 1, temp =1;
		//temp is used as 1 for the first element, then temp is assigned the previous nums value
        
        //forward pass
        for(int i=0; i<nums.length; i++){
            runningProduct *= temp;
            result[i] = runningProduct;
            temp = nums[i];
        }
        
        runningProduct = 1;//resetting before traversing again
        
        temp = 1;
        
        //backward pass
        
        for(int i=nums.length -1; i>=0; i--){
            runningProduct *= temp;
            result[i] = result[i] * runningProduct;
            temp = nums[i];
        }
        
        return result;
    }
}