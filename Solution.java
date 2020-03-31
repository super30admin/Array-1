// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Edge case
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        int runningProd = 1; // to store the products
        int temp = 1;        // to store the traversed element 
        int[] result = new int[nums.length]; //ouptut array
        
        // Getting all the running products by traversing from left to right of the element 
        for(int i=0; i<nums.length; i++){
            runningProd *= temp;
            result[i] = runningProd;
            temp = nums[i];
        }
        
        // Resetting the products
        temp = 1;
        runningProd = 1;
        
        // Getting all the running products by traversing from right to left
        for(int i=nums.length-1; i>= 0; i--){
            runningProd *= temp;
            result[i] = result[i]*runningProd;
            temp = nums[i];
        }
        
        return result;
    }
}
