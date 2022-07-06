//Amazon interview question
//Time complexity = O(n)
//Space complexity = O(1)
//Greedy approach: multiply all the indexes and divide by current index.But division is not allowed so cannot use Greedy approach.

//optimize approach: consider the running product at initial = 1 and ex: given array [24,12,8,6] so the left approach result by indexes andp.
//nums of left array storing = [1,2,4,3] rp = 1*1*2*3
//result =[1,1,2,6] then rp [1*4*3*2] => [24,12,8,6] so for left to right consider from n-2 because n-1 is already there.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[] {};
        
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;//running product =1 initial starts
        result[0] = 1;
        for(int i=1;i<n;i++){
            rp = rp*nums[i-1];//nums[i-1] is last index value in given array
            result[i] = rp;
        }
        rp =1;
        for(int i=n-2;i>=0;i--){//nums[i-2] is last to secondindexvalue in given array
            rp = rp*nums[i+1];
            result[i] = rp*result[i];
        }
        return result;   
    }
}