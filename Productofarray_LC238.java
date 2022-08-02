 // Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] res = new int [len];
        //inital and first product is 1
        int pro=1;
        res[0]=1;
        //left products
        for(int i = 1; i<len;i++){
      pro = pro*nums[i-1];
            res[i]= pro;
        } 
        
        //right products * res
        pro=1;
        for(int i = len-2;i>=0;i--){
            pro=pro*nums[i+1];
            res[i] = res[i]*pro;
        }
        
        return res;
        
        
    }
}