time complexity: O(n)
space complexity: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length]; //creating a result array
 
    result[nums.length-1]=1; //putting last element in result as 1
    for(int i=nums.length-2; i>=0; i--){ 
        result[i]=result[i+1]*nums[i+1]; //get the product 
    }
 
    int left=1; //initialising left to 1 
    for(int i=0; i<nums.length; i++){
        result[i]=result[i]*left; //multiplying the current element in result and left 
        left = left*nums[i]; //multiplying left and nums[i] and putting it in left
            }
 
    return result; //returning result
    }
}