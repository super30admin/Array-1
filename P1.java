//time- o(n)
//space-o(1)
//passed in leetcode- yes
//issues faced?- no
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        res[0]=1;
        
        for(int i=1;i <nums.length;i++)//traversing from the left, keeping track of left product
        {
            res[i]= res[i-1]*nums[i-1];
        }
        int right_product= 1;
        for(int i = nums.length-1;i>=0;i--)
        {
            res[i]=res[i]*right_product;
            right_product= right_product* nums[i];
        }
        
        return res;
}
}