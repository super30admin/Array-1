class Solution {
    public int[] productExceptSelf(int[] nums) {
        //APPROACH-1
      int n=nums.length;
      int[] res=new int[n];
      int rp=1;
      res[0]=1;
      for(int i=1;i<n;i++){
        rp=rp*nums[i-1];
      res[i]=rp;
      }
      rp=1;
      for(int i=n-2;i>=0;i--){
        rp=rp*nums[i+1];
        res[i]=res[i]*rp;
      }
      return res;
      
      
      //APPROACH-2
      
       /* int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        //prefix
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int suf=1;
        for(int i=n-2;i>=0;i--){
            suf=suf*nums[i+1];
            ans[i]*=suf;
        }
        return ans;*/
    }
}