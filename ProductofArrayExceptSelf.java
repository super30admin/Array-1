//T(N)=O(N)
//S(N)=O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int lp=1;
        res[0]=1;
        for(int i=1;i<res.length;i++)
        {
            res[i]=res[i-1]*nums[i-1];
        }
        int rp=1;
        for(int i=res.length-2;i>=0;i--)
        {
            rp=rp*nums[i+1];
            res[i]=res[i]*rp;
        }
        return res;
        
    }
}