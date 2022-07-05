// TC : O(n)
// SC : O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[] {};
        
        int n = nums.length;
        int[] result = new int[n];
        int rp=1;
        // rp before 1st element is 1
        result[0]=1;
        // finding left rp
        for(int i =1;i<n;i++){
            rp = rp * nums[i-1];
            result[i]=rp;
        }
        rp=1;
        // finding right rp and mutiplying by left rp
        for(int i=n-2;i>=0;i--){
            rp =rp*nums[i+1];
            result[i] = rp* result[i];
        }
        return result;
    }
}
