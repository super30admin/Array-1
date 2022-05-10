// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
//a. since we cant use division we need to store the products of values in different arrays
//b. we would need two arrays one for when we iterate from left and one from right always excluding the current value
//c. in the end we multiply the products of left and right at a particular index to give us the result

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int leftProduct[] = new int[nums.length];//to store all products left of nums[i]
        int rightProduct[] = new int[nums.length];//to store all products right of nums[i]
        
        //initialise to 1 since product
        leftProduct[0] = 1;
        rightProduct[nums.length-1] = 1;
        
        for(int i=1;i<nums.length;i++){
            leftProduct[i] = leftProduct[i-1]*nums[i-1];//start from index 1 so we can calculate i-1
        }
        for(int i=nums.length-2;i>=0;i--){
            rightProduct[i] = rightProduct[i+1]*nums[i+1];//start from index length-1 so we can calculte i+1
        }
        for(int i=0;i<nums.length;i++){
            result[i] = leftProduct[i]*rightProduct[i];
        }
        return result;
    }
}