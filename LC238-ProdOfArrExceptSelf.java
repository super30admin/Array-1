class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int total = 1;
        boolean noZeros = true;
        boolean allZeros = true;
        
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