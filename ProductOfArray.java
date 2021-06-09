//time complexity:O(n)
//Space complxity:O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        if(nums==null||n==0) return res;
        
        int rp=1;
        res[0]=1;
        
        for(int i=1;i<n;i++)
        {
            rp=rp*nums[i-1];
            res[i]=rp;//storing the product of the elements except the last element
        }//from left to right in res array
        //[1,1,2,6]
        rp=1;
        for(int i=n-2;i>=0;i--)
        {
            rp=rp*nums[i+1];
            res[i]=res[i]*rp;//moving right to left we multiply the elements of nums 
            //with the res array elements except the last element in the res
        }
        return res;
    }
}
