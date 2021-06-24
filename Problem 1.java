// Time Complexity : O(N)
// Space Complexity : O(1) we dont count the array as the question says output array does not count
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
// Found raw multiplication of all the number excluding 0s, if there were multiple 0s then whole array would be 0
// If there was only one zero then the result would be raw multiplication divided by number at that index
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] rSum = new int[nums.length];
        int Sum = 1;
        int counter = 0;
        boolean flag = false;
        if(nums == null || nums.length == 0) return rSum;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                Sum = Sum*nums[i];
            }
            if(nums[i] == 0){
                flag = true;
                counter++;
            }
            
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(counter < 2){
                    rSum[i] = Sum;
                }else{
                    rSum[i] = 0;
                }
            }else{
                if(flag == false){
                    rSum[i] = Sum/nums[i];
                }else{
                    rSum[i] = 0;
                }
            }            
        }
        
        return rSum;
    }
}
