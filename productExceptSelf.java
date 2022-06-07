class Solution {
    //Time complexity: O(n)
    //Space complexity: O(n)
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=1;
        int rp=1;
        //left pass
        for(int i=1;i<n;i++){
            rp*=nums[i-1];
            res[i]=rp;
        }
        rp=1;
        //right pass
        for(int i=n-2;i>=0;i--){
            rp*=nums[i+1];
            res[i]*=rp;
        }
        return res;
    }
}