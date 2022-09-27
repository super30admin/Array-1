//time complexity: O(n)
//space complexity: O(n)



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int answer,rp=1;
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            rp=rp*nums[i-1];
            ans[i]=rp;
        }
        rp=1;
       
        for(int j=nums.length-2;j>=0;j--){
            rp=rp*nums[j+1];
            ans[j]=rp*ans[j];
        }
       
        return ans;
    }
}