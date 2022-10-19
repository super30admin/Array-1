// Approach: multiply prefix product and store in answer. multiply suffix product to the answer array
// Time Complexity: O(n) , nis the size of nums array
// Space Complexity: O(1)
// https://leetcode.com/problems/product-of-array-except-self/

public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] prod = new int[nums.Length];
        
        int preProd = 1;
        for(int i =0; i<nums.Length; i++){
            prod[i] = preProd;
            preProd *= nums[i];
        }
        
        int suffixProd = 1;
        for(int j = nums.Length-1; j>=0; j--){
            prod[j] *= suffixProd;
            suffixProd *= nums[j];
        }
        
        return prod;
    }
}
