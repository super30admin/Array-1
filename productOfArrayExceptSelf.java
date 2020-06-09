// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//Here first we ran a loop from left to right where we found all the product to the left of the element and then we ran a loop from right to 
//left while doing the second interation we are not just adding the element we are multipying the element which is already present from the
// left to right iteration respectively.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length==0)return new int [0];
        int rp = 1;
        int temp = 1;
        int n = nums.length;
        int [] result = new int[n];
        for(int i=0;i<n;i++){
            rp = rp *temp;
            result[i] = rp;
            temp = nums[i];
        }
        rp=1;temp = 1;
        
        for(int i = n - 1; i >= 0;i--){
            rp = rp *temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }
        return result;
    }
}