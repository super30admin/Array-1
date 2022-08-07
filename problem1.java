//Q238:Product of array except self
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: 
/*In left pass, we calculate the product of all the elements to the left of the selected number. 
Then in the right pass, we calculate the products of all the elements to the right of the selected number. 
Then, in the right pass, we multiply the running product at each element with the products stored in result array
(i.e. products obtained from left pass)
Thus by doing this we get space complexity of O(1), since we are using the same result array in both the passes. */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //check for null
        
        int n=nums.length;
        int[] result= new int[n];
        if(nums==null || nums.length==0) return result;
        int rp=1;
        result[0]=1; //first element is always 1 since there is nothing to the left
        //left pass
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            result[i]=rp;
        }
        //right pass
        rp=1;
        for(int j=n-2;j>=0;j--){
            rp=rp*nums[j+1];
            result[j]*=rp;
        }
        return result;
    }
}