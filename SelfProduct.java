//Using Running Product

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        
        if(nums == null || nums.length == 0)
            return left;
        
        int rp = 1;
        left[0] = 1;
        
        //create the left array
        for(int i=1; i<nums.length; i++){
            rp = rp * nums[i-1];
            left[i] = rp;
        }
        
        //reset rp = 1 and compute the right side
        rp = 1;
        for(int i=nums.length-2; i>=0; i--){
            rp = rp * nums[i+1];
            left[i] = left[i] * rp;
        }
        return left;
    }
}

//Time Complexity :O(n)
//Space Complexity :O(1)