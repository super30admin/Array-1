//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //base case
        if(nums==null||nums.length==0)
            return new int[]{};
        int n=nums.length;
        //to store the result
        int[] product=new int[n];
        //for running product
        int runningP=1;
        //initialize the 1st element in the product array as 1
        product[0]=1;
        //iterating from 2nd element for the left array [1,1,2,6]
        for(int i=1;i<n;i++){
            runningP=runningP*nums[i-1];
            product[i]=runningP;
        }
        //reset the runningP
        runningP=1;
        for(int i=n-2;i>=0;i--){
            //for the right array, we use the previous product*runningP
            runningP=runningP*nums[i+1];
            product[i]=product[i]*runningP;
        }
        return product;
    }
}