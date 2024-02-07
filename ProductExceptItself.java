//The algorithm initializes an array res and performs a left pass to calculate the product of elements to the left of each index. 
//It then performs a right pass to update res with the product of elements to the right. The final res array contains the product of all elements except the one at each index. 
//The time complexity is O(n), Space - O(1).
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int [] res = new int[n];
        res[0] = 1;
        int rp =1;
        for(int i=1;i<n;i++){
            rp = rp* nums[i-1];
            res[i]= rp;
        }
        rp =1;
        for(int i=n-2;i>0;i--){
            rp *= nums[i+1];
            res[i] = res[i]*rp;
        }
        return res;

    }
}