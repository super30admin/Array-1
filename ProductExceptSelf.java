//T.C: O(n) n: length of nums[]
//S.c: O(1) No extra data structure is used.

/*Approach: I am looping twice for getting my prefix and postfix product.
and hence multiplying both the products i get the resultant product of all the numbers except self.
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int prod = 1;
        res[0] = prod;

        for(int i = 1; i< n; i++){
            res[i] = nums[i-1] * prod;
            prod = res[i];
        }

        prod = 1;
        for(int i = n-2; i >= 0; i--){
            prod = nums[i+1] * prod;
            res[i] *= prod;
        }
     return res;
    }
}