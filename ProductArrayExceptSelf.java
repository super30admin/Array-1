


//Time Complexity :O(n)
//Space Complexity :O(1) as resultant is not considered for space complexity	
//Did it run on leet code :yes
//Did you have any problem running this code: no

class Solution {
    public int[] productExceptSelf(int[] nums) {
   
        int[] output = new int[nums.length];
        int n = nums.length;
        int rightProduct =1;
        output[0] = 1;
      //left pass        
        for(int i = 1; i < nums.length; i++){
            output[i] = output[i-1] * nums[i-1];
        }
        //right pass
        for(int i = n-1 ; i >=0 ;i--){
            output[i] = output[i]*rightProduct;
            rightProduct = nums[i] *rightProduct;
        }
        
        return output;
    }
}