// Time Complexity : O(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes

class Product {
    public int[] productExceptSelf(int[] nums) {

        int [] ans = new int[nums.length];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            // product till left of i
            ans[i] = ans[i-1]*nums[i-1];
        }
        int rp=1;
        for(int j=nums.length-2;j>=0;j--){
            rp = rp*nums[j+1];
            ans[j] = ans[j]*rp;
        }
        return ans;
    }
    
}