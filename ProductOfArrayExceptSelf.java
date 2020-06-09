//Bruteforce

class Solution {

            // Time Complexity : O( nums * nums)
// Space Complexity : O(nums)
// Did this code successfully run on Leetcode : Time Limit Exceedng

    public int[] productExceptSelf(int[] nums) {
     
        if(nums == null || nums.length == 0) return new int[nums.length];
        
        int[] output = new int[nums.length];
        
        for(int i =0;i<nums.length;i++){
            output[i] = 1;
            for(int j =0;j<nums.length;j++){
                if(i!=j){
                    output[i] = output[i] * nums[j];
                }
            }
        }       
        return output;
        
    }
}



class Solution {
    public int[] productExceptSelf(int[] nums) {
// Time Complexity : O( nums )
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach:

/*
Idea is that value at each index will be (product of all nums on left) * (product of all nums on right)
1.Use a result array, then first maintain the left product of all nums 
2. Then in second pass while calc the right product of all nums use the result array directly and multiply the right product to result.
*/
        
        
        
        if(nums == null || nums.length == 0) return new int[0];
        
        int[] result = new int[nums.length];
        
        int rp = 1; int temp = 1;
        for(int i =0;i<nums.length;i++){
            rp = rp*temp;
            result[i] = rp;
            temp = nums[i];
        }     
        rp = 1; temp = 1;
        for(int i =nums.length-1;i>=0;i--){
            rp = rp* temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }
        return result;
        
    }
}

