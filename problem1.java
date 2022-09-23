public class problem1 {
    public int[] productExceptSelf(int[] nums) {
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : 
//We are take index one by one and multiplying by -1, If array[index] is present thier. If index is not present them put in result array.
        if(nums == null || nums.length==0) return new int[] {};
        
        int[] result = new int[nums.length];
        int prod =1;
        result[0] =1;
        result[nums.length-1] = 1;
        
        for(int i=1;i<nums.length;i++){
            prod = prod*nums[i-1];
            result[i] = prod;
        }
        
        prod =1;
        
        for(int i=nums.length-2; i>=0;i--){
            prod = prod*nums[i+1];
            result[i] = result[i]*prod;
        }
        
        return result;
    }
}
