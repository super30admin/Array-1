// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//We we find out two prefix product from start to end and form end to start.
//We start to end prefix product will begin with 1 then product of previous indexes.
//Similarly  end to start prefix product will begin with 1 then product of following indexes.
// We will get the product except self on multiplying the values at current index in the tow prefix product arrays.
// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int [] prefixProdLToR = new int[l];
        int [] prefixProdRToL = new int[l];
        int [] results = new int [l];
        prefixProdLToR[0] = 1;
        for(int i = 1; i < l; i++){
            prefixProdLToR[i] = prefixProdLToR[i-1] * nums[i - 1]; 
        }
        prefixProdRToL[l - 1] = 1;
        for(int i = l - 2; i > -1; i--){
            prefixProdRToL[i] = prefixProdRToL[i+1] * nums[i + 1];
        }
        for(int i = 0; i < l; i++){
            results[i] = prefixProdRToL[i] * prefixProdLToR[i];
        }
        return results;
    }
}