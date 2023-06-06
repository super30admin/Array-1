// time = O(n), Space = O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {

        // NOTE: Division is not allowed

        // Approach: use one arrays to store left 
        // while estimating right product, update array directly

        int[] ans = new int[nums.length];

        ans[0] =1;
        for (int i=1; i<nums.length; i++) {
            ans[i] = ans[i-1]*nums[i-1];
        }

        // last index already have correct answer
        int runProd = 1;
        for (int i=nums.length-2; i>=0; i--) {
            runProd *= nums[i+1];
            ans[i] *= runProd;
        }


        return ans;
    }
}
/* 
// time = O(n), space O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {

        // NOTE: Division is not allowed

        // Approach: use two arrays to store left and right product for each idx and multiply each

        int[] lprod = new int[nums.length];
        int[] rprod = new int[nums.length];

        lprod[0] =1;
        for (int i=1; i<nums.length; i++) {
            lprod[i] = lprod[i-1]*nums[i-1];
        }

        rprod[nums.length-1] = 1;
        for (int i=nums.length-2; i>=0; i--) {
            rprod[i] = rprod[i+1]*nums[i+1];
        }

        for (int i=0; i<nums.length; i++) {
            rprod[i] = rprod[i] * lprod[i]; 
        }

        return rprod;
    }
}
*/

/* Solution, when division is allowed. But in this question, division is not allowed */
/*
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int total = 1;
        boolean noZeros = true;
        
        for (int i=0; i<nums.length; i++) {
            int val = nums[i];
            if (val!=0) {
                total *= val;
            }
            else{ 
                if (noZeros) noZeros = false;
                else total = 0;
            }
        }
                
        for (int i=0; i<nums.length; i++) {
            
            // non zero, and noZero -> total/ele
            if (nums[i] != 0) {
                if (noZeros) nums[i] = total/nums[i];
                // non zero, and !noZero -> 0
                else nums[i] = 0;
            }
            else {
            // zero -> total 
                nums[i] = total;
            }

            
            
        }
        
        return nums;
        
    }
}
*/