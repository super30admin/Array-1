// Time Complexity : O(n)
// Space Complexity : O(1)

/*
 * we travese through the array and multiply the elements before the index.
 * then we traverse from the back and multiply the elements after the index.
 */
class ProductOfSelfExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pre = 1;
        for (int i = 0; i < n; i++){
            arr[i] = pre;
            pre *= nums[i];
        }
        int post = 1;
        for(int i = n-1; i >= 0; i--){
            arr[i] *= post;
            post *= nums[i];
        }
        return arr;
    }
}