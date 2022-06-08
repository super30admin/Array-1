//time complexity:O(n)
//Space complexity:O(1)
//run on leetcode: yrs
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n= nums.length;
        int resultarray[]= new int[n];
        
        if(nums==null || nums.length==0)
            return resultarray;
        
        resultarray[0]=1;
        int rp=1;
        //through left array
        for(int i=1; i<n; i++){
            rp= rp* nums[i-1];
        resultarray[i]=rp;
        }
        //through right array
        rp=1;
        for(int i=n-2;i>=0;i--){
            rp = rp*nums[i+1];
        resultarray[i]= resultarray[i]*rp;
        }
        return resultarray;
        
        
    }
}