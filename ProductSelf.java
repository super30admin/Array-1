//Time Complexity: O(n)
//Space Complexity: O(n) -> left array,  O(n) -> right array, thus O(n);
//Does this code run on LeetCode: Yes
//Any issues faced during implementation: No. 



class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0)
            return new int[]{};
        
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        
        int prod = 1;
        left[0] = prod;  
        
        for(int i = 1; i < n; i++){
            prod = prod * nums[i-1];
            left[i] = prod; 
        }
        
        prod = 1;
        right[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            prod = prod * nums[i+1];
            right[i] = prod;
        }
        
        for(int i = 0; i < left.length;i++)
        {
            ans[i] = left[i] * right[i];
        }
        
        return ans;
    }
}