class Solution {
    public int[] productExceptSelf(int[] nums) {

        // O(n) Time and O(n) Space
        // int prefix [] = new int[nums.length];
        // int [] postfix = new int[nums.length];
        // int [] ans = new int[nums.length];
        // prefix[0] = nums[0];
        // postfix[nums.length-1] = nums[nums.length-1];
        // for (int i=1;i < nums.length; i++){
        //     // prefix[i] = 1;
        //     prefix[i] = nums[i] * prefix[i-1];
        // }
        // for (int i=nums.length-2;i >= 0; i--){
        //     // postfix[i] = 1;
        //     postfix[i] = nums[i] * postfix[i+1];
        // }
        // // System.out.println(Arrays.toString(prefix));
        // // System.out.println(Arrays.toString(postfix));

        // ans[0] = postfix[1];
        // ans[nums.length-1] = prefix[nums.length-2];
        // for (int i=1; i < nums.length-1; i++){
        //     ans[i] = prefix[i-1] * postfix[i+1];
        // }
        // return ans;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int prefix = 1;
        int postfix = 1;
        int ans[] = new int[nums.length];
        for (int i=0; i < nums.length; i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }
        // System.out.println(Arrays.toString(ans));
        for (int i = nums.length-1; i >=0; i--){
            ans[i] *= postfix;
            postfix *= nums[i];
        }

        return ans;
    }
}