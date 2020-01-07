// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// 		1. Left and Right Array of Products to left and right of i respectively
//		2. Multiply both L and R arrays to get final product array
//		3. First Element of L is 1 and Last Element of R is 1, to account for missing index.

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{0};
        int length = nums.length;
        
        int[] L = new int[length];
        int[] R = new int[length];
        int[] answer = new int[length];
        
        L[0] = 1;
        for(int i = 1; i < length; i++){
            L[i] = nums[i - 1] * L[i - 1];
        }
        
        R[length - 1] = 1;
        for(int i = length - 2; i >= 0; i--){
            R[i] = nums[i + 1] * R[i + 1];
        }
        
        for(int i = 0; i < length; i++){
            answer[i] = L[i] * R[i];
        }
        
        return answer;
    }
}