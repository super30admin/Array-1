// Time Complexity :o(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :took the running sum except the 1st element from both left and right then mutiplied the corresponding index to get the final values.


// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int rp=1;
        int [] result =new int [n];
        result[0]=1;
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            result[i]=rp;
        }
        rp=1;
        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            result[i]=result[i]*rp;
        }
        return result;
    }
}