// Time Complexity :O(n) n is the size of the array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : A new array is created which has the numbers of the
//orignal array multipled from the left (1 to n-1, 0th pos has value stored as 1). Then the right side(n-1 to 0) of the array is multiplied
// by storing each iterations value in R. This R is multiplied to the left array at each backward iteration thereby giving the desired result. 


// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] outputArray = new int[nums.length];
        outputArray[0] =1;
        int len = nums.length;
        for(int i =1;i<nums.length;i++){
            outputArray[i] = outputArray[i-1] * nums[i-1];  
        }
        int R =1;
        for(int i =len-1;i>=0;i--){
            outputArray[i] *= R;
            R *= nums[i];
        }
        
        return outputArray;
    }
    
}