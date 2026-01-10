// SC - O(1) since no extra space is being used
// TC - O(n) Iteration of the array twice. 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int suffixMul = nums[nums.length - 1];
        int prefixMul = 1;
        res[0] = prefixMul;
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i - 1] * prefixMul; // res[i] will contain Mul till i-1
            prefixMul = res[i]; // prefix mul 0 to i
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            res[i] = res[i] * suffixMul;// res[i] will contain Mul till i-1 and multiplied by suffix -> product of all
                                        // items except ith element
            suffixMul = nums[i] * suffixMul; // suffix mul from i to n
        }
        return res;
    }
}
